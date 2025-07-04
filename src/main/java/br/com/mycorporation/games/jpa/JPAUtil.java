package br.com.mycorporation.games.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static final EntityManagerFactory factory = Persistence
			.createEntityManagerFactory("games");
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
