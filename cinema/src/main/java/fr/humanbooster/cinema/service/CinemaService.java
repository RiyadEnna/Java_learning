package fr.humanbooster.cinema.service;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import fr.humanbooster.cinema.business.Cinema;

public interface CinemaService {
	Cinema ajoutCinemaService(String nom,LocalDateTime heureOuverture,LocalDateTime heureFermeture) throws SQLException;
	
	Cinema trouverCinemaParIdService(Long id) throws SQLException;
	
	Cinema mettreAJourCinemaService(Cinema cinema) throws SQLException;

	List<Cinema> trouverToutCinemaTrierParNomService() throws SQLException;
	
	boolean supprCinemaService(Long id) throws SQLException;
}
