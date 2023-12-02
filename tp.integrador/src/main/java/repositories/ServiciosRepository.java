package repositories;

import entities.Servicios;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import services.PersistenceEntityManager;

public class ServiciosRepository {
	
	public void cargaInicial() {
		EntityManager em = new PersistenceEntityManager().getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Servicios servicio = new Servicios("SAP" , 2.5f); 
		em.persist(servicio);	
		servicio = new Servicios("Tango Factura", 1f); 
		em.persist(servicio);
		servicio = new Servicios("Tango Gestion", 1.5f); 
		em.persist(servicio);
		servicio = new Servicios("Office", 1f); 
		em.persist(servicio);
		servicio = new Servicios("Dolibar", 2.5f); 
		em.persist(servicio);
		
		tx.commit();

	}

}
