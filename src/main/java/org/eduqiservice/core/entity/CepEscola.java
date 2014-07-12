package org.eduqiservice.core.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CEP_ESCOLA database table.
 * 
 */
@Entity
@Table(name="CEP_ESCOLA")
public class CepEscola implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ESCOLA")
	private Integer idEscola;

	@Column(name="NUM_CEP")
	private String numCep;

	public CepEscola() {
	}

	public int getIdEscola() {
		return this.idEscola;
	}

	public void setIdEscola(int idEscola) {
		this.idEscola = idEscola;
	}

	public String getNumCep() {
		return this.numCep;
	}

	public void setNumCep(String numCep) {
		this.numCep = numCep;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEscola;
		result = prime * result + ((numCep == null) ? 0 : numCep.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CepEscola other = (CepEscola) obj;
		if (idEscola != other.idEscola)
			return false;
		if (numCep == null) {
			if (other.numCep != null)
				return false;
		} else if (!numCep.equals(other.numCep))
			return false;
		return true;
	}	
}