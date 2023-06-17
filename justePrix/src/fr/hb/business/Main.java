package fr.hb.business;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int essais = 5;
		final int BORNE_MIN = 1 ;
		final int BORNE_MAX = 100 ;
		Random rand = new Random();
		int justePrix = BORNE_MIN + rand.nextInt(BORNE_MAX) ;
		int nombreTrouver = 0;
		System.out.println("Entrez un entier entre " + BORNE_MIN +" et "+ BORNE_MAX + " " +justePrix );
		
		Scanner sc2 = new Scanner(System.in);		
		do {
			if (essais == 1) {
			System.out.println("reste " + essais + " essaie ");
			}
			else {
			System.out.println("reste " + essais + " essaies ");
			}
			
			nombreTrouver = sc2.nextInt();
			System.out.println("votre nombre est :" + nombreTrouver);

			
			if (nombreTrouver > justePrix) {
				System.out.println("c'est moins");
			}
			else if(nombreTrouver < justePrix) {
				System.out.println("c'est plus");
			}
			else {
				System.out.println("bravo");
			}
			essais--;
			
			
		} while ((justePrix != nombreTrouver ) && (essais != 0));
		System.out.println("Game Over");
		sc2.close();
	}

}


