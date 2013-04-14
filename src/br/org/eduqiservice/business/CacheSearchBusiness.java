package br.org.eduqiservice.business;

import java.util.ArrayList;
import java.util.List;

import br.org.eduqiservice.dao.DadosEscolaDAO;
import br.org.eduqiservice.dao.DadosEscolaDAOImpl;
import br.org.eduqiservice.domain.CacheSearch;
import br.org.eduqiservice.json.GSonOperations;
import br.org.eduqiservice.model.DadosEscola;

public class CacheSearchBusiness {

	/**
	 * Constrói uma lista de objetos Json com os dados das escolas.
	 * @return
	 */
	public static String buildCacheSearchList(){
		List<CacheSearch> result = new ArrayList<CacheSearch>();
		
		DadosEscolaDAO resultadoEscolaDAO = new DadosEscolaDAOImpl();
		
		List<DadosEscola> tempEscolaResult = resultadoEscolaDAO.listAll();
		for (DadosEscola dadosEscola : tempEscolaResult) {
			result.add(new CacheSearch(dadosEscola.getIdEscola(), dadosEscola.getNomeEscola()));
		}
		
		return GSonOperations.buildGsonObject(result);
	}
}
