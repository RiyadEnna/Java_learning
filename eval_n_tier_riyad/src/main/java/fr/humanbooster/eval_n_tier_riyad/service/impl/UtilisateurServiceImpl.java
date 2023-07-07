package fr.humanbooster.eval_n_tier_riyad.service.impl;

import java.sql.SQLException;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import fr.humanbooster.eval_n_tier_riyad.business.Utilisateur;
import fr.humanbooster.eval_n_tier_riyad.dao.UtilisateurDao;
import fr.humanbooster.eval_n_tier_riyad.dao.impl.UtilisateurDaoImpl;
import fr.humanbooster.eval_n_tier_riyad.service.UtilisateurService;

public class UtilisateurServiceImpl implements UtilisateurService {
	UtilisateurDao utilisateurDao = new UtilisateurDaoImpl();

	@Override
	public Utilisateur ajouterUtilisateurService(String nom, String prenom, LocalDateTime dateNaissance) {
		Utilisateur utilisateur = new Utilisateur(nom, prenom, dateNaissance);
		try {
			utilisateurDao.ajouterUtilisateur(utilisateur);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return utilisateur;
	}

	@Override
	public Utilisateur recupererUtilisateurParIdService(Long id) {
		try {
			return utilisateurDao.recupererUtilisateurParId(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Utilisateur modifierUtilisateurService(Utilisateur utilisateur) {
		try {
			utilisateurDao.modifierUtilisateur(utilisateur);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return utilisateur;
	}

	@Override
	public List<Utilisateur> recupererListeUtilisateurParDateNaissanceService() {
		try {
		return utilisateurDao.recupererListeUtilisateurParDateNaissance();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	@Override
	public boolean supprimerUtilisateurService(Long id) {
		try {
			return utilisateurDao.supprimerUtilisateur(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
