package org.eduqi.eduqiservice.core.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="result")
public class AnswerResult {

	private int id;
	private String question;
	private double bom;
	private double regular;
	private double ruim;
	private double inexistente;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public double getBom() {
		return bom;
	}
	public void setBom(double bom) {
		this.bom = bom;
	}
	public double getRegular() {
		return regular;
	}
	public void setRegular(double regular) {
		this.regular = regular;
	}
	public double getRuim() {
		return ruim;
	}
	public void setRuim(double ruim) {
		this.ruim = ruim;
	}
	public double getInexistente() {
		return inexistente;
	}
	public void setInexistente(double inexistente) {
		this.inexistente = inexistente;
	}
}
