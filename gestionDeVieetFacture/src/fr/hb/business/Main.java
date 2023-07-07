package fr.hb.business;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	private static Random random = new Random();
	private static List<Client> clients =new ArrayList<>();
	private static List<Ville> villes =new ArrayList<>();
	private static List<Article> articles =new ArrayList<>();
	private static List<Document> documents = new ArrayList<>();
	//private static Scanner sc =new Scanner(System.in);
		public static void main(String[] args) {
			ajouterVilles();
			System.out.println(villes);
	        ajouterClients();
	        System.out.println(clients);
	        
	        ajouterArticles();
	        System.out.println(articles);
	        
	        ajouterDocuments();
	        afficherDocuments();
	        ajouterDocumentsAleatoirement(Devis.class, 2);
	        ajouterDocumentsAleatoirement(Facture.class, 1000);
	        
	        
	        


	}	        

		private static void ajouterDocuments() {
			/*
			for (Client client : clients) {
				int choix = 1;
				System.out.println("taper 1 pour un doc type devis et 2 pour une facture");
				choix=sc.nextInt();
				if (choix == 1) {
					Devis devis = new Devis(client);
					client.getDocuments().add(devis);
				}
				else
				{
					Facture facture = new Facture(client);
					client.getDocuments().add(facture);
				}
			}
			*/
	        Document facture1 = new Facture(clients.get(0), LocalDateTime.now());
	        new Ligne(facture1, articles.get(0), 8);
	        new Ligne(facture1, articles.get(1), 4);
	        documents.add(facture1);
	        
	        Document facture2 = new Facture(clients.get(0), LocalDateTime.now());
	        new Ligne(facture2, articles.get(0), 6);
	        new Ligne(facture2, articles.get(1), 2);
	        documents.add(facture2);
	        
	        Document devis1 = new Devis(clients.get(2), LocalDateTime.now());
	        new Ligne(devis1, articles.get(0), 8);
	        documents.add(devis1);
			
			
		}
		private static void ajouterArticles() {
			/*
			System.out.println("Bonjour ajouter des articles svp");
			for (int i=0; i<5;i++) {
				System.out.println("Entre le nom de l'article");
        		String nomArticle = sc.nextLine();
        		System.out.println("Entre le prix de l'article");
        		Float prixArticle = sc.nextFloat();
        		articles.add(new Article(nomArticle,prixArticle));
			}
			*/
			
			articles.add(new Article("Voiture1",1000.0f));
			articles.add(new Article("Voiture2",13000.0f));
			articles.add(new Article("Voiture3",15000.0f));
			articles.add(new Article("Voiture4",13450.0f));
			articles.add(new Article("Voiture5",10500.0f));
		}
		private static void ajouterVilles() {
			/*
			System.out.println("Bonjour ajouter des Ville svp");
			for (int i=0; i<5;i++) {
				System.out.println("Entre le code postal");
        		String codePostal = sc.nextLine();
        		System.out.println("Entre le code nom de la ville");
        		String nomVille = sc.nextLine();
        		villes.add(new Ville(nomVille,codePostal));

			}
       		*/
			villes.add(new Ville("Lyon1","69001"));
			villes.add(new Ville("Lyon2","69002"));
			villes.add(new Ville("Lyon3","69003"));
			villes.add(new Ville("Lyon4","69004"));
			villes.add(new Ville("Lyon5","69005"));
	    }
		
		private static void ajouterClients() {
			/*
			System.out.println("Bonjour ajouter des client svp");
			for (int i=0; i<5;i++) {
					System.out.println("Entre le nom du client" + i);
	        		String nomClient = sc.nextLine();
	        		Ville villeRandom = villes.get(random.nextInt(villes.size()));
	        		clients.add(new Client(nomClient,villeRandom));
	        	}  
			*/
			clients.add(new Client("client 1",villes.get(random.nextInt(villes.size()))));
			clients.add(new Client("client 2",villes.get(random.nextInt(villes.size()))));
			clients.add(new Client("client 3",villes.get(random.nextInt(villes.size()))));
			clients.add(new Client("client 4",villes.get(random.nextInt(villes.size()))));
			clients.add(new Client("client 5",villes.get(random.nextInt(villes.size()))));

	    }
		
		private static void afficherDocuments() {
			for (Document document : documents) {
				System.out.println(document);
			}
			
		}
		
		private static Client recupererClientAuHasard(){
	        return(clients.get(random.nextInt(clients.size())));
	    }
		
	    private static Article recupererArticleAuHasard(){
	        return(articles.get(random.nextInt(articles.size())));
	    }
	    

	    private static void ajouterLignes(Document document) {
	        for (int i = 0; i < 3; i++) {
	            new Ligne(document,recupererArticleAuHasard(),1+random.nextInt(4),random.nextFloat());
	        }

	    }
	    
	    /*
	     * ajouter des documents automatiquement et de manière aléatoire Class<? extends
	     * Document> classeHeritantDeDocument => attendre en parametre toute classe
	     * héritant de document ( Devis.class ou Facture.class )
	     */
	private static void ajouterDocumentsAleatoirement(Class<? extends Document> classeHeritantDeDocument,
	            int nbDocumentsAAjouter) {
	        // paramètrage de la boucle For pour la création des documents
	        for (int i = 0; i < nbDocumentsAAjouter; i++) {
	            // initialisation de Document en null à chaque passage dans la boucle
	            Document document = null;

	            // appel de la fonction recupererClientAuHasard() pour préparer
	            // les paramètre nécessaire à la création des documents
	            Client clientAuHasard = recupererClientAuHasard();

	            // conditions pour determiner l'appel du constructeur du document à créer
	            if (classeHeritantDeDocument == Devis.class) {
	                document = new Devis(clientAuHasard, LocalDateTime.now());
	            } else if (classeHeritantDeDocument == Facture.class) {
	                document = new Facture(clientAuHasard, LocalDateTime.now());
	            } else {
	                return;
	            }
	            ajouterLignes(document);
	            documents.add(document);
	        }
	    }

}
