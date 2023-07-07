package fr.humanbooster.riyadennaoura.poney_club.business;

public class Equipement {
	private String nomEquipement;
	private int stockEquipement;
	
	
	public Equipement() {
		super();
	}
	public Equipement(String nomEquipement,int stockEquipement) {
		this();
		this.nomEquipement = nomEquipement;
		this.stockEquipement = stockEquipement;
	}
	

	public String getNom() {
		return nomEquipement;
	}
	
	public void setNom(String nomEquipement) {
		this.nomEquipement = nomEquipement;
	}
	
	public int getStock() {
		return stockEquipement;
	}
	
	public void setStock(int stockEquipement) {
		this.stockEquipement = stockEquipement;
	}

	@Override
	public String toString() {
		return "Equipement [nomEquipement=" + nomEquipement + ", stockEquipementDisponible=" + stockEquipement + "]";
	}
	
	
}
