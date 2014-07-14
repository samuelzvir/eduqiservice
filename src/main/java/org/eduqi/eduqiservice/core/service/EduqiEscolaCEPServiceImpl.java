package org.eduqi.eduqiservice.core.service;

import org.apache.log4j.Logger;
import org.eduqi.eduqiservice.core.dao.CepEscolaDAO;
import org.eduqi.eduqiservice.core.dao.CepEscolaDAOImpl;
import org.eduqi.eduqiservice.core.entity.CepEscola;

public class EduqiEscolaCEPServiceImpl implements EduqiEscolaCEPService{

	private static final Logger LOG = Logger.getLogger(EduqiEscolaCEPServiceImpl.class);

	private CepEscolaDAO cepEscolaDAO;

	public EduqiEscolaCEPServiceImpl(){
		this.cepEscolaDAO = new CepEscolaDAOImpl();
	}
	
	public String getCEP(int idEscola){
		CepEscola cep = cepEscolaDAO.findById(idEscola);
		if(cep == null){
			LOG.info("CEP not found. for ID = "+ idEscola);
			return "";
		}
		LOG.info("Returning CEP "+cep.getNumCep());
		return cep.getNumCep();
	}
}
