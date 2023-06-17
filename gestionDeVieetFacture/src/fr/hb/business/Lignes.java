package fr.hb.business;

public class Lignes {
	//attribut
	public Float quantite;
	public Float remise;
    private Documents document;
	private Article article  = new Article();
	//constructeur
	public Lignes(Float quantite, Article article,Documents document) {
		super();
		this.quantite = quantite;
		this.article = article;
		//lié ligne au documents
		this.document = document;
		document.getLignes().add(this)
	}
	
	public Lignes(Float quantite, Article article,Documents document,Float remise) {
		this(quantite,article,document);
		this.remise = remise;
	}
	
	//get set
	public Float getQuantite() {
		return quantite;
	}

	public void setQuantite(Float quantite) {
		this.quantite = quantite;
	}

	public Float getRemise() {
		return remise;
	}

	public void setRemise(Float remise) {
		this.remise = remise;
	}

	public Documents getDocument() {
		return document;
	}

	public void setDocument(Documents document) {
		this.document = document;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	//to String

	@Override
	public String toString() {
		return "Lignes [quantite=" + quantite + ", remise=" + remise + ", document=" + document + ", article=" + article
				+ "]";
	}



	
}
