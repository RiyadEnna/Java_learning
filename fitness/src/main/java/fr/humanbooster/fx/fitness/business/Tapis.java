package fr.humanbooster.fx.fitness.business;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class Tapis {

	// Attributs
    private Long id;
    private String nom;

    private static Long compteur = 0L;

    // Constructeur
    public Tapis(String nom) {
        id = ++compteur;
        this.nom = nom;
    }


   
}