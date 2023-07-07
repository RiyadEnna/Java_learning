package fr.hb.aeroport.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import java.util.ArrayList;
import java.util.List;


import fr.hb.aeroport.business.Vol;
import fr.hb.aeroport.dao.AeroportDao;

import fr.hb.aeroport.dao.ConnexionBdd;
import fr.hb.aeroport.dao.Requetes;
import fr.hb.aeroport.dao.VolDao;

public class VolDaoImpl implements VolDao {

	private Connection connection;	
	private AeroportDao aeroportDao = new AeroportDaoImpl();

	
	public VolDaoImpl() {
		try {
			connection = ConnexionBdd.getConnection();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Vol createflight(Vol vol) throws SQLException {
		//preparation
		PreparedStatement ps = connection.prepareStatement(Requetes.REQUETE_AJOUT_VOL,Statement.RETURN_GENERATED_KEYS);
		ps.setTimestamp(1,Timestamp.valueOf(vol.getHeureArrive()));
		ps.setTimestamp(2,Timestamp.valueOf(vol.getHeureDepart()));
		ps.setLong(3,vol.getCompagnie().getId());
		ps.setFloat(4, vol.getPrix());
		ps.setLong(5, vol.getAeroportDepart().getId());
		ps.setLong(6, vol.getAeroportDepart().getId());
		//execution
		ps.executeUpdate();
		//retour
		ResultSet rs = ps.getGeneratedKeys();
		rs.next();
		vol.setId(rs.getLong(1));
		return vol;
	}
	

	@Override
	public List<Vol> findAllFlightsOrderByPrice() throws SQLException {
		List<Vol> vols = new ArrayList<>();
		PreparedStatement ps = connection.prepareStatement(Requetes.REQUETE_SELECTION_TOUT_VOL_TRIER);
		ResultSet rs = ps.executeQuery();

		while(rs.next()) {
			Vol vol = new Vol();
			vol.setId(rs.getLong("id"));
			vol.setAeroportDepart(aeroportDao.recupererAeroportParId(rs.getLong("Id_Aeroport_Depart")));
			vol.setAeroportArrive(aeroportDao.recupererAeroportParId(rs.getLong("Id_Aeroport_Arrive")));
			vol.setHeureDepart(rs.getTimestamp("dateHeuredepart").toLocalDateTime());
			vol.setHeureArrive(rs.getTimestamp("dateHeuredepart").toLocalDateTime());
			vol.setPrix(rs.getFloat("PrixEnEuro"));			
			vols.add(vol);
		}
		return vols;
	}
	

	@Override
	public Vol updateVol(Vol vol) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(Requetes.REQUETE_MISE_A_JOUR_VOL);
		ps.setTimestamp(1,Timestamp.valueOf(vol.getHeureArrive()));
		ps.setTimestamp(2,Timestamp.valueOf(vol.getHeureDepart()));
		ps.setLong(3,vol.getCompagnie().getId());
		ps.setFloat(4, vol.getPrix());
		ps.setLong(5, vol.getAeroportDepart().getId());
		ps.setLong(6, vol.getAeroportArrive().getId());
		ps.setLong(7, vol.getId());
		return vol;
	}

}
