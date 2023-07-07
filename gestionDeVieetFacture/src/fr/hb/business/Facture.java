
package fr.hb.business;

import java.time.LocalDateTime;

public class Facture extends Document {
    // attributs
    private long numero ;
    private static long compteur = 0L;
    private LocalDateTime dateEcheance;
    // constructors

    public Facture(Client client) {
        super(client);
        numero = ++ compteur;
     }

    public Facture(Client client,LocalDateTime dateEcheance) {
        this(client);
        this.dateEcheance = dateEcheance ;
    }


    // getters setters 

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public LocalDateTime getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(LocalDateTime dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    // toString

    @Override
    public String toString() {
        return "Facture [numero=" + numero + ", dateEcheance=" + dateEcheance + "]";
    }






}