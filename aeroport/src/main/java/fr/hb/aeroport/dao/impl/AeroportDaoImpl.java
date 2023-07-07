package fr.hb.aeroport.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

import fr.hb.aeroport.business.Aeroport;
import fr.hb.aeroport.dao.AeroportDao;
import fr.hb.aeroport.dao.ConnexionBdd;
import fr.hb.aeroport.dao.Requetes;


public class AeroportDaoImpl implements AeroportDao {
	
	private Connection connection;
	
	public AeroportDaoImpl() {
		try {
			connection = ConnexionBdd.getConnection();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Aeroport createAeroport(Aeroport aeroport) throws SQLException {
		//cyble la requete à modifier et prepare la requête à modifier.
		//Statement.RETURN_GENERATED_KEYS laisse la base de donner generer l'id mais nous laisse le recuperer
		PreparedStatement ps = connection.prepareStatement(Requetes.REQUETE_AJOUT_AEROPORT,Statement.RETURN_GENERATED_KEYS);
		
		ps.setString(1, aeroport.getNom());
		ps.executeUpdate();
		
		ResultSet rs = ps.getGeneratedKeys();
		rs.next();
		aeroport.setId(rs.getLong(1));
		return aeroport;
	}

	@Override
	public Aeroport recupererAeroportParId(Long id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(Requetes.REQUETE_SELECTION_AEROPORT_PAR_ID);
		ps.setLong(1,id);

		
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			Aeroport aeroport = new Aeroport();
			aeroport.setId(rs.getLong("id"));
			aeroport.setNom(rs.getString("nom"));
			return aeroport;
		}
		return null;
	}

	@Override
	public List<Aeroport> recupererAeroport() throws SQLException {
		List<Aeroport> aeroports = new ArrayList<>();
		PreparedStatement ps = connection.prepareStatement(Requetes.REQUETE_SELECTION_AEROPORT_ALL);
		ResultSet rs = ps.executeQuery();

		while(rs.next()) {
			Aeroport aeroport = new Aeroport();
			aeroport.setId(rs.getLong("id"));
			aeroport.setNom(rs.getString("nom"));
			aeroports.add(aeroport);
		}
		return aeroports;
	}

	@Override
	public Aeroport updateAeroport(Aeroport aeroport) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(Requetes.REQUETE_MISE_A_JOUR_NOM_AEROPORT);
		ps.setLong(2, aeroport.getId());
		ps.setString(1, aeroport.getNom());
		ps.executeUpdate();
		return aeroport;	
	}

	@Override
	public boolean deleteAeroport(Long id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(Requetes.REQUETE_SUPPRESSION_AEROPORT);
		ps.setLong(1,id);
		return ps.execute()	;	
	}

}
