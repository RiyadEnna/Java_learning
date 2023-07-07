package fr.hb.fitness.Riyad.business;

public class Entraineur extends Personne {

	//attribut
	private String numeroDeTelephone;
	//je construit un entraineur sans numero de tel
	public Entraineur(String nom, String prenom) {
		super(nom, prenom);
	}
	//surcharge de me classe entraineur pour ajouter un numero de telephone
	public Entraineur(String nom, String prenom,String numeroDetelephone) {
		this(nom,prenom);
		this.numeroDeTelephone =numeroDetelephone;
	}
	
	//get set
	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}
	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}	
	
	//to string
	@Override
	public String toString() {
		return "Entraineur [id :"+ getId()+" ,nom= "+getNom() +"numeroDeTelephone=" + numeroDeTelephone + "]";
	}
	

	
	

	
}
