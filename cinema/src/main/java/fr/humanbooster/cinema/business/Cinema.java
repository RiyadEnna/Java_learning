package fr.humanbooster.cinema.business;

import java.time.LocalDateTime;

public class Cinema {
	private Long id;
	private String nom;
	private LocalDateTime heureOuverture;
	private LocalDateTime heureFermeture;
	
	public Cinema() {
		super();
	}

	public Cinema(String nom, LocalDateTime heureOuverture, LocalDateTime heureFermeture) {
		this();
		this.nom = nom;
		this.heureOuverture = heureOuverture;
		this.heureFermeture = heureFermeture;
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

	public LocalDateTime getHeureOuverture() {
		return heureOuverture;
	}

	public void setHeureOuverture(LocalDateTime heureOuverture) {
		this.heureOuverture = heureOuverture;
	}

	public LocalDateTime getHeureFermeture() {
		return heureFermeture;
	}

	public void setHeureFermeture(LocalDateTime heureFermeture) {
		this.heureFermeture = heureFermeture;
	}

	@Override
	public String toString() {
		return "Cinema [id=" + id + ", nom=" + nom + ", heureOuverture=" + heureOuverture + ", heureFermeture="
				+ heureFermeture + "]";
	}

	
	
	
	
}
