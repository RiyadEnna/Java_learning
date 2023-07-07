package fr.hb.aeroport.dao;

import java.sql.SQLException;
import java.util.List;

import fr.hb.aeroport.business.Compagnie;


public interface CompagnieDao {
	
    Compagnie createCompagnie(Compagnie compagnie) throws SQLException;

    Compagnie findOneCompagnieById(long id) throws SQLException;

    List<Compagnie> findAllCompagnies() throws SQLException;

    boolean delete(Long id) throws SQLException;
}
