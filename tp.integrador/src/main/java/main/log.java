package main;

import java.util.Scanner;

import entities.Usuarios;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import services.PersistenceEntityManager;

public class log {
	EntityManager em = new PersistenceEntityManager().getEntityManager();
	EntityTransaction tx = em.getTransaction();	
	
	public Usuarios in() {
		try (Scanner lectura = new Scanner(System.in)) {
			System.out.println("Bienvenido al sistema de gestión de Tickets por Servicios\n\n");
			System.out.println("Inicio de Sesión\n\nUsuario: ");		
			String usuario = lectura.next();
			System.out.println("Password: ");
			String password = lectura.next();
			
			Usuarios usuario1 = new Usuarios(usuario, password);	
			Usuarios usuarioCheck = new Usuarios("demo", "pass");
			if (em.find(Usuarios.class, usuario1.getUser()) != null) {
				usuarioCheck = em.find(Usuarios.class, usuario1.getUser());				
			}			
			
			if(usuario1.getUser() == usuarioCheck.getUser() && usuario1.getPassword().equals(usuarioCheck.getPassword())) {
				System.out.println("\nBienvenido, " + usuarioCheck.getUser());
				return usuarioCheck;			
				}else{
				System.out.println("\nUsuario o contraseña incorrectos.\n\n");
				return null;			

					}
			}
		
		
	}
}