package fr.hb.util;

import java.util.Comparator;

import fr.hb.business.Carte;

public class ComparateurCartesSurValeur implements Comparator<Carte> {

	@Override
	public int compare(Carte carte1, Carte carte2) {
		// on montre a java comment comparer deux objet de tupe carte
		return Integer.valueOf(carte1.getValeur()).compareTo(carte2.getValeur());
	}

}
