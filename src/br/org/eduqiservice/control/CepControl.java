package br.org.eduqiservice.control;

import br.org.eduqiservice.dao.CepEscolaDAOImpl;

public class CepControl {

	
	public static String getCEP(int idEscola){
		CepEscolaDAOImpl dao = new CepEscolaDAOImpl();
		return dao.findById(idEscola).getNumCep();
	}
}
