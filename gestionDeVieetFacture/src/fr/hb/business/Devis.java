package fr.hb.business;

import java.time.LocalDateTime;
import java.util.Date;


public class Devis extends Document {
    // attributs
    private Long reference ;
    private static Long compteur = 0L;
    private LocalDateTime dateDeValidite;
    // constructors

    public Devis(Client client) {
        super(client);
        reference = ++ compteur;
     }

    public Devis(Client client,LocalDateTime date) {
        this(client);
        this.dateDeValidite = date ;
    }
    //get set

	public long getReference() {
		return reference;
	}

	public void setReference(long reference) {
		this.reference = reference;
	}

	public LocalDateTime getDateDeValidite() {
		return dateDeValidite;
	}

	public void setDateDeValidite(LocalDateTime dateDeValidite) {
		this.dateDeValidite = dateDeValidite;
	}
    //to string

	@Override
	public String toString() {
		return "Devis [reference=" + reference + ", dateDeValidite=" + dateDeValidite + "]";
	}



    

	
}
