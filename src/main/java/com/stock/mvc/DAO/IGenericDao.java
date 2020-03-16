package com.stock.mvc.DAO;
import java.util.*;

public interface IGenericDao<E> {

	//Ajout d'un objet
	public E save(E entity);
	//Mose à jour d'un objet
	public E update(E entity);
	//La liste des objets
	public List<E> selectAll();
	//Recherche d'un objet par Id
	public E getById(long id);
	//La supression d'un objet
	public void remove(long id);
	//La liste des objets par parametres
	public List<E> selectAll(String sortFiled,String sort);
	public E findOneBy(String paramName,Object paramValue);
	public E findOneBy(String[] paramNames,Object[] paramValue);
	public int findcountBy(String paramNames,Object paramValue);
}
