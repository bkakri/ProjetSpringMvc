package com.stock.mvc.Services.Imp;

import java.util.List;

import com.stock.mvc.DAO.ICommandeClient;
import com.stock.mvc.Entities.CommandeClient;
import com.stock.mvc.Services.ICommandeClientService;

public class CommandeClientServiceImpl implements ICommandeClientService {

    private ICommandeClient dao;
	
	public void setDao(ICommandeClient dao) {
		this.dao = dao;
	}

	@Override
	public CommandeClient save(CommandeClient entity) {
		return dao.save(entity);
	}

	@Override
	public CommandeClient update(CommandeClient entity) {
		return dao.update(entity);
	}

	@Override
	public List<CommandeClient> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<CommandeClient> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public CommandeClient getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public CommandeClient findOne(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}

	@Override
	public CommandeClient findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findcountBy(paramName, paramValue);
	}

}
