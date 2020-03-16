package com.stock.mvc.Services.Imp;

import java.util.List;

import com.stock.mvc.DAO.IClient;
import com.stock.mvc.Entities.Client;
import com.stock.mvc.Services.IClientService;

public class ClientServiceImpl implements IClientService {

	private IClient dao;
	
	public void setDao(IClient dao) {
		this.dao = dao;
	}

	@Override
	public Client save(Client entity) {
		return dao.save(entity);
	}

	@Override
	public Client update(Client entity) {
		return dao.update(entity);
	}

	@Override
	public List<Client> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Client> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Client getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Client findOne(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}

	@Override
	public Client findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findcountBy(paramName, paramValue);
	}

}
