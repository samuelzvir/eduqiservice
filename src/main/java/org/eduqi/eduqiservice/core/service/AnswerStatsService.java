package org.eduqi.eduqiservice.core.service;

import java.util.List;

import org.eduqi.eduqiservice.core.domain.AnswerResult;

public interface AnswerStatsService {
	
	List<AnswerResult> getAverageAnswers();
	void setProbAnswers(List<AnswerResult> probAnswers);
	void buildAnswersStat();
}
