package fr.hb.aeroport.service;

import java.util.List;

import fr.hb.aeroport.business.Aeroport;

public interface AeroportService {
	Aeroport ajouterAeroport(String nom);

    Aeroport recupererAeroportParId(long id);

    List<Aeroport> recupererTousLesAeroports();
    
    Aeroport modifierAeroport (Aeroport aeroport);
    
    boolean deleteAeroport (Long id);
}
