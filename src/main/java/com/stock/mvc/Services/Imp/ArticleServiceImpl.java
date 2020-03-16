package com.stock.mvc.Services.Imp;

import java.util.List;

import com.stock.mvc.DAO.IArticleDAO;
import com.stock.mvc.Entities.Article;
import com.stock.mvc.Services.IArticleService;

public class ArticleServiceImpl implements IArticleService {

private IArticleDAO dao;
	
	public void setDao(IArticleDAO dao) {
		this.dao = dao;
	}

	@Override
	public Article save(Article entity) {
		return dao.save(entity);
	}

	@Override
	public Article update(Article entity) {
		return dao.update(entity);
	}

	@Override
	public List<Article> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Article> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Article getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Article findOne(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}

	@Override
	public Article findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findcountBy(paramName, paramValue);
	}
}
