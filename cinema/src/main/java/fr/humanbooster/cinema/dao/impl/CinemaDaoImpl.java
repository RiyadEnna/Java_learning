package fr.humanbooster.cinema.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


import fr.humanbooster.cinema.business.Cinema;
import fr.humanbooster.cinema.dao.CinemaDao;
import fr.humanbooster.cinema.dao.ConnexionBdd;
import fr.humanbooster.cinema.dao.Requetes;

public class CinemaDaoImpl implements CinemaDao {

	private Connection connection;

	public CinemaDaoImpl() {
		try {
			connection = ConnexionBdd.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Cinema ajoutCinema(Cinema cinema) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(Requetes.AJOUT_CINEMA, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, cinema.getNom());
		ps.setTimestamp(2, Timestamp.valueOf(cinema.getHeureOuverture()));
		ps.setTimestamp(3, Timestamp.valueOf(cinema.getHeureFermeture()));
		ps.executeUpdate();
		ResultSet rs = ps.getGeneratedKeys();
		rs.next();
		cinema.setId(rs.getLong(1));
		return cinema;
	}

	@Override
	public Cinema trouverCinemaParId(Long id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(Requetes.TROUVER_CINEMA_PAR_ID);
		ps.setLong(1, id);

		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			Cinema cinema = new Cinema();
			cinema.setId(rs.getLong("id"));
			cinema.setNom(rs.getString("nom"));
			cinema.setHeureFermeture(rs.getTimestamp("heureFermeture").toLocalDateTime());
			cinema.setHeureOuverture(rs.getTimestamp("heureOuverture").toLocalDateTime());
			return cinema;
		}
		return null;
	}

	@Override
	public Cinema mettreAJourCinema(Cinema cinema) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(Requetes.METTRE_A_JOUR_CINEMA);
		ps.setString(1, cinema.getNom());
		ps.setLong(4, cinema.getId());
		ps.setTimestamp(2,Timestamp.valueOf(cinema.getHeureOuverture()));
		ps.setTimestamp(3,Timestamp.valueOf(cinema.getHeureFermeture()));
		ps.executeUpdate();
		return cinema;
	}

	@Override
	public List<Cinema> trouverToutCinemaTrierParNom() throws SQLException {
		List<Cinema> cinemas = new ArrayList<>();
		PreparedStatement ps = connection.prepareStatement(Requetes.TROUVER_CINEMA_ALL_ORDER_BY_NOM);
		ResultSet rs = ps.executeQuery();

		while(rs.next()) {
			Cinema cinema = new Cinema();
			cinema.setId(rs.getLong("id"));
			cinema.setNom(rs.getString("nom"));
			cinema.setHeureFermeture(rs.getTimestamp("heureFermeture").toLocalDateTime());
			cinema.setHeureOuverture(rs.getTimestamp("heureOuverture").toLocalDateTime());
			cinemas.add(cinema);
		}
		return cinemas;
	}

	@Override
	public boolean supprCinema(Long id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(Requetes.SUPPR_CINEMA_PAR_ID);
		ps.setLong(1,id);
		return ps.execute()	;
	}

}
