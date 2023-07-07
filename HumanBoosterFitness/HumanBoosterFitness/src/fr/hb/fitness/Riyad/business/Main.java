package fr.hb.fitness.Riyad.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	private static List<Adherent> adherents =new ArrayList<>();
	private static List<Course> courses =new ArrayList<>();
	//oui tapiss fait délibérement
	private static List<Tapis> tapiss =new ArrayList<>();
	private static List<Entraineur> entraineurs = new ArrayList<>();
	private static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		//ajout des entraineur comme poker avec couleur
		Entraineur entraineur = new Entraineur("Luke", "Wolker");
		Entraineur entraineur1 = new Entraineur("Jean-Claude", "Vandame");
		entraineurs.add(entraineur);
		entraineurs.add(entraineur1);
		//ajout des tapis comme poker avec couleur
		Tapis tapis = new Tapis("Tapis sport3000");
		Tapis tapis2 = new Tapis("Tapis sportDesCoutlong");
		Tapis tapis3 = new Tapis("Tapis3");
		tapiss.add(tapis);
		tapiss.add(tapis2);
		tapiss.add(tapis3);
		
		System.out.print("Bienvenue au HB Fitness Club !");
		ajouterAdherent();
		System.out.println(adherents);

        /*trierAdherent();
        ajouter course;*/
        voirCourseAll();      
	}
	private static void voirCourseAll() {
		System.out.println("voir toute les course");
		for (Course course : courses) {
			System.out.println(course);
		}
	}
	private static void ajouterAdherent() {
		//creation dedeux variable pour ajouter
		String nomAd;
		String prenomAd;
		System.out.println("votre choix : 1 ajouter un adhérent");
		System.out.println("ajouter nom adherent");
		nomAd = sc.nextLine();
		System.out.println("ajouter prenom adherent");
		prenomAd = sc.nextLine();
		Adherent adherentAjout  = new Adherent(nomAd, prenomAd);
        adherents.add(adherentAjout);
   } 
	
	
	
		



}
