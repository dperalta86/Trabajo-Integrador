package entities;

import java.sql.Time;
import java.time.Duration;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="servicios")
public class Servicios {
	@Id
	@Column(name="idServicios")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idServicios;
	
	@Column(name="servicios")
	private String servicios;
	
	@Column(name="duracionServicio")
	private float duracionServicio;

	public Servicios(String servicios, float duracionServicio) {
		this.servicios = servicios;
		this.duracionServicio = duracionServicio;
	}

	


}
