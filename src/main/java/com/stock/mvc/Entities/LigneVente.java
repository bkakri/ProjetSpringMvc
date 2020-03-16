package com.stock.mvc.Entities;

import java.io.Serializable;


import javax.persistence.*;

@Entity
public class LigneVente implements Serializable{

	@Id
	@GeneratedValue
	private Long idLigneVente;
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "vente")
	private Vente vente;

	public Long getIdLigneVente() {
		return idLigneVente;
	}

	public void setIdLigneVente(Long id) {
		this.idLigneVente = id;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	

}
