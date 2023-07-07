package fr.humanbooster.cinema.service.impl;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import fr.humanbooster.cinema.business.Cinema;
import fr.humanbooster.cinema.dao.CinemaDao;
import fr.humanbooster.cinema.dao.impl.CinemaDaoImpl;
import fr.humanbooster.cinema.service.CinemaService;

public class CinemaServiceImpl implements CinemaService {
	CinemaDao cinemaDao = new CinemaDaoImpl();

	@Override
	public Cinema ajoutCinemaService(String nom, LocalDateTime heureOuverture, LocalDateTime heureFermeture) {
		Cinema cinema = new Cinema(nom, heureOuverture, heureFermeture);
		try {
			cinemaDao.ajoutCinema(cinema);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Cinema trouverCinemaParIdService(Long id) {
		try {
			return cinemaDao.trouverCinemaParId(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Cinema mettreAJourCinemaService(Cinema cinema) {
		try {
			return cinemaDao.mettreAJourCinema(cinema);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cinema> trouverToutCinemaTrierParNomService() {
		try {
		return cinemaDao.trouverToutCinemaTrierParNom();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	@Override
	public boolean supprCinemaService(Long id) {
		try {
			return cinemaDao.supprCinema(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
