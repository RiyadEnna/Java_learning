package fr.hb.business;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		int heure = 0;
		int resteH = 0;
		int minute = 0;
		int resteM = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Bonjour entrez une heure");
		heure = sc.nextInt();

		System.out.println("entrez les minutes");
		minute = sc.nextInt();

		if (minute % 2 == 0) {
			System.out.print(" |+|");
		}
		else {
			System.out.print(" |-|");
		}
		System.out.println("");
		
		resteH = heure % 5;
		heure = heure / 5;
		resteM = minute % 5;
		minute = minute / 5;

		for (int i = 1; i <= heure; i++) {
			System.out.print(" |X| ");
		}
		System.out.println("");

		for (int j = 1; j <= resteH; j++) {
			System.out.print(" |x| ");
		}
		System.out.println("");

		for (int k = 1; k <= minute; k++) {
			System.out.print(" |O| ");
		}
		System.out.println("");

		for (int l = 1; l <= resteM; l++) {
			System.out.print(" |o| ");
		}
		

		
		for (int i = 1; i <= heure; i++) {
			System.out.print(" |X| ");
			if (i == heure) {
				
			}
		}
		System.out.println("");

		for (int j = 1; j <= resteH; j++) {
			System.out.print(" |x| ");
		}
		System.out.println("");

		for (int k = 1; k <= minute; k++) {
			System.out.print(" |O| ");
		}
		System.out.println("");

		for (int l = 1; l <= resteM; l++) {
			System.out.print(" |o| ");
		}
	}

}
