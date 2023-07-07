package fr.hb.business;

import java.util.ArrayList;
import java.util.List;

public class Client {
	//attributs
	private Long id;
	private String nom; 
	private static Long compteur = 0L; 
	private Ville ville  = new Ville();
	private List<Document> documents;
	
	//constructeur
	public Client(String nom) {
		super();
		id =++compteur;
		this.nom = nom;	
		documents = new ArrayList<>();
	}


	public Client(String nom, Ville ville) {
		this(nom);
		this.ville=ville;
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

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	
	//toString
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", compteur=" + compteur + ", ville=" + ville + ", documents="
				+ documents + "]";
	}
	
	
	
	
	
}
