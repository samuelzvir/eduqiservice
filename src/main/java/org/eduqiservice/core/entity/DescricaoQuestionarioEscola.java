package org.eduqiservice.core.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the descricao_questionario_escola database table.
 * 
 */
@Entity
@Table(name="descricao_questionario_escola")
public class DescricaoQuestionarioEscola implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idResposta")
	private int idResposta;

	@Column(name="descricaoPergunta")
	private String descricaoPergunta;

	public DescricaoQuestionarioEscola() {
	}

	public int getIdResposta() {
		return this.idResposta;
	}

	public void setIdResposta(int idResposta) {
		this.idResposta = idResposta;
	}

	public String getDescricaoPergunta() {
		return this.descricaoPergunta;
	}

	public void setDescricaoPergunta(String descricaoPergunta) {
		this.descricaoPergunta = descricaoPergunta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((descricaoPergunta == null) ? 0 : descricaoPergunta
						.hashCode());
		result = prime * result + idResposta;
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
		DescricaoQuestionarioEscola other = (DescricaoQuestionarioEscola) obj;
		if (descricaoPergunta == null) {
			if (other.descricaoPergunta != null)
				return false;
		} else if (!descricaoPergunta.equals(other.descricaoPergunta))
			return false;
		if (idResposta != other.idResposta)
			return false;
		return true;
	}
	
}