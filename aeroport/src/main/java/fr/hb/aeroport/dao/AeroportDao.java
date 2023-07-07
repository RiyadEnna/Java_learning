package fr.hb.aeroport.dao;

import java.sql.SQLException;
import java.util.List;

import fr.hb.aeroport.business.Aeroport;

public interface AeroportDao {
	
	Aeroport createAeroport(Aeroport aeroport) throws SQLException;
		
	Aeroport recupererAeroportParId(Long id) throws SQLException;
	
	Aeroport updateAeroport(Aeroport aeroport) throws SQLException;


	List<Aeroport> recupererAeroport() throws SQLException;
	
	boolean deleteAeroport(Long id) throws SQLException;

	
	
}
