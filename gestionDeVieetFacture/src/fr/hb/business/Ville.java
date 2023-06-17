package fr.hb.business;

public class Ville {

// Attributs

    private Long id;
    private static Long compteur = 0L;
    private String codeInsee;
    private String nom;
    private String codePostal;
    private Double longitude;
    private Double latitude;
    private String complement;

//Constructeurs
// Constructeur par default

    public Ville() {
        super();
        id = ++compteur;
    }

// surcharges de constructeurs

    public Ville(String codeInsee, String nom, String codePostal) {
        this();
        this.codeInsee = codeInsee;
        this.nom = nom;
        this.codePostal = codePostal;
    }

    public Ville(String codeInsee, String nom, String codePostal, String complement) {
        this(codeInsee, nom, codePostal);
        this.complement = complement;
    }

//Getter et Mutateur

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeInsee() {
        return codeInsee;
    }

    public void setCodeInsee(String codeInsee) {
        this.codeInsee = codeInsee;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

//toString

    @Override
    public String toString() {
        return "Ville [id=" + id + ", codeInsee=" + codeInsee + ", nom=" + nom + ", codePostal=" + codePostal
                + ", longitude=" + longitude + ", latitude=" + latitude + ", complement=" + complement + "]";
    }
}
