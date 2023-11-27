package services;

import java.util.List;

import entities.Tecnicos;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import repositories.TecnicosRepository;

public class TecnicosImplements implements TecnicosRepository {

	public void cargaInicial() {
		EntityManager em = getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Tecnicos tecnico = new Tecnicos("20-21545878-8", "Juan Pérez"); 
		em.persist(tecnico);		
		tecnico = new Tecnicos("20-32423531-1", "Peralta Daniel"); 
		em.persist(tecnico);
		tecnico = new Tecnicos("27-31582986-6", "Bernal Cecilia"); 
		em.persist(tecnico);
		tecnico = new Tecnicos("20-36541411-1", "Mario Balotelli"); 
		em.persist(tecnico);
		tecnico = new Tecnicos("20-24874236-6", "Esteban Gonzalez"); 
		em.persist(tecnico);
		tecnico = new Tecnicos("20-14789541-1", "Julio Acosta"); 
		em.persist(tecnico);
		tx.commit();

	}

	public void agregarTecnico(Tecnicos tecnico) {
		// TODO Auto-generated method stub

	}

	public List<Tecnicos> listarTecnicos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void eliminarTecnico(Tecnicos tecnico) {
		// TODO Auto-generated method stub

	}

	public Tecnicos buscarTecnico(int idTecnico) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//EntityFactory
	public static EntityManager getEntityManager(){
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
		 EntityManager manager = factory.createEntityManager();
		 return manager;
	}

}
