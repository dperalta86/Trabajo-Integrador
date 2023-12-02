package services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PersistenceEntityManager {
	
	public EntityManager getEntityManager(){
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
		 EntityManager manager = factory.createEntityManager();
		 return manager;
	}

}
