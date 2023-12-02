package repositories;

import java.util.List;

import entities.Usuarios;


public interface usuariosRespository {
	public void cargaInicial();
	
	public void agregarUsuario (Usuarios usuario);
	
	public List<Usuarios> listarUsuarios();
	
	public void eliminarUsuario (Usuarios usuario);
	
	public Usuarios buscarUsuario (int idUsuario);

	Usuarios buscarUsuario(String usuario);

}
