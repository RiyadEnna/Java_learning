package fr.hb.business;


public class Ligne {
     // attributes


    private Document document /* = new Document() */;
    private Article article = new Article();
    private float quantite;
    private Float remise;

     // constructors

    public Ligne(Document document, Article article,float quantite) {
        super();
        this.document = document;
        this.article = article;
        this.quantite = quantite;
        // liaison document et article
        document.getLignes().add(this);

    }

    public Ligne(Document document, Article article,float quantite, Float remise) {
        this(document,article,quantite);
        this.remise = remise;

    }

    // getters setters

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public float getQuantite() {
        return quantite;
    }

    public void setQuantite(float quantite) {
        this.quantite = quantite;
    }

    public Float getRemise() {
        return remise;
    }

    public void setRemise(Float remise) {
        this.remise = remise;
    }

    // toString
	@Override
	public String toString() {
		return "Lignes [article=" + article + ", quantite=" + quantite + ", remise=" + remise + "]";
	}








}