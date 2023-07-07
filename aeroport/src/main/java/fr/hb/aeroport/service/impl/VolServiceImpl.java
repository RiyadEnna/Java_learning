package fr.hb.aeroport.service.impl;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import fr.hb.aeroport.business.Vol;
import fr.hb.aeroport.dao.VolDao;
import fr.hb.aeroport.dao.impl.VolDaoImpl;
import fr.hb.aeroport.service.AeroportService;
import fr.hb.aeroport.service.CompagnieService;
import fr.hb.aeroport.service.VolService;

public class VolServiceImpl implements VolService {

	private VolDao volDao = new VolDaoImpl();
	private CompagnieService compagnieService = new CompagnieServiceImpl();
	private AeroportService aeroportService = new AeroportServiceImpl();

	
	
	@Override
	public Vol ajouterVol(LocalDateTime dateHeureDepart, LocalDateTime dateHeureArrivee, float prixEnEuros,
			long idCompagnie, long idAeroportDepart, long idAeroportArrivee) {
		Vol vol = new Vol(dateHeureDepart,dateHeureArrivee,prixEnEuros,compagnieService.recupererCompagnieParId(idCompagnie),aeroportService.recupererAeroportParId(idAeroportDepart),aeroportService.recupererAeroportParId(idAeroportArrivee));
		
		try {
			volDao.createflight(vol);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return vol;
	}

	@Override
	public List<Vol> recupererVolsTrieParPrix() {
		try {
			volDao.findAllFlightsOrderByPrice();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return Collections.emptyList();
	}

	@Override
	public Vol modifierVol(Vol vol) {
		try {
			volDao.updateVol(vol);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return vol;
	}

}
