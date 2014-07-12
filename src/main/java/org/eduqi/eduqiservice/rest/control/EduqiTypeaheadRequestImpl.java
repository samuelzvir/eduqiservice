package org.eduqi.eduqiservice.rest.control;

import org.eduqi.eduqiservice.core.control.HomeController;
import org.eduqi.eduqiservice.core.domain.CEP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v1/")
public class EduqiTypeaheadRequestImpl implements EduqiTypeaheadRequest {

	private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value ="/teste", method = RequestMethod.GET,
			headers="Accept=application/xml, application/json")
	public @ResponseBody CEP teste() { 
		LOG.info("teste");
		CEP cep = new CEP("teste");
		return cep;
	}
}