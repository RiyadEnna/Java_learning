package fr.hb.business;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int n = 0;
		String c = "x";
				
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Bonjour entrez un char :");
		c = sc.next();
		
		System.out.println("entrez un nombre de ligne:");
		n = sc.nextInt();
		/* triangle rectangle */
		for (int i =0; i < n ; i++) {
			for (int j =0; j <= i; j++) {
				System.out.print(c);
			}
		System.out.println("");
		}
		
		System.out.println("");
		/* triangle iso */

		for (int l =0; l < n ; l++) {
			for (int p =0; p <= n-l-1; p++) {
				System.out.print(" ");
			}
			for (int k =0; k <= l * 2; k++) {
				System.out.print(c);
			}
		System.out.println("");
		}
		
	sc.close();	
	}
}
