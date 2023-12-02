package entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter 
@Table(name="tecnicos")
public class Tecnicos {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="idTecnicos")
	private int idTecnicos;
	@Column(name="cuitTecnico")
	private String cuitTecnico;
	@Column(name="nombreTecnico")
	private String nombreTecnico;	
	@Column(name="especialidades")
	private String especialidades;

	 @ManyToMany(mappedBy="tecnicos")
	 private List<Clientes> clientes;

	public Tecnicos(String cuitTecnico, String nombreTecnico) {
		this.cuitTecnico = cuitTecnico;
		this.nombreTecnico = nombreTecnico;
	}
	 
	 


}
