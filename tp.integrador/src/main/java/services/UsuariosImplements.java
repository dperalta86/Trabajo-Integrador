package services;

import java.util.List;

import entities.Clientes;
import entities.Usuarios;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import repositories.usuariosRespository;

public class UsuariosImplements implements usuariosRespository {

	@Override
	public void cargaInicial() {
		EntityManager em = new PersistenceEntityManager().getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Usuarios usuario = new Usuarios("Tecnico", "pass123", 1, "tecnico@grupoperalta.com.ar"); 
		em.persist(usuario);	
		usuario = new Usuarios("Operador", "pass123", 2, "operador@grupoperalta.com.ar"); 
		em.persist(usuario);
		usuario = new Usuarios("Comercial", "pass123", 2, "comercial@grupoperalta.com.ar"); 
		em.persist(usuario);
		usuario = new Usuarios("RRHH", "pass123", 2, "rrhh@grupoperalta.com.ar"); 
		em.persist(usuario);
		
		tx.commit();
	}

	@Override
	public void agregarUsuario(Usuarios usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Usuarios> listarUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarUsuario(Usuarios usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public Usuarios buscarUsuario(String usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuarios buscarUsuario(int idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
