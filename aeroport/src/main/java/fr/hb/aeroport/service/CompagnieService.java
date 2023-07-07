package fr.hb.aeroport.service;

import java.util.List;

import fr.hb.aeroport.business.Compagnie;

public interface CompagnieService {
	Compagnie ajouterCompagnie(String nom);

    Compagnie recupererCompagnieParId(Long id);

    List<Compagnie> recupererToutesCompagnies();
    
    boolean supprimerCompagnie(Long id);
}
