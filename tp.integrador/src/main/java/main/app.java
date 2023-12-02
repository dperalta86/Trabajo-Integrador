package main;
import entities.Usuarios;
import services.UsuariosImplements;

public class app {

	public static void main(String[] args) {

		/*		
		//Carga Inicial de Técnicos
		TecnicosImplements ti = new TecnicosImplements();
		ti.cargaInicial();
		
		//Carga Inicial de Clientes
		ClientesImplements ci = new ClientesImplements();
		ci.cargaInicial();		
		*/
		
		//Carga Inicial Servicios
		//ServiciosRepository sr = new ServiciosRepository();
		//sr.cargaInicial();
		
		//Carga Inicial de Usuarios
		//UsuariosImplements ui = new UsuariosImplements();
		//ui.cargaInicial();
			
			
		/* ******************************************************
		 *                   Inicio de Sesión                   *
		 ********************************************************/
		
		log log = new log();
		Usuarios usuarioCheck = log.in();
		
		

	}
	
	
}
