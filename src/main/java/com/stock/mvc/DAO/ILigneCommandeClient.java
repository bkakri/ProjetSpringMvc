package com.stock.mvc.DAO;

import java.util.List;


import com.stock.mvc.Entities.LigneCommandeClient;

public interface ILigneCommandeClient  extends IGenericDao<LigneCommandeClient>{

	List<LigneCommandeClient> getByIdCommande(Long idCommandeClient);

}
