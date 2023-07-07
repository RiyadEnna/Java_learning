package fr.hb.poker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import fr.hb.business.Carte;
import fr.hb.business.Combinaison;
import fr.hb.business.Couleur;
import fr.hb.business.Joueur;
import fr.hb.business.Ville;

public class App {
		private static List<Couleur> couleurs = new ArrayList<>();
		private static List<Carte> cartes = new ArrayList<>();
		private static List<Joueur> joueurs = new ArrayList<>();
		private static List<Ville> villes = new ArrayList<>();
		//tous ce que le main touche doit être static
		private static Scanner scanner = new Scanner(System.in);
	    private static final String FORMAT_DATE = "dd/MM/yyyy";
	    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(FORMAT_DATE);
	    private static final int NB_CARTES_A_REMETTRE_A_CHAQUE_JOUEUR = 5;
	    private static final String URL_FICHIER_CSV = " https://www.clelia.fr/villes2020.csv";
	    
	public static void main(String[] args) {
		
		System.out.println("Bienvenue sur poker booster");
		String pseudo = demanderPseudo();
		LocalDate datedeNaissance = demanderDateDeNaissance();
		Couleur couleur1 = new Couleur("Coeur");
		Couleur couleur2 = new Couleur("Carreau");
		Couleur couleur3 = new Couleur("Trèfle");
		Couleur couleur4 = new Couleur("Pique");
		couleurs.add(couleur1);
		couleurs.add(couleur2);
		couleurs.add(couleur3);
		couleurs.add(couleur4);
		//importerVilles();
		//constituerJeu();
		//melangerJeu();
		//afficherJeu();
		ajouterJoueur();
		//distribuerCartes();
		//trierJoueurs();
		//System.out.println(cartes);
		System.out.println(joueurs);
		//analyserMain(joueurs.get(0));
		
		
		/*
        for (Joueur joueur : joueurs) {
            System.out.println(analyserMain(joueur));
        } 
	*/
	}


/*
	private static void trierJoueurs() {
		Collections.sort(joueurs);	
	}
*/


	private static void constituerJeu() {
		for(Couleur couleur : couleurs) {
			for(int i=2;i<=14;i++) {
				cartes.add(new Carte(i,couleur));
			}
		}
	}

	private static Combinaison analyserMain(Joueur joueur) {
		List<Integer> valeurCarte = new ArrayList<>();	
		List<Couleur> couleurCarte = new ArrayList<>();	
        List<Carte> main = new ArrayList<>(joueur.getMain());

        int[] occurrencesParValeur = new int[15];
        int[] occurrencesParCouleur = new int[4];
        int nbPaires = 0;
        boolean contientPaire = false;
        boolean contientBrelan = false;
        boolean contientCarre = false;

        for (Carte carte : main) {
            occurrencesParValeur[carte.getValeur()]++;
        }
        
        for (Carte carte : main) {
            occurrencesParCouleur[couleurs.indexOf(carte.getCouleur())]++;
        }
       
        
        for(int i: occurrencesParValeur) {
        	 System.out.print(i);
        }
        
        for (int i = 2; i <= 14; i++) {
            if (occurrencesParValeur[i] == 2) {
                nbPaires++;
           	 	contientPaire = true;
            }
        }
        
        for (int i = 2; i <= 14; i++) {
            if (occurrencesParValeur[i] == 3) {
            	 contientBrelan = true;
            }
        }
            
        for (int i = 2; i <= 14; i++) {
            if (occurrencesParValeur[i] == 4) {
                contientCarre = true;
            }
        }  
        
   
        if (contientPaire) {
        	System.out.println("Nb paire " + nbPaires);
        }
        
        if (contientBrelan) {
            System.out.println("Brelan trouvé.");
            return Combinaison.BRELAN;

        }
        if (contientCarre) {
            System.out.println("Carré trouvé.");
            return Combinaison.CARRE;
        }
        if ((contientPaire)&&(contientBrelan)) {
            System.out.println("full trouvé.");
        }
        
        if ((!contientPaire)&&(!contientBrelan)&&(!contientCarre)) {
            System.out.println("CarteHaute");
        }
        
		
		
		
		//valeursCarte
		//couleursCarte
		for (Carte carte : main) {
			valeurCarte.add(carte.getValeur());
			couleurCarte.add(carte.getCouleur());
			
		}
		return null;
		
	}	



		private static void detectCarteHaute() {
			
		}



		private static void distribuerCartes() {
	    // to do retirer carte du deck et la placer dans la main du joueur 
	    for (int c = 0; c < 5; c++) {
	        for (Joueur joueur : joueurs) {
	            Carte carte = cartes.remove(0);
	            joueur.getMain().add(carte);
	        }
	    }
	}



	private static void ajouterJoueur() {
		List<String>pseudos = Arrays.asList("Jean-Paul","Ewan","Ibra","Ibrahim",
				"Romain","Mohamed","Adnane","Kylian","Riyad","Younous");
		pseudos.forEach(pseudo -> joueurs.add(new Joueur(pseudo)));
		
	}


	private static void afficherJeu() {
		// TODO Auto-generated method stub
		
	}


	private static void melangerJeu() {
		Collections.shuffle(cartes);
	}

	private static Carte recupererCarte(int valeur,Couleur couleur) {
		//instancier une carte représenteun coût
		Carte carteTrouvee = null;
		for(Carte carte : cartes) {
			//==pour tester l'égalité de deux types primitifs
			//la méthode equals pour tester l'égalité entre 2 objets
			if (carte.getValeur()==valeur && carte.getCouleur().equals(couleur));{
								//la méthode remove qui à un param en objet
			carteTrouvee=carte;
			}
		}
		if (carteTrouvee!=null) {
			cartes.remove(carteTrouvee);
		}
		return carteTrouvee;
	}

	
	private static LocalDate demanderDateDeNaissance() {             
		System.out.println("Veuillez saisir votre Date de Naissance au format :" + FORMAT_DATE);             
		return LocalDate.parse(scanner.nextLine(), dateTimeFormatter);         
	}  

	private static String demanderPseudo() {          
	System.out.println("Veuillez saisir votre pseudo");             
	return scanner.nextLine();         
	}
	/*
	private static void importerVilles() {
	    URL url = null;
	    
	    try {
	        url = new URL(URL_FICHIER_CSV);
	    } catch (MalformedURLException e) {
	          System.out.println("Fichier CSV indisponible, raison : " + e.getMessage());
	          System.exit(-1);
	    }

	         // On parcourt le fichier CSV et on ajoute des villes dans la liste locale
	         // Utilisation d'un try with resources (les ressources seront fermées par Java)
	    try (Reader reader = new InputStreamReader(url.openStream(), "UTF-8");) {
	    	// La classe BufferedReader offre une méthode readLine()
            BufferedReader bufferedReader = new BufferedReader(reader);{
            	System.out.println(in.readline());
            	String ligne;
            	bufferedReader.readLine();
            	while((ligne = reader.bufferedReader !=null){
            		String[] valeurs = ligne.split(",");
            		System.out.print(ligne);
            	}
            }
            
	    }
	    
	    catch (UnsupportedEncodingException e) {
	            // TODO Auto-generated catch block
	    e.printStackTrace();
	    } catch (IOException e) {
	            // TODO Auto-generated catch block
	    e.printStackTrace();
	    }        
	 }*/	
}
