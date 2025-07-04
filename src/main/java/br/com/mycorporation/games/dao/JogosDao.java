package br.com.mycorporation.games.dao;

import javax.persistence.EntityManager;

import br.com.mycorporation.games.models.Jogos;

public class JogosDao {
	
	private EntityManager em;

	public JogosDao(EntityManager em) {
		this.em = em;
	}
	
	public void Cadastrar(Jogos jogos) { 
		this.em.persist(jogos);
	}
}
