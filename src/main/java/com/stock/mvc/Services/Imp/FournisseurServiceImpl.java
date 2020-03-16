package com.stock.mvc.Services.Imp;

import java.util.List;

import com.stock.mvc.DAO.IFournisseurDao;
import com.stock.mvc.Entities.Fournisseur;
import com.stock.mvc.Services.IFournisseurService;

public class FournisseurServiceImpl implements IFournisseurService {

    private IFournisseurDao dao;
	
	public void setDao(IFournisseurDao dao) {
		this.dao = dao;
	}

	@Override
	public Fournisseur save(Fournisseur entity) {
		return dao.save(entity);
	}

	@Override
	public Fournisseur update(Fournisseur entity) {
		return dao.update(entity);
	}

	@Override
	public List<Fournisseur> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Fournisseur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Fournisseur getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Fournisseur findOne(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}

	@Override
	public Fournisseur findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findcountBy(paramName, paramValue);
	}
}
