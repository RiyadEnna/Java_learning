package fr.humanbooster.riyadennaoura.poney_club.builder.impl;

import java.util.ArrayList;
import java.util.List;

import fr.humanbooster.riyadennaoura.poney_club.builder.EquipementBuilder;
import fr.humanbooster.riyadennaoura.poney_club.business.Equipement;
import fr.humanbooster.riyadennaoura.poney_club.business.Stage;

public class EquipementBuilderImpl implements EquipementBuilder {
    private Equipement equipement;
    private Stage stage;
    private static List<Equipement> equipements = new ArrayList<>();

    public EquipementBuilderImpl() {
    	stage = new Stage();
        equipement = new Equipement();                
        ajouterEquipementsInitiaux();
    }

    private void ajouterEquipementsInitiaux() {
        equipements.add(new Equipement("Couvre reins violet", 2));
        equipements.add(new Equipement("Couvre reins rose", 2));
        equipements.add(new Equipement("Couvre reins bleu", 2));
        equipements.add(new Equipement("Selle en cuir de buffle", 4));
        equipements.add(new Equipement("Selle en matière synthetique", 2));
        equipements.add(new Equipement("Bride rose", 3));
        equipements.add(new Equipement("Bride bleu", 3));
        equipements.add(new Equipement("Renes roses", 3));
        equipements.add(new Equipement("Renes noirs", 3));
    }

    @Override
    public EquipementBuilder choisirEquipement() {
        return this;
    }

    @Override
    public EquipementBuilder ajouterEquipement(String nomEquipement, int stockEquipement) {
        Equipement equipement = new Equipement(nomEquipement, stockEquipement);
        this.stage.getCollectionDequipement().add(equipement);
        return this;
    }

    @Override
    public Equipement getEquipement() {
        return equipement;
    }

    @Override
    public void setEquipement(Equipement equipement) {
        this.equipement = equipement;
    }

    @Override
    public Equipement build() {
        return equipement;
    }
    
    public  List<Equipement> getStageEquipement(){
    	return this.stage.getCollectionDequipement();
    }

    public static List<Equipement> getEquipements() {
        return equipements;
    }

}