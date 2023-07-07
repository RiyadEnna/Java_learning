package fr.hb.fitness.Riyad.business;

public class Tapis {
	private Long id;
	private String nom;
	private static Long compteur = 0L;	
	//contructeur je me dit que l'on peut avoir un tapis sans nom
	public Tapis() {
		super();
		id = ++compteur;
	}
	
    public Tapis(String nom) {
        this();
        this.nom = nom;
    }

	//get set
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}	
	//to string
	@Override
	public String toString() {
		return "Tapis [id=" + id + ", nom=" + nom + "]";
	}
	

	
	

	
}
