package br.org.eduqiservice.business;

import java.util.ArrayList;
import java.util.List;

import br.org.eduqiservice.dao.DadosEscolaDAO;
import br.org.eduqiservice.dao.DadosEscolaDAOImpl;
import br.org.eduqiservice.domain.CacheSearch;
import br.org.eduqiservice.model.DadosEscola;

public class CacheSearchBusiness {

	/**
	 * Constrói uma lista de objetos Json com os dados das escolas.
	 * @return
	 */
	public static List<CacheSearch> buildCacheSearchList(){
		List<String> result = new ArrayList<String>();
		
		DadosEscolaDAO resultadoEscolaDAO = new DadosEscolaDAOImpl();
		
		List<DadosEscola> tempEscolaResult = resultadoEscolaDAO.listAll();
		for (DadosEscola dadosEscola : tempEscolaResult) {
			
		}
		
		return null;
	}
}
