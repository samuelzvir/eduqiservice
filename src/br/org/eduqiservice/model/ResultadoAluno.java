package br.org.eduqiservice.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.math.BigDecimal;


/**
 * The persistent class for the RESULTADO_ALUNO database table.
 * 
 */
@Entity
@Table(name="RESULTADO_ALUNO")
public class ResultadoAluno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DESVIO_PADRAO_LP")
	private BigDecimal desvioPadraoLp;

	@Column(name="DESVIO_PADRAO_LP_SAEB")
	private BigDecimal desvioPadraoLpSaeb;

	@Column(name="DESVIO_PADRAO_MT")
	private BigDecimal desvioPadraoMt;

	@Column(name="DESVIO_PADRAO_MT_SAEB")
	private BigDecimal desvioPadraoMtSaeb;

	@Id
    @Basic(optional = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ALUNO")
	private BigInteger idAluno;

	@Column(name="ID_DEPENDENCIA_ADM")
	private int idDependenciaAdm;

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

	@Column(name="ID_TURMA")
	private BigInteger idTurma;

	@Column(name="ID_TURNO")
	private String idTurno;

	@Column(name="ID_UF")
	private int idUf;

	@Column(name="IN_PREENCHIMENTO")
	private int inPreenchimento;

	@Column(name="IN_PROFICIENCIA")
	private BigInteger inProficiencia;

	@Column(name="IN_SITUACAO_CENSO")
	private int inSituacaoCenso;

	private BigDecimal peso;

	@Column(name="PROFICIENCIA_LP")
	private BigDecimal proficienciaLp;

	@Column(name="PROFICIENCIA_LP_SAEB")
	private BigDecimal proficienciaLpSaeb;

	@Column(name="PROFICIENCIA_MT")
	private BigDecimal proficienciaMt;

	@Column(name="PROFICIENCIA_MT_SAEB")
	private BigDecimal proficienciaMtSaeb;

	public ResultadoAluno() {
	}

	public BigDecimal getDesvioPadraoLp() {
		return this.desvioPadraoLp;
	}

	public void setDesvioPadraoLp(BigDecimal desvioPadraoLp) {
		this.desvioPadraoLp = desvioPadraoLp;
	}

	public BigDecimal getDesvioPadraoLpSaeb() {
		return this.desvioPadraoLpSaeb;
	}

	public void setDesvioPadraoLpSaeb(BigDecimal desvioPadraoLpSaeb) {
		this.desvioPadraoLpSaeb = desvioPadraoLpSaeb;
	}

	public BigDecimal getDesvioPadraoMt() {
		return this.desvioPadraoMt;
	}

	public void setDesvioPadraoMt(BigDecimal desvioPadraoMt) {
		this.desvioPadraoMt = desvioPadraoMt;
	}

	public BigDecimal getDesvioPadraoMtSaeb() {
		return this.desvioPadraoMtSaeb;
	}

	public void setDesvioPadraoMtSaeb(BigDecimal desvioPadraoMtSaeb) {
		this.desvioPadraoMtSaeb = desvioPadraoMtSaeb;
	}

	public BigInteger getIdAluno() {
		return this.idAluno;
	}

	public void setIdAluno(BigInteger idAluno) {
		this.idAluno = idAluno;
	}

	public int getIdDependenciaAdm() {
		return this.idDependenciaAdm;
	}

	public void setIdDependenciaAdm(int idDependenciaAdm) {
		this.idDependenciaAdm = idDependenciaAdm;
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

	public BigInteger getIdTurma() {
		return this.idTurma;
	}

	public void setIdTurma(BigInteger idTurma) {
		this.idTurma = idTurma;
	}

	public String getIdTurno() {
		return this.idTurno;
	}

	public void setIdTurno(String idTurno) {
		this.idTurno = idTurno;
	}

	public int getIdUf() {
		return this.idUf;
	}

	public void setIdUf(int idUf) {
		this.idUf = idUf;
	}

	public int getInPreenchimento() {
		return this.inPreenchimento;
	}

	public void setInPreenchimento(int inPreenchimento) {
		this.inPreenchimento = inPreenchimento;
	}

	public BigInteger getInProficiencia() {
		return this.inProficiencia;
	}

	public void setInProficiencia(BigInteger inProficiencia) {
		this.inProficiencia = inProficiencia;
	}

	public int getInSituacaoCenso() {
		return this.inSituacaoCenso;
	}

	public void setInSituacaoCenso(int inSituacaoCenso) {
		this.inSituacaoCenso = inSituacaoCenso;
	}

	public BigDecimal getPeso() {
		return this.peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public BigDecimal getProficienciaLp() {
		return this.proficienciaLp;
	}

	public void setProficienciaLp(BigDecimal proficienciaLp) {
		this.proficienciaLp = proficienciaLp;
	}

	public BigDecimal getProficienciaLpSaeb() {
		return this.proficienciaLpSaeb;
	}

	public void setProficienciaLpSaeb(BigDecimal proficienciaLpSaeb) {
		this.proficienciaLpSaeb = proficienciaLpSaeb;
	}

	public BigDecimal getProficienciaMt() {
		return this.proficienciaMt;
	}

	public void setProficienciaMt(BigDecimal proficienciaMt) {
		this.proficienciaMt = proficienciaMt;
	}

	public BigDecimal getProficienciaMtSaeb() {
		return this.proficienciaMtSaeb;
	}

	public void setProficienciaMtSaeb(BigDecimal proficienciaMtSaeb) {
		this.proficienciaMtSaeb = proficienciaMtSaeb;
	}

}