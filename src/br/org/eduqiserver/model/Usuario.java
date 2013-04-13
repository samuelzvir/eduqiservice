package br.org.eduqiserver.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo_usuario")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigoUsuario;
    @Column(name="usuario")
	private String usuario;
    @Column(name="senha")
	private String senha;
    @Column(name="email")
	private String email;

	public Usuario() {

	}

	public Usuario(int codigoUsuario, String usuario, String senha, String email) {
		super();
		this.codigoUsuario = codigoUsuario;
		this.usuario = usuario;
		this.senha = senha;
		this.email = email;
	}

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
