package com.stock.mvc.DAO;

import java.util.List;

import com.stock.mvc.Entities.Article;
import com.stock.mvc.Entities.Category;

public interface ICategory extends  IGenericDao<Category> {
	
	//Liste des articles par category
	public List<Article> selectAllArticlesByCategory(Long idCategory);
	
}
