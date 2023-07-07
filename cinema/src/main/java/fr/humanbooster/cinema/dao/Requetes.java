package fr.humanbooster.cinema.dao;

public class Requetes {
	//C
	public static final String AJOUT_CINEMA = "INSERT INTO Cinema (nom,heureOuverture,heureFermeture) VALUES (?,?,?)";

	//R
	public static final String TROUVER_CINEMA_PAR_ID = "SELECT * FROM Cinema WHERE id =(?)";
	public static final String TROUVER_CINEMA_ALL_ORDER_BY_NOM = "SELECT * FROM Cinema ORDER BY `nom`";

	//U
	public static final String METTRE_A_JOUR_CINEMA = "UPDATE Cinema SET `nom` =(?),`heureOuverture`=(?),`heureFermeture`=(?) WHERE id=? ";
	//D
	public static final String SUPPR_CINEMA_PAR_ID = "DELETE FROM Cinema WHERE id=(?)";
}
