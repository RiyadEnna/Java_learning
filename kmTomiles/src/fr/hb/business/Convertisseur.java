package fr.hb.business;
import java.util.Scanner;

public class Convertisseur {

		public static void main(String[] args) {
			
			Scanner sc2 = new Scanner(System.in);
			int choix = 1;
			final double TAUX = 0.621371 ;
			final double TAUX2 = 1.609 ;
			double demande = 0;
			
			do {
				System.out.print("Bonjour que voulez vous convertir (miles 1) (Km 2) : " );
				choix = sc2.nextInt();

			} while ((choix !=1) && ( choix !=2));
				if (choix == 1) {
					System.out.print("Bonjour entrez un entier à convertir en km : " );
					demande = sc2.nextDouble();	
					System.out.println("Votre  entier à convertir en km : " + demande );
					System.out.println("votre  entier à convertir en miles : " + demande*TAUX );
	
				}	
				else {
					System.out.print("Bonjour entrez un entier à convertir en miles : " );
					demande = sc2.nextDouble();	
					System.out.println("Votre  entier à convertir en miles : " + demande );
					System.out.println("votre  entier à convertir en km : " + demande/TAUX2 );
	
				}			
				System.out.println("Au revoir");
				sc2.close();
			
		}

}
