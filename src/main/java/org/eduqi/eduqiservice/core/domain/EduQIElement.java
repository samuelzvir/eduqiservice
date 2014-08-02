package org.eduqi.eduqiservice.core.domain;

import java.util.Arrays;

import cleo.search.Element;

public class EduQIElement implements Element, Cloneable{

	private static final long serialVersionUID = -6678277246380095015L;
	private static final String[] EMPTY_TERMS = new String[0];
	private int id;
	private String schoolName;
	private int schoolId;
	private String[] terms = EMPTY_TERMS;
	private float score;
	private long timestamp = System.currentTimeMillis();
	
	public EduQIElement(int id, int schoolId, String schoolName,
			String[] terms, float score, long timestamp) {
		super();
		this.id = id;
		this.schoolName = schoolName;
		this.terms = terms;
		this.score = score;
		this.timestamp = timestamp;
	}
	public EduQIElement(){}
	
	@Override
	public int compareTo(Element element) {
		return score < element.getScore() ? -1 : (score == element.getScore() ? (getElementId() - element.getElementId()) : 1);
	}

	@Override
	public int getElementId() {
		return id;
	}

	@Override
	public float getScore() {
		return score;
	}

	@Override
	public String[] getTerms() {
		return terms;
	}

	@Override
	public long getTimestamp() {
		return timestamp;
	}

	@Override
	public void setElementId(int id) {
		this.id = id;		
	}

	@Override
	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public void setTerms(String... terms) {
		this.terms = (terms == null) ? EMPTY_TERMS : terms;
	}

	@Override
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public boolean isSearchable() {
		return terms != null && terms.length > 0;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result
				+ ((schoolName == null) ? 0 : schoolName.hashCode());
		result = prime * result + Float.floatToIntBits(score);
		result = prime * result + Arrays.hashCode(terms);
		result = prime * result + (int) (timestamp ^ (timestamp >>> 32));
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
		EduQIElement other = (EduQIElement) obj;
		if (id != other.id)
			return false;
		if (schoolName == null) {
			if (other.schoolName != null)
				return false;
		} else if (!schoolName.equals(other.schoolName))
			return false;
		if (Float.floatToIntBits(score) != Float.floatToIntBits(other.score))
			return false;
		if (!Arrays.equals(terms, other.terms))
			return false;
		if (timestamp != other.timestamp)
			return false;
		return true;
	}	
}