package org.eduqi.eduqiservice.rest.control;

import org.eduqi.eduqiservice.core.domain.SchoolNameList;

public interface EduqiTypeaheadRequest {
	
	SchoolNameList getSchoolname(String query, int limit);

}
