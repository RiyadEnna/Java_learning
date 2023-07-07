package fr.humanbooster.riyadennaoura.poney_club.builder;

import java.util.List;

import fr.humanbooster.riyadennaoura.poney_club.business.Equipement;

public interface EquipementBuilder {
	
	EquipementBuilder choisirEquipement();
	
	EquipementBuilder ajouterEquipement(String nomEquipement, int stockEquipement);
	
	List<Equipement> getStageEquipement();

	Equipement getEquipement();

	void setEquipement(Equipement equipement);
    
	Equipement build();

}
