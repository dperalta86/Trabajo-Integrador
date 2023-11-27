package entities;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter @AllArgsConstructor
@Table (name="incidencias")
public class Incidencias {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idIncidencias")
	private int idIncidencias;
	@Column(name="idClientes")
	private long idClientes;
	@Column(name="idTecnicos")
	private int idTecnicos;
	@Column(name="duracion")
	private Date duracion;
	@Column(name="fechaTarea")
	private Date fechaTarea;
	@Column(name="servicios")
	private String servicios;
	@Column(name="comentarios")
	private String comentarios;
	

}
