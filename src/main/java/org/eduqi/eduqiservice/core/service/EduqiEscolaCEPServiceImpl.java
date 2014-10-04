package org.eduqi.eduqiservice.core.service;

import org.apache.log4j.Logger;
import org.eduqi.eduqiservice.core.dao.CepEscolaDAO;
import org.eduqi.eduqiservice.core.entity.CepEscola;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EduqiEscolaCEPServiceImpl implements EduqiEscolaCEPService{

	private static final Logger LOG = Logger.getLogger(EduqiEscolaCEPServiceImpl.class);
	@Autowired
	private CepEscolaDAO cepEscolaDAO;

	public String getCEP(int schoolID){
		CepEscola cep = cepEscolaDAO.findById(schoolID);
		if(cep == null){
			LOG.info("CEP not found. for ID = "+ schoolID);
			return "";
		}
		LOG.info("Returning CEP "+cep.getNumCep());
		return cep.getNumCep();
	}
}
