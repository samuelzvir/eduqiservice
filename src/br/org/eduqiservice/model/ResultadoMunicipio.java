package br.org.eduqiservice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.math.BigDecimal;


/**
 * The persistent class for the RESULTADO_MUNICIPIO database table.
 * 
 */
@Entity
@Table(name="RESULTADO_MUNICIPIO")
public class ResultadoMunicipio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ERRO_PADRAO_LP")
	private BigDecimal erroPadraoLp;

	@Column(name="ERRO_PADRAO_MT")
	private BigDecimal erroPadraoMt;

	@Column(name="ID_DIVULGACAO")
	private int idDivulgacao;

	@Column(name="ID_LOCALIZACAO")
	private int idLocalizacao;

	@Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_MUNICIPIO")
	private BigInteger idMunicipio;

	@Column(name="ID_PROVA_BRASIL")
	private int idProvaBrasil;

	@Column(name="ID_SERIE")
	private int idSerie;

	@Column(name="ID_TIPO_REDE")
	private int idTipoRede;

	@Column(name="ID_UF")
	private BigInteger idUf;

	@Column(name="MEDIA_LP")
	private BigDecimal mediaLp;

	@Column(name="MEDIA_MT")
	private BigDecimal mediaMt;

	@Column(name="NOME_MUNICIPIO")
	private String nomeMunicipio;

	@Column(name="NU_MATRICULADOS_CENSO")
	private BigInteger nuMatriculadosCenso;

	@Column(name="NU_PRESENTES")
	private BigInteger nuPresentes;

	@Column(name="SIGLA_UF")
	private String siglaUf;

	@Column(name="TAXA_PARTICIPACAO")
	private BigDecimal taxaParticipacao;

	public ResultadoMunicipio() {
	}

	public BigDecimal getErroPadraoLp() {
		return this.erroPadraoLp;
	}

	public void setErroPadraoLp(BigDecimal erroPadraoLp) {
		this.erroPadraoLp = erroPadraoLp;
	}

	public BigDecimal getErroPadraoMt() {
		return this.erroPadraoMt;
	}

	public void setErroPadraoMt(BigDecimal erroPadraoMt) {
		this.erroPadraoMt = erroPadraoMt;
	}

	public int getIdDivulgacao() {
		return this.idDivulgacao;
	}

	public void setIdDivulgacao(int idDivulgacao) {
		this.idDivulgacao = idDivulgacao;
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

	public int getIdTipoRede() {
		return this.idTipoRede;
	}

	public void setIdTipoRede(int idTipoRede) {
		this.idTipoRede = idTipoRede;
	}

	public BigInteger getIdUf() {
		return this.idUf;
	}

	public void setIdUf(BigInteger idUf) {
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

	public String getNomeMunicipio() {
		return this.nomeMunicipio;
	}

	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
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

	public String getSiglaUf() {
		return this.siglaUf;
	}

	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

	public BigDecimal getTaxaParticipacao() {
		return this.taxaParticipacao;
	}

	public void setTaxaParticipacao(BigDecimal taxaParticipacao) {
		this.taxaParticipacao = taxaParticipacao;
	}

}