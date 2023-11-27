package entities;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
@Table(name="clientes")
public class Clientes {
	@Id
	@Column(name="idClientes")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idClientes;
	
	@Column(name="cuitCliente")
	private String cuitCliente;
	@Column(name="razonSocialCliente")
	private String razonSocialCliente;
	@Column(name="serviciosContratados")
	private String serviciosContratados;
	
	 @ManyToMany
	 @JoinTable(
	 name = "incidencias",
	 joinColumns = @JoinColumn(name = "idClientes"),
	 inverseJoinColumns = @JoinColumn(name = "idTecnicos"))
	 
	 private List<Tecnicos> tecnicos;

	
	public Clientes(String cuitCliente, String razonSocialCliente) {
		this.cuitCliente = cuitCliente;
		this.razonSocialCliente = razonSocialCliente;
	}
	
	

}
