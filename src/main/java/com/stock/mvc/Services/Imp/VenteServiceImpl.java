package com.stock.mvc.Services.Imp;

import java.util.List;

import com.stock.mvc.DAO.Ivente;
import com.stock.mvc.Entities.Vente;
import com.stock.mvc.Services.IVenteService;

public class VenteServiceImpl implements IVenteService {

  private Ivente dao;
	
	public void setDao(Ivente dao) {
		this.dao = dao;
	}

	@Override
	public Vente save(Vente entity) {
		return dao.save(entity);
	}

	@Override
	public Vente update(Vente entity) {
		return dao.update(entity);
	}

	@Override
	public List<Vente> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Vente> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Vente getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Vente findOne(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}

	@Override
	public Vente findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findcountBy(paramName, paramValue);
	}


}
