package fr.hb.aeroport.service;

import java.time.LocalDateTime;
import java.util.List;

import fr.hb.aeroport.business.Vol;

public interface VolService {
	Vol ajouterVol(LocalDateTime dateHeureDepart, LocalDateTime dateHeureArrivee, float prixEnEuros, long idCompagnie,
            long idAeroportDepart, long idAeroportArrivee);

    List<Vol> recupererVolsTrieParPrix();
    
    Vol modifierVol (Vol vol);
}
