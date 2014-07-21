package org.eduqi.eduqiservice.rest.control;

import org.apache.log4j.Logger;
import org.eduqi.eduqiservice.core.domain.AnswerResults;
import org.eduqiservice.domain.AnswerStats;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v1/")
public class EduqiSchoolRequestImpl implements EduqiSchoolRequest{
	
	private static final Logger LOG = Logger.getLogger(EduqiSchoolRequestImpl.class);
	
	@RequestMapping(value ="/generalstats", method = RequestMethod.GET,
			headers="Accept=application/xml, application/json")
	public @ResponseBody AnswerResults getSGeneralStats() { 
		LOG.info("Getting statistics");
		AnswerResults result = new AnswerResults();
		//Temp for impl.
		result.setResults(AnswerStats.getAverageAnswers());
		
		LOG.info("Returning statistics");
		return result;
	}	
}