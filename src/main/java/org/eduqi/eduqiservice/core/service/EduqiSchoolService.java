package org.eduqi.eduqiservice.core.service;

import java.util.List;

import org.eduqi.eduqiservice.core.domain.Formanswers;
import org.eduqi.eduqiservice.core.entity.QuestEscola;

public interface EduqiSchoolService {
	
	Formanswers getSchoolAnswers(int id);
	List<QuestEscola> buildStat();

}
