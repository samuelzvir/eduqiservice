package org.eduqiservice.domain;

public class SchoolError {

	private long schoolID;
	private String errorMessage;
	
	public SchoolError(long schoolID, String errorMessage) {
		super();
		this.schoolID = schoolID;
		this.errorMessage = errorMessage;
	}
	
	

	public long getSchoolID() {
		return schoolID;
	}

	public void setSchoolID(long schoolID) {
		this.schoolID = schoolID;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	
	
}
