package com.stock.mvc.Services.Imp;

import java.util.List;

import com.stock.mvc.DAO.ILigneCommandeClient;
import com.stock.mvc.Entities.LigneCommandeClient;
import com.stock.mvc.Services.ILigneCommandeClientService;

public class LigneCommandeClientServiceImpl implements ILigneCommandeClientService {

	
	private ILigneCommandeClient dao;
	
	public void setDao(ILigneCommandeClient dao) {
		this.dao = dao;
	}
	
	@Override
	public LigneCommandeClient save(LigneCommandeClient entity) {
		return dao.save(entity);
	}



	@Override
	public LigneCommandeClient update(LigneCommandeClient entity) {
		return dao.update(entity);
	}

	@Override
	public List<LigneCommandeClient> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<LigneCommandeClient> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneCommandeClient getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public LigneCommandeClient findOne(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}

	@Override
	public LigneCommandeClient findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findcountBy(paramName, paramValue);
	}

	@Override
	public List<LigneCommandeClient> getByIdCommande(Long idCommandeClient) {
		return dao.getByIdCommande(idCommandeClient);
	}

}
