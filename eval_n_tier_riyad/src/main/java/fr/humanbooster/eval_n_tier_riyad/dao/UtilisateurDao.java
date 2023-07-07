package fr.humanbooster.eval_n_tier_riyad.dao;

import java.sql.SQLException;
import java.util.List;

import fr.humanbooster.eval_n_tier_riyad.business.Utilisateur;


public interface UtilisateurDao {
	Utilisateur ajouterUtilisateur(Utilisateur utilisateur) throws SQLException;
	
	Utilisateur recupererUtilisateurParId(Long id) throws SQLException;
	
	Utilisateur modifierUtilisateur(Utilisateur utilisateur) throws SQLException;

	List<Utilisateur> recupererListeUtilisateurParDateNaissance() throws SQLException;
	
	boolean supprimerUtilisateur(Long id) throws SQLException;
}
