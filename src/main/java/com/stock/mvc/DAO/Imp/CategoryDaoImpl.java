package com.stock.mvc.DAO.Imp;


import java.util.List;

import javax.persistence.Query;

import com.stock.mvc.DAO.ICategory;
import com.stock.mvc.Entities.Article;
import com.stock.mvc.Entities.Category;



@SuppressWarnings("unchecked")
public class CategoryDaoImpl extends GenericDaoImpl<Category> implements ICategory {

	@Override
	public List<Article> selectAllArticlesByCategory(Long idCategory) {
		Query query = em.createQuery("select a from " + Article.class.getSimpleName() + " a where a.category.idCategory = :x");
		query.setParameter("x", idCategory);
		return query.getResultList();
	}

}
