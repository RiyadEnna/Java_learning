package fr.hb.business;

public class Article {
	//attribut
	private Long id;
	private String nom;
	private Float prix;
	private Long compteur = 0L;
	//constructeur
    public Article() {
        super();
        id = ++compteur;
    }

// surcharges de constructeurs

    public Article(String nom) {
        this();
        this.nom = nom;
    }

    public Article(Float prix,String nom) {
        this(nom);
        this.prix = prix;
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

	public Float getPrix() {
		return prix;
	}

	public void setPrix(Float prix) {
		this.prix = prix;
	}
	//to string
	@Override
	public String toString() {
		return "Article [id=" + id + ", nom=" + nom + ", prix=" + prix + "]";
	}
    

	
	
}
