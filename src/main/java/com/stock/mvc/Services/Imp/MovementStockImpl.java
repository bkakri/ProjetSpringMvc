package com.stock.mvc.Services.Imp;

import java.util.List;

import com.stock.mvc.DAO.Imp.MovementsStockDaoImpl;
import com.stock.mvc.Entities.MovementsStock;
import com.stock.mvc.Services.IMovementStock;

public class MovementStockImpl implements IMovementStock {

	private MovementsStockDaoImpl dao;
	
	public void setDao(MovementsStockDaoImpl dao) {
		this.dao = dao;
	}

	@Override
	public MovementsStock save(MovementsStock entity) {
		return dao.save(entity);
	}

	@Override
	public MovementsStock update(MovementsStock entity) {
		return dao.update(entity);
	}

	@Override
	public List<MovementsStock> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<MovementsStock> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public MovementsStock getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public MovementsStock findOne(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}

	@Override
	public MovementsStock findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findcountBy(paramName, paramValue);
	}


}
