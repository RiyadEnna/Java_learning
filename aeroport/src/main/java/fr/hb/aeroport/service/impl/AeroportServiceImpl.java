package fr.hb.aeroport.service.impl;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import fr.hb.aeroport.business.Aeroport;
import fr.hb.aeroport.dao.AeroportDao;
import fr.hb.aeroport.dao.impl.AeroportDaoImpl;
import fr.hb.aeroport.service.AeroportService;

public class AeroportServiceImpl implements AeroportService {

	private AeroportDao aeroportDao = new AeroportDaoImpl();
	
	
	
	@Override
	public Aeroport ajouterAeroport(String nom) {
		Aeroport aeroport = new Aeroport(nom);
		
		try {
			aeroportDao.createAeroport(aeroport);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return aeroport;
	}

	@Override
	public Aeroport recupererAeroportParId(long id) {
		try {
			return aeroportDao.recupererAeroportParId(id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return null;

	}

	@Override
	public List<Aeroport> recupererTousLesAeroports() {
		try {
			aeroportDao.recupererAeroport();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return Collections.emptyList();
	}

	@Override
	public Aeroport modifierAeroport(Aeroport aeroport) {
		try {
			aeroportDao.updateAeroport(aeroport);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return aeroport;
	}

	@Override
	public boolean deleteAeroport(Long id) {
		try {
			aeroportDao.deleteAeroport(id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return false;
	}

}
