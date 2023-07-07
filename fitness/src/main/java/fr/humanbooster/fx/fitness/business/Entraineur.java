package fr.humanbooster.fx.fitness.business;

public class Entraineur extends Personne{

	private String numeroDeTelephone;
	
    public Entraineur(String nom, String prenom, String numeroDeTelephone) {
		super(nom, prenom);
		this.numeroDeTelephone = numeroDeTelephone;
	}

	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}

	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}

	@Override
	public String toString() {
		return "Entraineur [numeroDeTelephone=" + numeroDeTelephone + ", id=" + id + ", nom=" + nom + ", prenom="
				+ prenom + "]";
	}

}
