package com.stock.mvc.Services.Imp;

import java.util.List;

import com.stock.mvc.DAO.ICategory;
import com.stock.mvc.Entities.Article;
import com.stock.mvc.Entities.Category;
import com.stock.mvc.Services.ICategoryService;

public class CategoryServiceImpl implements ICategoryService {


	private ICategory dao;
	
	public void setDao(ICategory dao) {
		this.dao = dao;
	}

	@Override
	public Category save(Category entity) {
		return dao.save(entity);
	}

	@Override
	public Category update(Category entity) {
		return dao.update(entity);
	}

	@Override
	public List<Category> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Category> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Category getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Category findOne(String paramName, Object paramValue) {
		return dao.findOneBy(paramName, paramValue);
	}

	@Override
	public Category findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOneBy(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findcountBy(paramName, paramValue);
	}

	@Override
	public List<Article> selectAllArticlesByCategory(Long idCategory) {
		return dao.selectAllArticlesByCategory(idCategory);
	}

}
