package fr.humanbooster.fx.fitness.business;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
public class Adherent extends Personne  implements Comparable<Adherent> {

    private LocalDate dateDeNaissance; 
    private List<Course> courses = new ArrayList<>();

    public Adherent(String nom, String prenom, LocalDate dateDeNaissance) {
		super(nom, prenom);
		this.dateDeNaissance = dateDeNaissance;
	}


	@Override
	public String toString() {
		return "Adherent [dateDeNaissance=" + dateDeNaissance + ", id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ "]";
	}

	@Override
	public int compareTo(Adherent autreAdherent) {
		return getId().compareTo(autreAdherent.getId());
	}

}