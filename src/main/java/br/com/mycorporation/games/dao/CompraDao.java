package br.com.mycorporation.games.dao;

import javax.persistence.EntityManager;

import br.com.mycorporation.games.models.Compra;

public class CompraDao {
	
	private EntityManager em;

	public CompraDao(EntityManager em) {
		this.em = em;
	}
	
	public void Cadastrar(Compra compra) {
		this.em.persist(compra);
	}
}
