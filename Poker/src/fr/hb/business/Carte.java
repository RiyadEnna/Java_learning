package fr.hb.business;

/**
 * 
 */
public class Carte {

    // Attributs : qu'est-ce qui définit une carte ?
    private int valeur;
    private String nom;
    private Couleur couleur;

    /**
     * Constructeur qui permet de construire une carte
     * NB : le nom de la carte est déterminée par sa valeur
     * @param valeur
     * @param couleur
     */
    public Carte(int valeur, Couleur couleur) {
        this.valeur = valeur;
        this.couleur = couleur;
        switch (valeur) {
        case 11:
            nom = "Valet";
            break;
        case 12:
            nom = "Dame";
            break;
        case 13:
            nom = "Roi";
            break;
        case 14:
            nom = "As";
            break;
        default:
            nom = String.valueOf(valeur);
            break;
        }
    }

    public int getValeur() {
        return valeur;
    }

    
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return nom + " de " + couleur.getNom();
    }

}