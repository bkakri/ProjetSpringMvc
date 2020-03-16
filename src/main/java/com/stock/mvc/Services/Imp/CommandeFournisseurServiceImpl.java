package com.stock.mvc.Services.Imp;

import java.util.List;

import com.stock.mvc.DAO.ICommandeFournisseur;
import com.stock.mvc.Entities.CmmandeFournisseur;
import com.stock.mvc.Services.ICommandeFournisseurService;

public class CommandeFournisseurServiceImpl implements ICommandeFournisseurService {


	private ICommandeFournisseur dao;
	
	public void setDao(ICommandeFournisseur dao) {
		this.dao = dao;
	}

	@Override
	public CmmandeFournisseur save(CmmandeFournisseur entity) {
		return dao.save(entity);
	}

	@Override
	public CmmandeFournisseur update(CmmandeFournisseur entity) {
		return dao.update(entity);
	}

	@Override
	public List<CmmandeFournisseur> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<CmmandeFournisseur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public CmmandeFournisseur getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public CmmandeFournisseur findOne(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}

	@Override
	public CmmandeFournisseur findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findcountBy(paramName, paramValue);
	}


	

}
