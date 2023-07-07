package fr.humanbooster.eval_n_tier_riyad.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import fr.humanbooster.eval_n_tier_riyad.business.Utilisateur;
import fr.humanbooster.eval_n_tier_riyad.dao.ConnexionBdd;
import fr.humanbooster.eval_n_tier_riyad.dao.Requetes;
import fr.humanbooster.eval_n_tier_riyad.dao.UtilisateurDao;

public class UtilisateurDaoImpl implements UtilisateurDao {

	private Connection connection;

	public UtilisateurDaoImpl() {
		try {
			connection = ConnexionBdd.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(Requetes.AJOUT_UTILISATEUR, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, utilisateur.getNom());
		ps.setString(2, utilisateur.getPrenom());
		ps.setTimestamp(3, Timestamp.valueOf(utilisateur.getDateNaissance()));
		ps.executeUpdate();

		ResultSet rs = ps.getGeneratedKeys();
		rs.next();
		utilisateur.setId(rs.getLong(1));
		return utilisateur;
	}

	@Override
	public Utilisateur recupererUtilisateurParId(Long id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(Requetes.TROUVER_UTILISATEUR_PAR_ID);
		ps.setLong(1, id);

		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			Utilisateur utilisateur = new Utilisateur();
			utilisateur.setId(rs.getLong("id"));
			utilisateur.setNom(rs.getString("nom"));
			utilisateur.setPrenom(rs.getString("prenom"));
			utilisateur.setDateNaissance(rs.getTimestamp("dateNaissance").toLocalDateTime());
			return utilisateur;
		}
		return null;
	}

	@Override
	public Utilisateur modifierUtilisateur(Utilisateur utilisateur) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(Requetes.METTRE_A_JOUR_UTILISATEUR);
		ps.setString(1, utilisateur.getNom());
		ps.setString(2, utilisateur.getPrenom());
		ps.setTimestamp(3, Timestamp.valueOf(utilisateur.getDateNaissance()));
		ps.setLong(4, utilisateur.getId());
		ps.executeUpdate();
		return utilisateur;
	}

	@Override
	public List<Utilisateur> recupererListeUtilisateurParDateNaissance() throws SQLException {
		List<Utilisateur> utilisateurs = new ArrayList<>();
		PreparedStatement ps = connection.prepareStatement(Requetes.TROUVER_UTILISATEUR_ALL_ORDER_BY_DATA_NAISSANCE);
		ResultSet rs = ps.executeQuery();

		while(rs.next()) {
			Utilisateur utilisateur = new Utilisateur();
			utilisateur.setId(rs.getLong("id"));
			utilisateur.setNom(rs.getString("nom"));
			utilisateur.setPrenom(rs.getString("prenom"));
			utilisateur.setDateNaissance(rs.getTimestamp("dateNaissance").toLocalDateTime());
			utilisateurs.add(utilisateur);
		}
		return utilisateurs;
	}

	@Override
	public boolean supprimerUtilisateur(Long id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(Requetes.SUPPR_UTILISATEUR_PAR_ID);
		ps.setLong(1,id);
		return ps.execute()	;
	}

}
