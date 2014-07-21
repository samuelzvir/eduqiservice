package org.eduqi.eduqiservice.core.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="results")
public class AnswerResults {
	
	private List<AnswerResult> results;

	public AnswerResults(List<AnswerResult> results) {
		super();
		this.results = results;
	}
	
	public AnswerResults(){}

	public List<AnswerResult> getResults() {
		return results;
	}

	public void setResults(List<AnswerResult> results) {
		this.results = results;
	}
}
