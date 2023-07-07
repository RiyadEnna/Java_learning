package fr.humanbooster.riyadennaoura.poney_club.business;

import java.util.ArrayList;
import java.util.List;

public class Stage {
	private Code codeStage;
	private Cavalier cavalier;
	private Poney poney;
	float prix;
    private List<Equipement> collectionDequipement;
    private String nomActivite = "";
    
	
	public Stage() {
		super();
        collectionDequipement = new ArrayList<>();
	}
	public Stage(Code codeStage, Cavalier cavalier,Poney poney,float prix) {
		this();
		this.codeStage = codeStage;
		this.cavalier = cavalier;
		this.poney = poney;
		this.prix = prix;
	}
	
	public Stage(Code codeStage, Cavalier cavalier,Poney poney,float prix,String nomActivite) {
		this(codeStage,cavalier,poney,prix);
		this.nomActivite = nomActivite;
	}
	
	public String getnomActivite() {
		return nomActivite;
	}
	
	public void setnomActivite(String nomActivite) {
		this.nomActivite = nomActivite;
	}
	


	public Code getCodeStage() {
		return codeStage;
	}
	
	public void setCodeStage(Code codeStage) {
		this.codeStage = codeStage;
	}
	
	public Cavalier getCavalier(){
		return cavalier;
	}
	
	public void setCavalier(Cavalier cavalier) {
		this.cavalier = cavalier;
	}
	
	
    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
	
	public Poney getPoney() {
		return poney;
	}
	
	public void setPoney(Poney poney) {
		this.poney = poney;
	}
	
    public List<Equipement> getCollectionDequipement() {
        return collectionDequipement;
    }

    public void setCollectionDequipement(List<Equipement> collectionDequipement) {
        this.collectionDequipement = collectionDequipement;
    }
    


	@Override
	public String toString() {
		return "Stage [codeStage=" + codeStage + ", cavalier=" + cavalier + ", poney=" + poney + ", prix=" + prix
				+ ", collectionDequipement=" + collectionDequipement + ", nomActivite=" + nomActivite + "]";
	}

    
    

	
	
	
}
