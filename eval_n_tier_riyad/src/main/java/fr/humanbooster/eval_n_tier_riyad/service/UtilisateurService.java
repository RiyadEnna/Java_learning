package fr.humanbooster.eval_n_tier_riyad.service;

import java.time.LocalDateTime;
import java.util.List;

import fr.humanbooster.eval_n_tier_riyad.business.Utilisateur;

public interface UtilisateurService {
	Utilisateur ajouterUtilisateurService(String nom, String prenom, LocalDateTime dateNaissance);
	
	Utilisateur recupererUtilisateurParIdService(Long id);
	
	Utilisateur modifierUtilisateurService(Utilisateur utilisateur);

	List<Utilisateur> recupererListeUtilisateurParDateNaissanceService();
	
	boolean supprimerUtilisateurService(Long id) ;
}
