package br.org.eduqiservice.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DADOS_ESCOLA database table.
 * 
 */
@Entity
@Table(name="DADOS_ESCOLA")
public class DadosEscola implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ESCOLA")
	private Integer idEscola;

	@Column(name="NOME_ESCOLA")
	private String nomeEscola;

	public DadosEscola() {
	}

	public int getIdEscola() {
		return this.idEscola;
	}

	public void setIdEscola(int idEscola) {
		this.idEscola = idEscola;
	}

	public String getNomeEscola() {
		return this.nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

}