package fr.hb.business;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public abstract class Document {

//Attributs
    private LocalDateTime dateDeCreation;
    private Client client;
    private List<Ligne> lignes;

//Constructeurs
// Constructeur par default

    public Document(Client client) {
        super();
        lignes = new ArrayList<>();
        dateDeCreation = LocalDateTime.now();
        client.getDocuments().add(this);

    }


    public Document(LocalDateTime dateDeCreation, Client client) {
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

    public List<Ligne> getLignes() {
        return lignes;
    }

    public void setLignes(List<Ligne> lignes) {
        this.lignes = lignes;
    }

//toString
    @Override
    public String toString() {
        return "Document [dateDeCreation=" + dateDeCreation + ", client=" + client + ", lignes=" + lignes + "]";
    }
}