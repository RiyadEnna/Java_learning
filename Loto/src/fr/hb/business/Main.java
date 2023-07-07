package fr.hb.business;

import java.util.Random;
import java.util.Scanner;

public class Main {
		//attribut
		private static final int NB_CASE_GRILLE = 5;
		private static int tirage[] = new int[NB_CASE_GRILLE];
		private static int grilleDuJoueur[] = new int[NB_CASE_GRILLE];
		private static Random rand = new Random();
		private static Scanner sc = new Scanner (System.in)  ;
		private static int nbBonsNUmeros =0;
		private static int noDouble = 0;
		
		
	public static void main(String[] args) {
		
		for (int i=0;i<5;i++) {
			tirage[i]  = 1 + rand.nextInt(49);
		}
		System.out.println("bonjour entrer vos numéro");
		
		// Entrer un numero
		for (int j=0;j<5;j++) {
				do {
					System.out.println("Entrer un numero pour la case "+ j );
					grilleDuJoueur[j] = sc.nextInt();
				}while((grilleDuJoueur[j] >= 50) || (grilleDuJoueur[j] <= 0));
		
		}
		
		// Entrer un nouveau numero
	    for (int t = 0; t < 5; t++){
	        for (int r = t + 1; r < 5; r++){ 
	        	do {
		            if (grilleDuJoueur[t] ==grilleDuJoueur[r] ) {
		            	System.out.println("Entrer un nouveau numero pour la case "+ t );
		            	grilleDuJoueur[t] = sc.nextInt();
		            }
	        	}while(grilleDuJoueur[t] ==grilleDuJoueur[r] );
	        }
	    }
	    
		// afficher tableau 
		for (int k=0;k<5;k++) {
			System.out.println("votre tableau case "+ k + " contient :" + grilleDuJoueur[k] );
		}
		
		for (int l=0;l<5;l++) {
			System.out.println("le tableau de tirage case "+ l + " contient :" + tirage[l] );
		}
		
		// vérification nombre bon numéro
		for (int v=0;v<5;v++) {
			for (int z=0;z<5;z++) {	
				if(grilleDuJoueur[v] == tirage[z] ) {
					nbBonsNUmeros++;
				}
		}
			
		}
		System.out.println("vous avez "+nbBonsNUmeros+" bon num" );
	
	}
		
	}
