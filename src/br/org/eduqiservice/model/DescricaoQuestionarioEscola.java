package br.org.eduqiservice.model;

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
	private int idResposta;

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

}