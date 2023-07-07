package fr.hb.util;

import java.util.Comparator;

import fr.hb.business.Joueur;

public class ComparateurDeJoueurSurPseudo implements Comparator<Joueur> {

	@Override
	public int compare(Joueur joueur1, Joueur joueur2) {
		// on compare 2 joueurs sur leur pseudo
		//on les tries par rapport à leur pseudo
		return joueur1.getPseudo().compareTo(joueur2.getPseudo());
	}

}
