package fr.hb.aeroport.dao;

public class Requetes {
	// Aeroport
	public static final String REQUETE_AJOUT_AEROPORT = "INSERT INTO Aeroport (nom) VALUES (?)";
	public static final String REQUETE_SELECTION_AEROPORT_PAR_ID = "SELECT * FROM Aeroport WHERE id=?";
	public static final String REQUETE_SELECTION_AEROPORT_ALL = "SELECT * FROM Aeroport ";
	public static final String REQUETE_MISE_A_JOUR_NOM_AEROPORT = "UPDATE `Aeroport` SET `nom` =(?) WHERE id=? ";
	public static final String REQUETE_SUPPRESSION_AEROPORT = "DELETE FROM Aeroport  WHERE id=? ";
	// Compagnie
	public static final String REQUETE_AJOUT_COMPAGNIE = "INSERT INTO Compagnie (nom) VALUES (?)";
	public static final String REQUETE_SELECTION_COMPAGNIE_PAR_ID = "SELECT * FROM Compagnie WHERE id=?";
	public static final String REQUETE_SELECTION_COMPAGNIE_ALL = "SELECT * FROM Compagnie ";
	public static final String REQUETE_SUPPRESSION_COMPAGNIE = "DELETE FROM Compagnie  WHERE id=? ";
	// Vols
	public static final String REQUETE_AJOUT_VOL = "INSERT INTO Vol (heureDepart,heureArrive,compagnie,prix,aeroportArrive,aeroportDepart) VALUES (?,?,?,?,?,?)";
	public static final String REQUETE_MISE_A_JOUR_VOL = "UPDATE `Vol` SET `heureDepart` =(?),`heureArrive` =(?),`compagnie` =(?),`prix` =(?),`aeroportArrive` =(?),`aeroportDepart` =(?) WHERE id=? ";
	public static final String REQUETE_SELECTION_TOUT_VOL_TRIER = "SELECT * FROM Vol ORDER BY prix ";

}
