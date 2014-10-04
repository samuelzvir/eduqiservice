package org.eduqi.eduqiservice.core.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "school" )
public class SchoolName {
	
	private int id;
	private String name;
	
	public SchoolName(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public SchoolName(){}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
