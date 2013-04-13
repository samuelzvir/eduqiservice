package br.org.eduqiservice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the ITEM database table.
 * 
 */
@Entity
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	private String disciplina;

	private String gabarito;

	@Column(name="ID_BLOCO")
	private BigInteger idBloco;

	@Column(name="ID_DESCRITOR")
	private BigInteger idDescritor;

	@Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ITEM")
	private BigInteger idItem;

	@Column(name="ID_POSICAO")
	private BigInteger idPosicao;

	@Column(name="ID_SERIE")
	private BigInteger idSerie;

	@Column(name="ID_SERIE_ITEM")
	private BigInteger idSerieItem;

	public Item() {
	}

	public String getDisciplina() {
		return this.disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getGabarito() {
		return this.gabarito;
	}

	public void setGabarito(String gabarito) {
		this.gabarito = gabarito;
	}

	public BigInteger getIdBloco() {
		return this.idBloco;
	}

	public void setIdBloco(BigInteger idBloco) {
		this.idBloco = idBloco;
	}

	public BigInteger getIdDescritor() {
		return this.idDescritor;
	}

	public void setIdDescritor(BigInteger idDescritor) {
		this.idDescritor = idDescritor;
	}

	public BigInteger getIdItem() {
		return this.idItem;
	}

	public void setIdItem(BigInteger idItem) {
		this.idItem = idItem;
	}

	public BigInteger getIdPosicao() {
		return this.idPosicao;
	}

	public void setIdPosicao(BigInteger idPosicao) {
		this.idPosicao = idPosicao;
	}

	public BigInteger getIdSerie() {
		return this.idSerie;
	}

	public void setIdSerie(BigInteger idSerie) {
		this.idSerie = idSerie;
	}

	public BigInteger getIdSerieItem() {
		return this.idSerieItem;
	}

	public void setIdSerieItem(BigInteger idSerieItem) {
		this.idSerieItem = idSerieItem;
	}

}