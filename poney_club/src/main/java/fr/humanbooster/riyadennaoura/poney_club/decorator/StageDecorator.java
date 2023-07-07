package fr.humanbooster.riyadennaoura.poney_club.decorator;

import fr.humanbooster.riyadennaoura.poney_club.business.Stage;
public abstract class StageDecorator extends Stage {
    private Stage stage;

    public StageDecorator(Stage stage) {
    	super();
        this.stage = stage;
    }

	@Override
	public String toString() {
		return "StageDecorator [ getCodeStage()=" + getCodeStage()
				+ ", getCavalier()=" + getCavalier() + ", getPrix()=" + getPrix() + ", getPoney()=" + getPoney()
				+ ", getCollectionDequipement()=" + getCollectionDequipement() + ", getActivite()=" + getnomActivite() +"]";
	}
}
