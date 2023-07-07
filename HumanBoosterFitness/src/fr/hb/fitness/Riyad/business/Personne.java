package fr.hb.fitness.Riyad.business;

import java.util.ArrayList;

public abstract class Personne {
	//attribut
	private Long id;
	private String nom;
	private String prenom;
	private static Long compteur = 0L;
	//constructeur
	public Personne(String nom,String prenom) {
		super();
		id =++compteur;
		this.nom =nom;
		this.prenom=prenom;
	}
	/*
	//je trouve pas logique de faire une personne juste avec un id mais là voilà au cas où
	public Personne(String nom,String prenom) {
		this();
		this.nom =nom;
		this.prenom=prenom;
	}
	*/

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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	//to string
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
	
}
