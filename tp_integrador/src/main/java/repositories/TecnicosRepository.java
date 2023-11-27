package repositories;

import java.util.List;

import entities.Tecnicos;

public interface TecnicosRepository {
	public void cargaInicial();
	
	public void agregarTecnico (Tecnicos tecnico);
	
	public List<Tecnicos> listarTecnicos();
	
	public void eliminarTecnico (Tecnicos tecnico);
	
	public Tecnicos buscarTecnico (int idTecnico);

}
