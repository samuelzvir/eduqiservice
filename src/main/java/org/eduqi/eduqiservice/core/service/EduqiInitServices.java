package org.eduqi.eduqiservice.core.service;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eduqi.eduqiservice.core.exception.TypeaheadStartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EduqiInitServices {

	private static final Logger LOG = Logger.getLogger(EduqiInitServices.class);
	@Autowired
	private EduqiTypeaheadService typeaheadService;
	@Autowired
	private DataSource dataSource;
	@Autowired
	private AnswerStatsService answerStatsService;

	@PostConstruct
	public void startAll() throws TypeaheadStartException{
		LOG.log(Level.INFO, "starting services");
		try {
			LOG.info("Indexing Typeahead.");
			typeaheadService.startTypeAhead();
			LOG.info("Typeahead Indexing Finished.");
		} catch (Exception e) {
			LOG.log(Level.ERROR, "Error starting Typeahead");
			throw new TypeaheadStartException("Impossible to start typeahead!",e.getCause());
		}
		LOG.info("Building AnswerStats.");	
		answerStatsService.buildAnswersStat();
		LOG.info("AnswerStats Built.");
	}
}
