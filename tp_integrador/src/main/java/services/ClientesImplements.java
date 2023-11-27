package services;

import java.util.List;

import entities.Clientes;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import repositories.ClientesRepository;

public class ClientesImplements implements ClientesRepository {

	public void cargaInicial() {
		EntityManager em = getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Clientes cliente = new Clientes("30-71592991-7", "Grupo Peralta SAS"); 
		em.persist(cliente);	
		cliente = new Clientes("30-87456321-7", "Sociedades Fiscales SA"); 
		em.persist(cliente);
		cliente = new Clientes("30-75698742-4", "Facility Services SRL"); 
		em.persist(cliente);		
		tx.commit();

	}

	public void agregarCliente(Clientes cliente) {
		// TODO Auto-generated method stub

	}

	public List<Clientes> listarClientes() {
		// TODO Auto-generated method stub
		return null;
	}

	public void eliminarCliente(Clientes cliente) {
		// TODO Auto-generated method stub

	}

	public Clientes buscarClienteo(int idCliente) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static EntityManager getEntityManager(){
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
		 EntityManager manager = factory.createEntityManager();
		 return manager;
	}

}
