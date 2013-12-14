package br.org.eduqiservice.model;

import java.io.Serializable;
import javax.persistence.*;
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
	private Integer idEscola;

	@Column(name="ID_LOCALIZACAO")
	private int idLocalizacao;

	@Column(name="ID_MUNICIPIO")
	private Long idMunicipio;

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
	private Long nuMatriculadosCenso;

	@Column(name="NU_PRESENTES")
	private Long nuPresentes;

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

	public Integer getIdEscola() {
		return this.idEscola;
	}

	public void setIdEscola(Integer idEscola) {
		this.idEscola = idEscola;
	}

	public int getIdLocalizacao() {
		return this.idLocalizacao;
	}

	public void setIdLocalizacao(int idLocalizacao) {
		this.idLocalizacao = idLocalizacao;
	}

	public Long getIdMunicipio() {
		return this.idMunicipio;
	}

	public void setIdMunicipio(Long idMunicipio) {
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

	public Long getNuMatriculadosCenso() {
		return this.nuMatriculadosCenso;
	}

	public void setNuMatriculadosCenso(Long nuMatriculadosCenso) {
		this.nuMatriculadosCenso = nuMatriculadosCenso;
	}

	public Long getNuPresentes() {
		return this.nuPresentes;
	}

	public void setNuPresentes(Long nuPresentes) {
		this.nuPresentes = nuPresentes;
	}

	public BigDecimal getTaxaParticipacao() {
		return this.taxaParticipacao;
	}

	public void setTaxaParticipacao(BigDecimal taxaParticipacao) {
		this.taxaParticipacao = taxaParticipacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idDependenciaAdm;
		result = prime * result + idDivulgacao;
		result = prime * result
				+ ((idEscola == null) ? 0 : idEscola.hashCode());
		result = prime * result + idLocalizacao;
		result = prime * result
				+ ((idMunicipio == null) ? 0 : idMunicipio.hashCode());
		result = prime * result + idProvaBrasil;
		result = prime * result + idSerie;
		result = prime * result + idUf;
		result = prime * result + ((mediaLp == null) ? 0 : mediaLp.hashCode());
		result = prime * result + ((mediaMt == null) ? 0 : mediaMt.hashCode());
		result = prime
				* result
				+ ((nuMatriculadosCenso == null) ? 0 : nuMatriculadosCenso
						.hashCode());
		result = prime * result
				+ ((nuPresentes == null) ? 0 : nuPresentes.hashCode());
		result = prime
				* result
				+ ((taxaParticipacao == null) ? 0 : taxaParticipacao.hashCode());
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
		ResultadoEscola other = (ResultadoEscola) obj;
		if (idDependenciaAdm != other.idDependenciaAdm)
			return false;
		if (idDivulgacao != other.idDivulgacao)
			return false;
		if (idEscola == null) {
			if (other.idEscola != null)
				return false;
		} else if (!idEscola.equals(other.idEscola))
			return false;
		if (idLocalizacao != other.idLocalizacao)
			return false;
		if (idMunicipio == null) {
			if (other.idMunicipio != null)
				return false;
		} else if (!idMunicipio.equals(other.idMunicipio))
			return false;
		if (idProvaBrasil != other.idProvaBrasil)
			return false;
		if (idSerie != other.idSerie)
			return false;
		if (idUf != other.idUf)
			return false;
		if (mediaLp == null) {
			if (other.mediaLp != null)
				return false;
		} else if (!mediaLp.equals(other.mediaLp))
			return false;
		if (mediaMt == null) {
			if (other.mediaMt != null)
				return false;
		} else if (!mediaMt.equals(other.mediaMt))
			return false;
		if (nuMatriculadosCenso == null) {
			if (other.nuMatriculadosCenso != null)
				return false;
		} else if (!nuMatriculadosCenso.equals(other.nuMatriculadosCenso))
			return false;
		if (nuPresentes == null) {
			if (other.nuPresentes != null)
				return false;
		} else if (!nuPresentes.equals(other.nuPresentes))
			return false;
		if (taxaParticipacao == null) {
			if (other.taxaParticipacao != null)
				return false;
		} else if (!taxaParticipacao.equals(other.taxaParticipacao))
			return false;
		return true;
	}

}