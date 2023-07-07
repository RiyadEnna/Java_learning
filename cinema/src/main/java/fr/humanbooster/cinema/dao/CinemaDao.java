package fr.humanbooster.cinema.dao;

import java.sql.SQLException;
import java.util.List;

import fr.humanbooster.cinema.business.Cinema;


public interface CinemaDao {
	Cinema ajoutCinema(Cinema cinema) throws SQLException;
	
	Cinema trouverCinemaParId(Long id) throws SQLException;
	
	Cinema mettreAJourCinema(Cinema cinema) throws SQLException;

	List<Cinema> trouverToutCinemaTrierParNom() throws SQLException;
	
	boolean supprCinema(Long id) throws SQLException;
}
