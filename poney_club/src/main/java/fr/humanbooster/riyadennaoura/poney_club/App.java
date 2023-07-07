package fr.humanbooster.riyadennaoura.poney_club;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import fr.humanbooster.riyadennaoura.poney_club.builder.EquipementBuilder;
import fr.humanbooster.riyadennaoura.poney_club.builder.impl.EquipementBuilderImpl;
import fr.humanbooster.riyadennaoura.poney_club.business.Ballade;
import fr.humanbooster.riyadennaoura.poney_club.business.Cavalier;
import fr.humanbooster.riyadennaoura.poney_club.business.Code;
import fr.humanbooster.riyadennaoura.poney_club.business.Equipement;
import fr.humanbooster.riyadennaoura.poney_club.business.Poney;
import fr.humanbooster.riyadennaoura.poney_club.business.PonyGames;
import fr.humanbooster.riyadennaoura.poney_club.business.SautObstacle;
import fr.humanbooster.riyadennaoura.poney_club.business.Soins;
import fr.humanbooster.riyadennaoura.poney_club.business.Stage;
import fr.humanbooster.riyadennaoura.poney_club.factories.CodeFactory;
import fr.humanbooster.riyadennaoura.poney_club.factories.impl.CodeFactoryImpl;
import fr.humanbooster.riyadennaoura.poney_club.iterators.CollectionsdePoney;

public class App {

	private static List<Poney> poneys = new ArrayList<>();
	private static EquipementBuilder equipementBuilder = new EquipementBuilderImpl();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		System.out.println(" Bonjour et bienvenue au Club Poney Fringant");
		// petite ref
		CollectionsdePoney collectionsdePoney = new CollectionsdePoney();
		collectionsdePoney.createPoneys();
		poneys = collectionsdePoney.getPoney();
		// affichage des poneys
		afficherListePoney();

		// selection du poney
		Poney poneySelectionne = selectPoney();
		System.out.println("Vous avez selectionne poney : " + poneySelectionne.getNomPoney());

		// ajout du cavalier avec son prenom
		Cavalier cavalier = saisieNomCavalier();

		// fabrication d'un code unique
		CodeFactory codeFactory = CodeFactoryImpl.getInstance();
		Code code = codeFactory.fabriquerCode();

		// mise en place du stage initial 
		Stage stage = new Stage(code, cavalier, poneySelectionne, 0f);

