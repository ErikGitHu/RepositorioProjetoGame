package br.com.mycorporation.games.main;

import javax.persistence.EntityManager;

import br.com.mycorporation.games.dao.ClienteDao;
import br.com.mycorporation.games.dao.CompraDao;
import br.com.mycorporation.games.dao.JogosDao;
import br.com.mycorporation.games.dao.PagamentoDao;
import br.com.mycorporation.games.jpa.JPAUtil;
import br.com.mycorporation.games.models.Cliente;
import br.com.mycorporation.games.models.Compra;
import br.com.mycorporation.games.models.Jogos;
import br.com.mycorporation.games.models.Pagamento;

public class Principal {
	
	public static void main(String[] args) {

		
		Cliente cliente = new Cliente();
		Jogos jogos = new Jogos();
		Compra compra = new Compra();
		Pagamento pagamento = new Pagamento();
		
		EntityManager em = JPAUtil.getEntityManager();
		ClienteDao clienteDao = new ClienteDao(em);
		JogosDao jogosDao = new JogosDao(em);
		CompraDao compraDao = new CompraDao(em);
		PagamentoDao pagamentoDao = new PagamentoDao(em);
		
		em.getTransaction().begin();
		
		clienteDao.Cadastrar(cliente);
		jogosDao.Cadastrar(jogos);
		compraDao.Cadastrar(compra);
		pagamentoDao.Cadastrar(pagamento);
		
		em.getTransaction().commit();
		em.close();
	}
	
}
