package fr.humanbooster.fx.fitness.business;
import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
public abstract class Personne {

    protected Long id = 0L;
    protected String nom;
    protected String prenom;
    private static Long compteur = 0L;

    protected Personne() {
    	id = ++compteur;
	}

	protected Personne(String nom, String prenom) {
		this();
		this.nom = nom;
		this.prenom = prenom;
	}


  
}