package org.eduqi.eduqiservice.rest.control;

import org.apache.log4j.Logger;
import org.eduqi.eduqiservice.core.domain.CEP;
import org.eduqi.eduqiservice.core.service.EduqiEscolaCEPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v1/")
public class EduqiCepRequestImpl implements EduqiCepRequest{

	private static final Logger LOG = Logger.getLogger(EduqiCepRequestImpl.class);
	
	@Autowired
	private EduqiEscolaCEPService cepService; 
	
	public EduqiCepRequestImpl(EduqiEscolaCEPService cepService) {
		this.cepService = cepService;
	}
	public EduqiCepRequestImpl(){}

	@RequestMapping(value ="/getcep/{idEscola}", method = RequestMethod.GET,
			headers="Accept=application/xml, application/json")
	public @ResponseBody CEP getCEP(@PathVariable String idEscola) {
		CEP cep = new CEP();
		if(idEscola != null){
			int id = Integer.parseInt(idEscola);
			String number = cepService.getCEP(id);
			cep.setCodigo(number);
		}else{
			LOG.warn("Null Id. Application will respond with an empty CEP");
		}	
		return cep;
	}
}
