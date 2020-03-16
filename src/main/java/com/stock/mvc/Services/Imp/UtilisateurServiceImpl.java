package com.stock.mvc.Services.Imp;

import java.util.List;

import com.stock.mvc.DAO.Iutilisateur;
import com.stock.mvc.Entities.Utilisateur;
import com.stock.mvc.Services.IUtilisateurService;

public class UtilisateurServiceImpl implements IUtilisateurService {

	private Iutilisateur dao;
	
	public void setDao(Iutilisateur dao) {
		this.dao = dao;
	}

	@Override
	public Utilisateur save(Utilisateur entity) {
		return dao.save(entity);
	}

	@Override
	public Utilisateur update(Utilisateur entity) {
		return dao.update(entity);
	}

	@Override
	public List<Utilisateur> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Utilisateur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Utilisateur getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Utilisateur findOne(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}

	@Override
	public Utilisateur findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findcountBy(paramName, paramValue);
	}
}
