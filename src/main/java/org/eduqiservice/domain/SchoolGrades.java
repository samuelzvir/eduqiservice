package org.eduqiservice.domain;

import java.math.BigDecimal;

public class SchoolGrades {
	
	private Integer idEscola;
	private BigDecimal lpGrade;
	private BigDecimal mtGrade;
	
	
	
	public SchoolGrades(Integer idEscola, BigDecimal lpGrade, BigDecimal mtGrade) {
		super();
		this.idEscola = idEscola;
		this.lpGrade = lpGrade;
		this.mtGrade = mtGrade;
	}
	public Integer getIdEscola() {
		return idEscola;
	}
	public void setIdEscola(Integer idEscola) {
		this.idEscola = idEscola;
	}
	public BigDecimal getLpGrade() {
		return lpGrade;
	}
	public void setLpGrade(BigDecimal lpGrade) {
		this.lpGrade = lpGrade;
	}
	public BigDecimal getMtGrade() {
		return mtGrade;
	}
	public void setMtGrade(BigDecimal mtGrade) {
		this.mtGrade = mtGrade;
	}
	
	
	
	

}
