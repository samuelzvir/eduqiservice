package org.eduqi.eduqiservice.rest.control;

import org.eduqi.eduqiservice.core.domain.AnswerResults;
import org.eduqi.eduqiservice.core.domain.Formanswers;

public interface EduqiSchoolRequest {

	AnswerResults getSGeneralStats();
	Formanswers getSchoolAnswers(String schoolID);
}
