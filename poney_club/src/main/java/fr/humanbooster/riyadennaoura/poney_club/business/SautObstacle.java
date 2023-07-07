package fr.humanbooster.riyadennaoura.poney_club.business;

import fr.humanbooster.riyadennaoura.poney_club.decorator.StageDecorator;

public class SautObstacle extends StageDecorator {
	private static final float PRIX = 40f;

	public SautObstacle(Stage stage) {
		super(stage);
		super.setPrix(stage.getPrix() + PRIX);
		super.setCavalier(stage.getCavalier());
		super.setPoney(stage.getPoney());
		super.setCodeStage(stage.getCodeStage());
		super.setCollectionDequipement(stage.getCollectionDequipement());
		super.setnomActivite(stage.getnomActivite() + " " + this.getClass().getSimpleName());

	}
}

