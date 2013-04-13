package br.org.eduqiservice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.math.BigDecimal;


/**
 * The persistent class for the PESOS database table.
 * 
 */
@Entity
@Table(name="PESOS")
public class Peso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ID_DEPENDENCIA_ADM")
	private BigInteger idDependenciaAdm;

	@Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ESCOLA")
	private BigInteger idEscola;

	@Column(name="ID_LOCALIZACAO")
	private BigInteger idLocalizacao;

	@Column(name="ID_MUNICIPIO")
	private BigInteger idMunicipio;

	@Column(name="ID_PROVA_BRASIL")
	private BigInteger idProvaBrasil;

	@Column(name="ID_SERIE")
	private BigInteger idSerie;

	@Column(name="ID_TURMA")
	private BigInteger idTurma;

	@Column(name="ID_UF")
	private BigInteger idUf;

	@Column(name="PARTICIPANTES_ESCOLA")
	private BigInteger participantesEscola;

	@Column(name="PARTICIPANTES_TURMA")
	private BigInteger participantesTurma;

	@Column(name="PESO_ESCOLA")
	private BigDecimal pesoEscola;

	@Column(name="PESO_TURMA")
	private BigDecimal pesoTurma;

	public Peso() {
	}

	public BigInteger getIdDependenciaAdm() {
		return this.idDependenciaAdm;
	}

	public void setIdDependenciaAdm(BigInteger idDependenciaAdm) {
		this.idDependenciaAdm = idDependenciaAdm;
	}

	public BigInteger getIdEscola() {
		return this.idEscola;
	}

	public void setIdEscola(BigInteger idEscola) {
		this.idEscola = idEscola;
	}

	public BigInteger getIdLocalizacao() {
		return this.idLocalizacao;
	}

	public void setIdLocalizacao(BigInteger idLocalizacao) {
		this.idLocalizacao = idLocalizacao;
	}

	public BigInteger getIdMunicipio() {
		return this.idMunicipio;
	}

	public void setIdMunicipio(BigInteger idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public BigInteger getIdProvaBrasil() {
		return this.idProvaBrasil;
	}

	public void setIdProvaBrasil(BigInteger idProvaBrasil) {
		this.idProvaBrasil = idProvaBrasil;
	}

	public BigInteger getIdSerie() {
		return this.idSerie;
	}

	public void setIdSerie(BigInteger idSerie) {
		this.idSerie = idSerie;
	}

	public BigInteger getIdTurma() {
		return this.idTurma;
	}

	public void setIdTurma(BigInteger idTurma) {
		this.idTurma = idTurma;
	}

	public BigInteger getIdUf() {
		return this.idUf;
	}

	public void setIdUf(BigInteger idUf) {
		this.idUf = idUf;
	}

	public BigInteger getParticipantesEscola() {
		return this.participantesEscola;
	}

	public void setParticipantesEscola(BigInteger participantesEscola) {
		this.participantesEscola = participantesEscola;
	}

	public BigInteger getParticipantesTurma() {
		return this.participantesTurma;
	}

	public void setParticipantesTurma(BigInteger participantesTurma) {
		this.participantesTurma = participantesTurma;
	}

	public BigDecimal getPesoEscola() {
		return this.pesoEscola;
	}

	public void setPesoEscola(BigDecimal pesoEscola) {
		this.pesoEscola = pesoEscola;
	}

	public BigDecimal getPesoTurma() {
		return this.pesoTurma;
	}

	public void setPesoTurma(BigDecimal pesoTurma) {
		this.pesoTurma = pesoTurma;
	}

}