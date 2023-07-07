package fr.hb.aeroport.dao;

import java.sql.SQLException;
import java.util.List;

import fr.hb.aeroport.business.Vol;

public interface VolDao {
    Vol createflight(Vol vol) throws SQLException;

    List<Vol> findAllFlightsOrderByPrice() throws SQLException;

    Vol updateVol (Vol vol) throws SQLException;
    

}
