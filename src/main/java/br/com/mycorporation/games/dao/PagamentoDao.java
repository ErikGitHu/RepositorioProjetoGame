package br.com.mycorporation.games.dao;

import javax.persistence.EntityManager;

import br.com.mycorporation.games.models.Pagamento;

public class PagamentoDao {
	
	private EntityManager em;

	public PagamentoDao(EntityManager em) {
		this.em = em;
	}
	
	public void Cadastrar(Pagamento pagamento) {
		this.em.persist(pagamento);
	}
}
