package fr.hb.business;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class Joueur {


    private Long id;
    private String pseudo;
    private LocalDate dateDeNaissance;
    private float solde;
    private static Long compteur = 0L;
    // ensemble de carte dans la main du  joueur
    private Set<Carte> main;
    private Ville ville;    
    
    public static final float SOLDE_INITIAL = 50;
    /**
     * Default constructor
     */
    public Joueur() {
        super();
        id = ++compteur;
        main = new HashSet<>();
        solde = SOLDE_INITIAL;
    }
    /**
     * overload constructor
     */
    public Joueur(String pseudo) {
        this();
        this.pseudo = pseudo;
    }
    
    
    public Joueur(String pseudo,LocalDate dateDeNaissance){
        this(pseudo);
        this.dateDeNaissance = dateDeNaissance;
    }
    
    public Joueur(String pseudo,LocalDate dateDeNaissance,Ville ville){
        this(pseudo,dateDeNaissance);
        this.ville = ville;
    }    
    
    //get set
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public Set<Carte> getMain() {
		return main;
	}
	public void setMain(Set<Carte> main) {
		this.main = main;
	}
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
   //to string
	@Override
	public String toString() {
		return "Joueur [id=" + id + ", pseudo=" + pseudo + ", dateDeNaissance=" + dateDeNaissance + ", solde=" + solde
				+ ", main=" + main + ", ville=" + ville + "]";
	}
	
	public int compareTo(Joueur autreJoueur) {
		//on vas comparer 2 joueurs grace à leur date de naissance;
		if (getDateDeNaissance() != null && autreJoueur.getDateDeNaissance()!=null) {
			return getDateDeNaissance().compareTo(autreJoueur.getDateDeNaissance());
		}
		return 0;
		
	}

    

}