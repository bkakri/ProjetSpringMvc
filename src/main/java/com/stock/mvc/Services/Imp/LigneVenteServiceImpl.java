package com.stock.mvc.Services.Imp;

import java.util.List;

import com.stock.mvc.DAO.ILigneVente;
import com.stock.mvc.Entities.LigneVente;
import com.stock.mvc.Services.ILigneVenteService;

public class LigneVenteServiceImpl implements ILigneVenteService {

	private ILigneVente dao;
	
	public void setDao(ILigneVente dao) {
		this.dao = dao;
	}

	@Override
	public LigneVente save(LigneVente entity) {
		return dao.save(entity);
	}

	@Override
	public LigneVente update(LigneVente entity) {
		return dao.update(entity);
	}

	@Override
	public List<LigneVente> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<LigneVente> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneVente getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public LigneVente findOne(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}

	@Override
	public LigneVente findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findcountBy(paramName, paramValue);
	}

}
