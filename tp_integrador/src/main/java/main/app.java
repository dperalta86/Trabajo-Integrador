package main;
import services.ClientesImplements;
import services.TecnicosImplements;

public class app {

	public static void main(String[] args) {
		
		//Carga Inicial de Técnicos
		TecnicosImplements ti = new TecnicosImplements();
		ti.cargaInicial();
		
		//Carga Inicial de Clientes
		ClientesImplements ci = new ClientesImplements();
		ci.cargaInicial();
		
		/* ******************************************************
		 * 		INICIO CICLO DE VIDA DE LLAMADO POR SERVICIO	*
		 ********************************************************/
		
		

	}


}
