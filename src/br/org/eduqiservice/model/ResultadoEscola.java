package br.org.eduqiservice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.math.BigDecimal;


/**
 * The persistent class for the RESULTADO_ESCOLA database table.
 * 
 */
@Entity
@Table(name="RESULTADO_ESCOLA")
public class ResultadoEscola implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ID_DEPENDENCIA_ADM")
	private int idDependenciaAdm;

	@Column(name="ID_DIVULGACAO")
	private int idDivulgacao;

	@Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ESCOLA")
	private BigInteger idEscola;

	@Column(name="ID_LOCALIZACAO")
	private int idLocalizacao;

	@Column(name="ID_MUNICIPIO")
	private BigInteger idMunicipio;

	@Column(name="ID_PROVA_BRASIL")
	private int idProvaBrasil;

	@Column(name="ID_SERIE")
	private int idSerie;

	@Column(name="ID_UF")
	private int idUf;

	@Column(name="MEDIA_LP")
	private BigDecimal mediaLp;

	@Column(name="MEDIA_MT")
	private BigDecimal mediaMt;

	@Column(name="NU_MATRICULADOS_CENSO")
	private BigInteger nuMatriculadosCenso;

	@Column(name="NU_PRESENTES")
	private BigInteger nuPresentes;

	@Column(name="TAXA_PARTICIPACAO")
	private BigDecimal taxaParticipacao;

	public ResultadoEscola() {
	}

	public int getIdDependenciaAdm() {
		return this.idDependenciaAdm;
	}

	public void setIdDependenciaAdm(int idDependenciaAdm) {
		this.idDependenciaAdm = idDependenciaAdm;
	}

	public int getIdDivulgacao() {
		return this.idDivulgacao;
	}

	public void setIdDivulgacao(int idDivulgacao) {
		this.idDivulgacao = idDivulgacao;
	}

	public BigInteger getIdEscola() {
		return this.idEscola;
	}

	public void setIdEscola(BigInteger idEscola) {
		this.idEscola = idEscola;
	}

	public int getIdLocalizacao() {
		return this.idLocalizacao;
	}

	public void setIdLocalizacao(int idLocalizacao) {
		this.idLocalizacao = idLocalizacao;
	}

	public BigInteger getIdMunicipio() {
		return this.idMunicipio;
	}

	public void setIdMunicipio(BigInteger idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public int getIdProvaBrasil() {
		return this.idProvaBrasil;
	}

	public void setIdProvaBrasil(int idProvaBrasil) {
		this.idProvaBrasil = idProvaBrasil;
	}

	public int getIdSerie() {
		return this.idSerie;
	}

	public void setIdSerie(int idSerie) {
		this.idSerie = idSerie;
	}

	public int getIdUf() {
		return this.idUf;
	}

	public void setIdUf(int idUf) {
		this.idUf = idUf;
	}

	public BigDecimal getMediaLp() {
		return this.mediaLp;
	}

	public void setMediaLp(BigDecimal mediaLp) {
		this.mediaLp = mediaLp;
	}

	public BigDecimal getMediaMt() {
		return this.mediaMt;
	}

	public void setMediaMt(BigDecimal mediaMt) {
		this.mediaMt = mediaMt;
	}

	public BigInteger getNuMatriculadosCenso() {
		return this.nuMatriculadosCenso;
	}

	public void setNuMatriculadosCenso(BigInteger nuMatriculadosCenso) {
		this.nuMatriculadosCenso = nuMatriculadosCenso;
	}

	public BigInteger getNuPresentes() {
		return this.nuPresentes;
	}

	public void setNuPresentes(BigInteger nuPresentes) {
		this.nuPresentes = nuPresentes;
	}

	public BigDecimal getTaxaParticipacao() {
		return this.taxaParticipacao;
	}

	public void setTaxaParticipacao(BigDecimal taxaParticipacao) {
		this.taxaParticipacao = taxaParticipacao;
	}

}