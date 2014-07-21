package org.eduqi.eduqiservice.rest.control;

import org.eduqi.eduqiservice.core.control.HomeController;
import org.eduqi.eduqiservice.core.domain.SchoolNameList;
import org.eduqi.eduqiservice.core.service.EduqiTypeaheadServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v1/")
public class EduqiTypeaheadRequestImpl implements EduqiTypeaheadRequest {

	private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private EduqiTypeaheadServiceImpl eduqiTypeaheadService;

	public EduqiTypeaheadRequestImpl(
			EduqiTypeaheadServiceImpl eduqiTypeaheadService) {
		super();
		this.eduqiTypeaheadService = eduqiTypeaheadService;
	}
	public EduqiTypeaheadRequestImpl(){}

	@RequestMapping(value ="/schoolname/{query}", method = RequestMethod.GET,
			headers="Accept=application/xml, application/json")
	public @ResponseBody SchoolNameList getSchoolname(@PathVariable String query) { 
		LOG.info("Getting school name(s)");
		LOG.info("Querying for "+ query);
		SchoolNameList result = null;
		if(query != null){
			query = query.toUpperCase();
			String terms[] = query.split("\\s+");
			result = eduqiTypeaheadService.search(1000, terms);	
		}else{
			LOG.warn("Invalid Query.");
			result = new SchoolNameList();
		}
		LOG.info("Returning "+ result.getSchoolNames().size() + " name(s)");
		return result;
	}
}