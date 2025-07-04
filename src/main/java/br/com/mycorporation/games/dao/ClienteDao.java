package br.com.mycorporation.games.dao;

import javax.persistence.EntityManager;

import br.com.mycorporation.games.models.Cliente;

public class ClienteDao {
	
	private EntityManager em;

	public ClienteDao(EntityManager em) {
		this.em = em;
	}
	
	public void Cadastrar(Cliente cliente) {
		this.em.persist(cliente);
	}
	
}
