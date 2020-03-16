package com.stock.mvc.Entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class LigneCommandeFournisseur implements Serializable{


	@Id
	@GeneratedValue
	private Long idLigneCdeFrs;
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "idCommandeFournisseur")
	private CmmandeFournisseur commandeFournisseur;

	public Long getIdLigneCdeFrs() {
		return idLigneCdeFrs;
	}

	public void setIdLigneCdeFrs(Long id) {
		this.idLigneCdeFrs = id;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CmmandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(CmmandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}

}
