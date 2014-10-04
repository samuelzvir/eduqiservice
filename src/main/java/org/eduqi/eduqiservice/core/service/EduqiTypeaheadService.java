package org.eduqi.eduqiservice.core.service;

import java.util.List;

import org.eduqi.eduqiservice.core.domain.SchoolName;

public interface EduqiTypeaheadService {

	List<SchoolName> searchSchoolName(String query);
	void startTypeAhead() throws Exception ;
}
