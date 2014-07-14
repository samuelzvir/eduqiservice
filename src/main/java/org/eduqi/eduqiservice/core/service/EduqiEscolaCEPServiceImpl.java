package org.eduqi.eduqiservice.core.service;

import org.apache.log4j.Logger;
import org.eduqi.eduqiservice.core.dao.CepEscolaDAO;
import org.eduqi.eduqiservice.core.entity.CepEscola;
import org.springframework.beans.factory.annotation.Autowired;

public class EduqiEscolaCEPServiceImpl implements EduqiEscolaCEPService{

	private static final Logger LOG = Logger.getLogger(EduqiEscolaCEPServiceImpl.class);

	@Autowired
	CepEscolaDAO cepEscolaDAO;

	public EduqiEscolaCEPServiceImpl(CepEscolaDAO cepEscolaDAO){
		this.cepEscolaDAO = cepEscolaDAO;
	}
	public EduqiEscolaCEPServiceImpl(){}

	public String getCEP(int idEscola){
		CepEscola cep = cepEscolaDAO.findById(idEscola);
		if(cep == null){
			LOG.info("CEP not found.");
			return "";
		}
		LOG.info("Returning CEP "+cep.getNumCep());
		return cep.getNumCep();
	}
}
