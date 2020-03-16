package com.stock.mvc.DAO.Imp;

import java.util.List;

import javax.persistence.Query;

import com.stock.mvc.DAO.ILigneCommandeClient;
import com.stock.mvc.Entities.LigneCommandeClient;

public class LigneCommandeClientDaoImpl extends GenericDaoImpl<LigneCommandeClient> implements ILigneCommandeClient {

	@SuppressWarnings("unchecked")
	@Override
	public List<LigneCommandeClient> getByIdCommande(Long idCommandeClient) {
		String queryString = "select lc from " + LigneCommandeClient.class.getSimpleName() + " lc where lc.commandeClient.idCommandeClient = :x";
		Query query = em.createQuery(queryString);
		query.setParameter("x", idCommandeClient);
		return query.getResultList();
	}

}

