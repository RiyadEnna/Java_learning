package fr.hb.aeroport.business;

import java.time.LocalDateTime;

public class Vol {
	private Long id;
	private LocalDateTime heureDepart ;
	private LocalDateTime heureArrive ;
	private float prix;
	private Compagnie compagnie;
	private Aeroport aeroportDepart;
	private Aeroport aeroportArrive;
	
	
	public Vol() {
		super();
	}

	

	public Vol(LocalDateTime heureDepart, LocalDateTime heureArrive, float prix, Compagnie compagnie,
			Aeroport aeroportDepart, Aeroport aeroportArrive) {
		super();
		this.heureDepart = heureDepart;
		this.heureArrive = heureArrive;
		this.prix = prix;
		this.compagnie = compagnie;
		this.aeroportDepart = aeroportDepart;
		this.aeroportArrive = aeroportArrive;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public LocalDateTime getHeureDepart() {
		return heureDepart;
	}


	public void setHeureDepart(LocalDateTime heureDepart) {
		this.heureDepart = heureDepart;
	}


	public LocalDateTime getHeureArrive() {
		return heureArrive;
	}


	public void setHeureArrive(LocalDateTime heureArrive) {
		this.heureArrive = heureArrive;
	}


	public float getPrix() {
		return prix;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	}


	public Compagnie getCompagnie() {
		return compagnie;
	}


	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}


	public Aeroport getAeroportDepart() {
		return aeroportDepart;
	}


	public void setAeroportDepart(Aeroport aeroportDepart) {
		this.aeroportDepart = aeroportDepart;
	}


	public Aeroport getAeroportArrive() {
		return aeroportArrive;
	}


	public void setAeroportArrive(Aeroport aeroportArrive) {
		this.aeroportArrive = aeroportArrive;
	}


	@Override
	public String toString() {
		return "Vol [id=" + id + ", heureDepart=" + heureDepart + ", heureArrive=" + heureArrive + ", prix=" + prix
				+ ", compagnie=" + compagnie + ", aeroportDepart=" + aeroportDepart + ", aeroportArrive="
				+ aeroportArrive + "]";
	}
	
	
	
	
	

}
