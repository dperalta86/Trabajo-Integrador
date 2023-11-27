package repositories;

import java.util.List;

import entities.Clientes;

public interface ClientesRepository {
	public void cargaInicial();
	
	public void agregarCliente (Clientes cliente);
	
	public List<Clientes> listarClientes();
	
	public void eliminarCliente (Clientes cliente);
	
	public Clientes buscarClienteo (int idCliente);
}
