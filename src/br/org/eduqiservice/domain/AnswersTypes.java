package br.org.eduqiservice.domain;

public class AnswersTypes {

	private String question;
	private double bom;
	private double regular;
	private double ruim;
	private double inexistente;
	
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
