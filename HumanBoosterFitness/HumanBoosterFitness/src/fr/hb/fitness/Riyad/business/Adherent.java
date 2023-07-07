package fr.hb.fitness.Riyad.business;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Adherent extends Personne {
	//attribut
	private LocalDate dateDeNaissance;
	private List<Course> courses;
	
	//constructeur
    public Adherent(String nom,String prenom) {
        super(nom,prenom);
        courses = new ArrayList<>();
    }
    
    public Adherent(String nom,String prenom,LocalDate dateDeNaissance) {
    	this(nom,prenom);
    	this.dateDeNaissance = dateDeNaissance;
    }

    //get set

	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
    //to string j'aurais dut mettre nom en protected du coup

	@Override
	public String toString() {
		return "Adherent [dateDeNaissance="+dateDeNaissance +", nom =" + getNom() + ",prenom = "+getPrenom()+", courses=" + courses + "]";
	}


	
    
    
    

	
}
