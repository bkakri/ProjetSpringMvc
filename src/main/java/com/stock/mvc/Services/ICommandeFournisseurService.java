package com.stock.mvc.Services;

import java.util.List;

import com.stock.mvc.Entities.CmmandeFournisseur;

public interface ICommandeFournisseurService {

	public CmmandeFournisseur save(CmmandeFournisseur entity);
	
	public CmmandeFournisseur update(CmmandeFournisseur entity);

	public List<CmmandeFournisseur> selectAll();

	public List<CmmandeFournisseur> selectAll(String sortField, String sort);

	public CmmandeFournisseur getById(Long id);

	public void remove(Long id);

	public CmmandeFournisseur findOne(String paramName, Object paramValue);

	public CmmandeFournisseur findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);
}
