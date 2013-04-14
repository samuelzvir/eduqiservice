package br.org.eduqiservice.control;

import br.org.eduqiservice.dao.CepEscolaDAOImpl;
import br.org.eduqiservice.model.CepEscola;

public class CepControl {

	
	public static String getCEP(int idEscola){
		CepEscolaDAOImpl dao = new CepEscolaDAOImpl();
		 CepEscola cep = dao.findById(idEscola);
		 if(cep == null){
			 return "";
		 }
		 return cep.getNumCep();
	}
}
