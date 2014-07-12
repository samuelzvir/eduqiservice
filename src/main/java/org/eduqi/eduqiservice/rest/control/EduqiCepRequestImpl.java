package org.eduqi.eduqiservice.rest.control;

import org.eduqi.eduqiservice.core.domain.CEP;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class EduqiCepRequestImpl implements EduqiCepRequest{

	@RequestMapping(value ="/getcep/{idEscola}", method = RequestMethod.GET,
			headers="Accept=application/xml, application/json")
	public CEP getCEP(@PathVariable String idEscola) {
		CEP cep = new CEP("11111111");
		return cep;
	}

}
