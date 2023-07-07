package fr.hb.aeroport.service.impl;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;


import fr.hb.aeroport.business.Compagnie;
import fr.hb.aeroport.dao.CompagnieDao;
import fr.hb.aeroport.dao.impl.CompagnieDaoImpl;
import fr.hb.aeroport.service.CompagnieService;

public class CompagnieServiceImpl implements CompagnieService {
	private CompagnieDao compagnieDao = new CompagnieDaoImpl();

	@Override
	public Compagnie ajouterCompagnie(String nom) {
		Compagnie compagnie = new Compagnie(nom);
		
		try {
			compagnieDao.createCompagnie(compagnie);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return compagnie;
	}

	@Override
	public Compagnie recupererCompagnieParId(Long id) {
		try {
			return compagnieDao.findOneCompagnieById(id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public List<Compagnie> recupererToutesCompagnies() {
		try {
			compagnieDao.findAllCompagnies();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return Collections.emptyList();
	}

	@Override
	public boolean supprimerCompagnie(Long id) {
		try {
			compagnieDao.delete(id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return false;
	}

}


