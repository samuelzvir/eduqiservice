package org.eduqiservice.control;

import org.eduqi.eduqiservice.core.dao.CepEscolaDAOImpl;
import org.eduqi.eduqiservice.core.entity.CepEscola;

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
