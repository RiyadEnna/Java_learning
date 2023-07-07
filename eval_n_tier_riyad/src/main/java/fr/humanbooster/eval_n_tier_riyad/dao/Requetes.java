package fr.humanbooster.eval_n_tier_riyad.dao;

public class Requetes {
	//C
	public static final String AJOUT_UTILISATEUR = "INSERT INTO Utilisateur (nom,prenom,dateNaissance) VALUES (?,?,?)";

	//R
	public static final String TROUVER_UTILISATEUR_PAR_ID = "SELECT * FROM Utilisateur WHERE id =(?)";
	public static final String TROUVER_UTILISATEUR_ALL_ORDER_BY_DATA_NAISSANCE = "SELECT * FROM Utilisateur ORDER BY `dateNaissance`";

	//U
	public static final String METTRE_A_JOUR_UTILISATEUR = "UPDATE Utilisateur SET `nom` =(?),`prenom`=(?),`dateNaissance`=(?) WHERE id=? ";
	//D
	public static final String SUPPR_UTILISATEUR_PAR_ID = "DELETE FROM Utilisateur WHERE id=(?)";

}
