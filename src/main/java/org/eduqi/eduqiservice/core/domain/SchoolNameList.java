package org.eduqi.eduqiservice.core.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "school_list" )
public class SchoolNameList {
	
	private List<SchoolName> schoolNames;

	
	
	public SchoolNameList(List<SchoolName> schoolNames) {
		super();
		this.schoolNames = schoolNames;
	}
	public SchoolNameList(){}

	public List<SchoolName> getSchoolNames() {
		return schoolNames;
	}

	public void setSchoolNames(List<SchoolName> schoolNames) {
		this.schoolNames = schoolNames;
	}
	
}
