package fr.humanbooster.riyadennaoura.poney_club.business;

public class Cavalier {
	private String prenom;
	
	public Cavalier(String prenom) {
		this.prenom = prenom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Cavalier [prenom=" + prenom + "]";
	}

	
}
