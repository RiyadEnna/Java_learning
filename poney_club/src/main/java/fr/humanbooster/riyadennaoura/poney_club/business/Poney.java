package fr.humanbooster.riyadennaoura.poney_club.business;

public class Poney {
	private String nomPoney;
	
	public Poney(String nomPoney) {
		this.nomPoney = nomPoney;
	}
	
	public String getNomPoney() {
		return nomPoney;		
	}
	
	public void setNomPoney(String nomPoney) {
		this.nomPoney = nomPoney;
	}

	@Override
	public String toString() {
		return "Poney [nomPoney=" + nomPoney + "]";
	}
	
	
}
