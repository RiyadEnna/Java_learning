package fr.hb.business;

public class Couleur {

    // Attribut(s)
    private String nom;

    // Constructeur(s)
    public Couleur(String nom) {
        super();
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Couleur [nom=" + nom + "]";
    } 
}