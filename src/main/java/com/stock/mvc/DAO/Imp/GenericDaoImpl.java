package com.stock.mvc.DAO.Imp;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.constraints.Size;

import com.stock.mvc.DAO.IGenericDao;

public class GenericDaoImpl<E> implements IGenericDao<E>{

	@PersistenceContext
	EntityManager em;
	public Class<E> type;
	
	public GenericDaoImpl() {
		Type t=getClass().getGenericSuperclass();
		ParameterizedType pt=(ParameterizedType)t;
		type=(Class<E>)pt.getActualTypeArguments()[0];
	}

	@Override
	public E save(E entity) {
		em.persist(entity);
		return entity;
	}

	@Override
	public E update(E entity) {
		
		return em.merge(entity);
	}

	@Override
	public List<E> selectAll() {
		Query qr=em.createNamedQuery("select t from " +type.getSimpleName()+"t");
		return qr.getResultList();
	}
	
	@Override
	public List<E> selectAll(String sortFiled, String sort) {
		Query query1=em.createNamedQuery("select t from "+type.getSimpleName()+"t order by"+sortFiled+sort);
		return query1.getResultList();
	}
	
	
	@Override
	public E getById(long id) {
		return em.find(type, id);
	}

	@Override
	public void remove(long id) {
		E tab=em.getReference(type, id);
		em.remove(tab);
	}

	@Override
	public E findOneBy(String paramName, Object paramValue) {
		
		Query query2=em.createNamedQuery("select t from" +type.getSimpleName()+" t where "+paramName+":=x");
		query2.setParameter(paramName, paramValue);
		return  query2.getResultList().size()>0 ?(E)query2.getResultList().get(0):null;
	}

	@Override
	public E findOneBy(String[] paramNames, Object[] paramValues) {
		if (paramNames.length != paramValues.length) {
			return null;
		}
		String queryString = "select e from " + type.getSimpleName() + " e where ";
		int len = paramNames.length;
		for (int i = 0; i < len; i++) {
			queryString += " e." + paramNames[i] + "= :x" + i;
			if ((i + 1) < len) {
				queryString += " and ";
			}
		}
		Query query = em.createQuery(queryString);
		for (int i = 0; i < paramValues.length; i++) {
			query.setParameter("x" + i, paramValues[i]);
		}
		return query.getResultList().size() > 0 ? (E) query.getResultList().get(0) : null;
	}

	@Override
	public int findcountBy(String paramName, Object paramValue) {
		Query query = em.createQuery("select t from " + type.getSimpleName() + " t where " + paramName + " = :x");
		query.setParameter(paramName, paramValue);
		return query.getResultList().size() > 0 ? ((Long) query.getSingleResult()).intValue() : 0;
	
	}

}
