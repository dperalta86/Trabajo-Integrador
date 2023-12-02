package entities;

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
@Table(name="usuarios")
public class Usuarios {
	

	
	public Usuarios(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}

	public Usuarios(String user, String password, int tipoUsuario, String email) {
		super();
		this.user = user;
		this.password = password;
		this.tipoUsuario = tipoUsuario;
		this.email = email;
	}




	public Usuarios() {
	}
	@Id
	@Column(name="user")
	private String user;
	@Column(name="password")
	private String password;
	@Column(name="tipoUsuario")
	private int tipoUsuario;
	@Column(name="email")
	private String email;


	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
