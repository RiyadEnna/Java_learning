package fr.hb.business;

import java.util.*;

/**
 * 
 */
public class Ville {



	private Long id;

	private String nom;

	private String codePostal;

	private Double latitude;

	private Double longitude;

	private String codeInsee;

	private static Long compteur =0L;
	
	/**
	 * Default constructor
	 */
	public Ville(String nom,String codePostal) {
		id =++compteur;
		this.nom =nom;
		this.codePostal =codePostal;
	}
	//surcharge
	public Ville(String nom, String codePostal, Double latitude, Double longitude, String codeInsee) {
		this(nom,codePostal);
		this.latitude = latitude;
		this.longitude = longitude;
		this.codeInsee = codeInsee;
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

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getCodeInsee() {
		return codeInsee;
	}

	public void setCodeInsee(String codeInsee) {
		this.codeInsee = codeInsee;
	}

	//to string
	@Override
	public String toString() {
		return "Ville [id=" + id + ", nom=" + nom + ", codePostal=" + codePostal + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", codeInsee=" + codeInsee + "]";
	}
	
	
	
	

}