package com.stock.mvc.Services;

import java.util.List;

import com.stock.mvc.Entities.MovementsStock;

public interface IMovementStock {
	public MovementsStock save(MovementsStock entity);
	
	public MovementsStock update(MovementsStock entity);

	public List<MovementsStock> selectAll();

	public List<MovementsStock> selectAll(String sortField, String sort);

	public MovementsStock getById(Long id);

	public void remove(Long id);

	public MovementsStock findOne(String paramName, Object paramValue);

	public MovementsStock findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);

}
