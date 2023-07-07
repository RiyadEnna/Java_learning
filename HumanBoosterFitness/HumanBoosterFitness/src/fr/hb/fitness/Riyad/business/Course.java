package fr.hb.fitness.Riyad.business;

import java.time.LocalDateTime;


public class Course {
	private Long id;
	private LocalDateTime dateHeureEnMinute;
	private int dureeEnMinute;
	private int distanceEnMetres;
	private static Long compteur =0L;
	//merci l'auto complétion
    private Entraineur entraineur = new Entraineur(null, null) ;
    private Adherent adherent = new Adherent(null, null);
    private Tapis tapis = new Tapis();

	//je créer un constructeur qui prend au minimum un adherent et sont id
	public Course(Adherent adherent) {
		super();
		id =++compteur;
		this.adherent = adherent;
		
	}
	//je créer une surcharge qui me permet de lui rajouter un Entraineur
	public Course(Adherent adherent,Entraineur entraineur) {
		this(adherent);
		this.entraineur = entraineur;
	}
	//je créer une surcharge de la surcharge qui me permet de lui rajouter les autres infos
	//exemple (une fois l'entrainement terminé)
	public Course(Adherent adherent,Entraineur entraineur,LocalDateTime dateHeureEnMinute,int dureeEnMinute,int distanceEnMetres,Tapis tapis) {
		this(adherent,entraineur);
		this.dateHeureEnMinute = dateHeureEnMinute;
		this.dureeEnMinute = dureeEnMinute;
		this.distanceEnMetres = distanceEnMetres;
		this.tapis = tapis;
	}
	
	
	//get set
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getDateHeureEnMinute() {
		return dateHeureEnMinute;
	}
	public void setDateHeureEnMinute(LocalDateTime dateHeureEnMinute) {
		this.dateHeureEnMinute = dateHeureEnMinute;
	}
	public int getDureeEnMinute() {
		return dureeEnMinute;
	}
	public void setDureeEnMinute(int dureeEnMinute) {
		this.dureeEnMinute = dureeEnMinute;
	}
	public int getDistanceEnMetres() {
		return distanceEnMetres;
	}
	public void setDistanceEnMetres(int distanceEnMetres) {
		this.distanceEnMetres = distanceEnMetres;
	}
	public Entraineur getEntraineur() {
		return entraineur;
	}
	public void setEntraineur(Entraineur entraineur) {
		this.entraineur = entraineur;
	}
	public Adherent getAdherent() {
		return adherent;
	}
	public void setAdherent(Adherent adherent) {
		this.adherent = adherent;
	}
	public Tapis getTapis() {
		return tapis;
	}
	public void setTapis(Tapis tapis) {
		this.tapis = tapis;
	}
	
	//to string
	@Override
	public String toString() {
		return "Course [id=" + id + ", dateHeureEnMinute=" + dateHeureEnMinute + ", dureeEnMinute=" + dureeEnMinute
				+ ", distanceEnMetres=" + distanceEnMetres + ", entraineur=" + entraineur + ", adherent=" + adherent
				+ ", tapis=" + tapis + "]";
	}

	
	
	
}