package fr.hb.aeroport.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.hb.aeroport.business.Compagnie;
import fr.hb.aeroport.dao.CompagnieDao;
import fr.hb.aeroport.dao.ConnexionBdd;
import fr.hb.aeroport.dao.Requetes;

public class CompagnieDaoImpl implements CompagnieDao{
	
	private Connection connection;
	
	public CompagnieDaoImpl() {
		try {
			connection = ConnexionBdd.getConnection();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}


	@Override
	public Compagnie createCompagnie(Compagnie compagnie) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(Requetes.REQUETE_AJOUT_COMPAGNIE,Statement.RETURN_GENERATED_KEYS);
		
		ps.setString(1, compagnie.getNom());
		ps.executeUpdate();
		
		ResultSet rs = ps.getGeneratedKeys();
		rs.next();
		compagnie.setId(rs.getLong(1));
		return compagnie;		
	}

	@Override
	public Compagnie findOneCompagnieById(long id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(Requetes.REQUETE_SELECTION_COMPAGNIE_PAR_ID);
		ps.setLong(1,id);

		
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			Compagnie compagnie = new Compagnie();
			compagnie.setId(rs.getLong("id"));
			compagnie.setNom(rs.getString("nom"));
			return compagnie;
		}
		return null;
	}

	@Override
	public List<Compagnie> findAllCompagnies() throws SQLException {
		List<Compagnie> compagnies = new ArrayList<>();
		PreparedStatement ps = connection.prepareStatement(Requetes.REQUETE_SELECTION_COMPAGNIE_ALL);
		ResultSet rs = ps.executeQuery();

		while(rs.next()) {
			Compagnie compagnie = new Compagnie();
			compagnie.setId(rs.getLong("id"));
			compagnie.setNom(rs.getString("nom"));
			compagnies.add(compagnie);
		}
		return compagnies;
	}

	@Override
	public boolean delete(Long id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(Requetes.REQUETE_SUPPRESSION_COMPAGNIE);
		ps.setLong(1,id);
		return ps.execute()	;
	}

}
