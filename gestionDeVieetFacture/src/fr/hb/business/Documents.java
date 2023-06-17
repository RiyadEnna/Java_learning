package fr.hb.business;

import java.time.LocalDateTime;
import java.util.ArrayList;


public abstract class Documents {

//Attributs
    private LocalDateTime dateDeCreation;
    private Client client;
    private ArrayList<Lignes> lignes;

//Constructeurs
// Constructeur par default

    public Documents() {
        super();
        lignes = new ArrayList<>();
        dateDeCreation = LocalDateTime.now();
    }

    public Documents(Client client) {
        this();
        this.client = client;
        client.getDocuments().add(this);
    }

    public Documents(LocalDateTime dateDeCreation, Client client) {
        this(client);
        this.dateDeCreation = dateDeCreation;
    }

//Get Set

    public LocalDateTime getDateDeCreation() {
        return dateDeCreation;
    }

    public void setDateDeCreation(LocalDateTime dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<Lignes> getLignes() {
        return lignes;
    }

    public void setLignes(ArrayList<Lignes> lignes) {
        this.lignes = lignes;
    }

//toString
    @Override
    public String toString() {
        return "Document [dateDeCreation=" + dateDeCreation + ", client=" + client + ", lignes=" + lignes + "]";
    }
}