		// Récupération de la liste d'équipements
		stage.setCollectionDequipement(demanderEquipements());
		// ajout d'une ou plusieur activité
		stage =  demanderActivite(stage);
		String recapilatif = racapitulatifFinal(stage);
        System.out.print(recapilatif);

	}


	private static void afficherListePoney() {
		System.out.println("La liste des Poneys");
		int index = 0;
		Iterator<Poney> iterator = poneys.iterator();
		while (iterator.hasNext()) {
			Poney poneyI = iterator.next();
			System.out.print(index + " ) ");
			System.out.print(poneyI.getNomPoney());
			System.out.println("");
			index++;

		}
	}

	private static Poney selectPoney() {
		System.out.print("veuillez choisir un poney : ");
		int choix = scanner.nextInt();
		if (choix >= 0 && choix < poneys.size()) {
			Poney poneySelectionne = poneys.get(choix);
			poneys.remove(poneySelectionne);
			return poneySelectionne;
		} else {
			System.out.println("Choix invalide !");
			return null;
		}
	}



	private static Cavalier saisieNomCavalier() {
		System.out.println("Maintenant veuillez saisir votre Prenom");
		// obliger de mettre un nouveau scanner sinon saisie bug
		scanner.nextLine();
		String prenom = scanner.nextLine();
		return new Cavalier(prenom);
	}

	private static void afficherListeEquipements() {
		System.out.println("Liste des equipements");
		List<Equipement> equipements = EquipementBuilderImpl.getEquipements();
		int index = 0;
		for (Equipement equipement : equipements) {
			System.out.println(index + " )" + equipement.getNom() + " " + equipement.getStock());
			index++;
		}
	}
	//recupere les choix des utilisateurs pour leur équipements
	private static List<Equipement> demanderEquipements() {
		int indiceChoixCouvreRein;
		int indiceChoixRene;
		int indiceChoixBride;
		int indiceChoixSelle;
		List<Equipement> equipementsAjoutes = new ArrayList<>();

		System.out.println("Il est temps de choisir un equipement");

		afficherListeEquipements();
		//recommence tant que la saisie est incorect
		do {
			for(int i = 0; i <= 2; i++) {
				System.out.println(" choix " + i +" )" +EquipementBuilderImpl.getEquipements().get(i).getNom());
			}
			System.out.println("veuillez choisir le couvre rein 0 , 1 ou 2");
			indiceChoixCouvreRein = scanner.nextInt();
			scanner.nextLine();
			if (indiceChoixCouvreRein >= 0 && indiceChoixCouvreRein <= 2) {
				Equipement equipementChoisi = EquipementBuilderImpl.getEquipements().get(indiceChoixCouvreRein);
				equipementBuilder.ajouterEquipement(equipementChoisi.getNom(), equipementChoisi.getStock());
				System.out.println("Vous avez ajoute l'equipement " + equipementChoisi.getNom());
				equipementChoisi.setStock(equipementChoisi.getStock() - 1);
			} else {
				System.out.println("Choix incorect recommencer");
			}
		} while (indiceChoixCouvreRein < 0 || indiceChoixCouvreRein > 2);
		// mrc la Lois de Morgan

		do {
			for(int i = 3; i <= 4; i++) {
				System.out.println(" choix " + i +" )" +EquipementBuilderImpl.getEquipements().get(i).getNom());
			}
			System.out.println("veuillez choisir la selle 3 ou 4");
			indiceChoixSelle = scanner.nextInt();
			if (indiceChoixSelle >= 3 && indiceChoixSelle <= 4) {
				Equipement equipementChoisi = EquipementBuilderImpl.getEquipements().get(indiceChoixSelle);
				equipementBuilder.ajouterEquipement(equipementChoisi.getNom(), equipementChoisi.getStock());
				System.out.println("Vous avez ajoute l'equipement " + equipementChoisi.getNom());
				equipementChoisi.setStock(equipementChoisi.getStock() - 1);
			} else {
				System.out.println("Choix incorect recommencer");
			}
		} while (indiceChoixSelle < 3 || indiceChoixSelle > 4);

		do {
			for(int i = 5; i <= 6; i++) {
				System.out.println(" choix " + i +" )" +EquipementBuilderImpl.getEquipements().get(i).getNom());
			}
			System.out.println("veuillez choisir la bride 5 ou 6");
			indiceChoixBride = scanner.nextInt();
			if (indiceChoixBride >= 5 && indiceChoixBride <= 6) {
				Equipement equipementChoisi = EquipementBuilderImpl.getEquipements().get(indiceChoixBride);
				equipementBuilder.ajouterEquipement(equipementChoisi.getNom(), equipementChoisi.getStock());
				System.out.println("Vous avez ajoute l'equipement " + equipementChoisi.getNom());
				equipementChoisi.setStock(equipementChoisi.getStock() - 1);
			} else {
				System.out.println("Choix incorect recommencer");
			}
		} while (indiceChoixBride < 5 || indiceChoixBride > 6);

		do {
			
			for(int i = 7; i <= 8; i++) {
				System.out.println(" choix " + i +" )" +EquipementBuilderImpl.getEquipements().get(i).getNom());
			}
			System.out.println("veuillez choisir les renes 7 ou 8");
			indiceChoixRene = scanner.nextInt();
			if (indiceChoixRene >= 7 && indiceChoixRene <= 8) {
				Equipement equipementChoisi = EquipementBuilderImpl.getEquipements().get(indiceChoixRene);
				equipementBuilder.ajouterEquipement(equipementChoisi.getNom(), equipementChoisi.getStock());
				System.out.println("Vous avez ajoute l'equipement " + equipementChoisi.getNom());
				equipementChoisi.setStock(equipementChoisi.getStock() - 1);
			} else {
				System.out.println("Choix incorect recommencer");
			}
		} while (indiceChoixRene < 7 || indiceChoixRene > 8);

		//je récupere les equipements des utilisateurs
		equipementsAjoutes = equipementBuilder.getStageEquipement();

		// j'affiche la liste des équipements ajouter
		System.out.println("Equipements ajoutes :");
		for (Equipement equipement : equipementsAjoutes) {
			System.out.println(equipement);
		}

		return equipementsAjoutes;
	}


	private static Stage demanderActivite(Stage stage) {
		scanner.nextLine();

        do {
            System.out.println("Numero\tNom");
            System.out.println("1\tSoin");
            System.out.println("2\tSautObstacle");
            System.out.println("3\tPony Games");
            System.out.println("4\tBallade");

            System.out.println("Vous devez choisir une activite");

            switch (scanner.nextLine()) {
            case "1":
            	stage = new Soins(stage);
                System.out.println("Vous avez ajoute activite Soin");
                break;
            case "2":
            	stage = new SautObstacle(stage);
                System.out.println("Vous avez ajoute activite Saut obstacle");
                break;
            case "3":
            	stage = new PonyGames(stage);
                System.out.println("Vous avez ajoute activite Pony Games");
                break;
            case "4":
            	stage = new Ballade(stage);
                System.out.println("Vous avez ajoute activite Ballade");
                break;
            default:
                break;
            }
            System.out.print("Souhaitez-vous ajouter un nouvel ingredient (O/N) ? ");
        } while (scanner.nextLine().toLowerCase().equals("o"));

     return stage;
    }
	
	//je recupere toutes les saisies des utilisateurs et les affiches
	public static String racapitulatifFinal(Stage stage) {
		String recap = "";
		
		recap += "Cavalier : " + stage.getCavalier().getPrenom()+ "\n";
		recap += "Poney : " + stage.getPoney().getNomPoney() + "\n";
		recap += "Vos Equipements : " + stage.getCollectionDequipement() + "\n";
	    recap += "Activite(s) choisie(s): " + stage.getnomActivite() + "\n";
	    recap += "Cout total du stage: " + stage.getPrix() + " euros \n";
	    recap += "Numero du sejour: " + stage.getCodeStage();
		return recap;
	}

}