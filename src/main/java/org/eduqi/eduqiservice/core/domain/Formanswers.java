package org.eduqi.eduqiservice.core.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="answers")
public class Formanswers {

	private List<Form> quest;
	
	public Formanswers(List<Form> questions) {
		super();
		this.quest = questions;
	}
	
	public Formanswers(){}

	public List<Form> getQuest() {
		return quest;
	}

	public void setQuest(List<Form> quest) {
		this.quest = quest;
	}
	
}
