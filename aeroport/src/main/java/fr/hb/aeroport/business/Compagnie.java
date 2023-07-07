package fr.hb.aeroport.business;

import java.util.ArrayList;
import java.util.List;

public class Compagnie {
	private  Long id;
	private  String nom;
	private  List<Vol> vols = new ArrayList<>();
	
	
	public Compagnie() {
		super();
	}


	public Compagnie(String nom) {
		this();
		this.nom = nom;
	}


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


	public List<Vol> getVols() {
		return vols;
	}


	public void setVols(List<Vol> vols) {
		this.vols = vols;
	}


	@Override
	public String toString() {
		return "Compagnie [id=" + id + ", nom=" + nom + "]";
	}
	
	
	
	
	
}
