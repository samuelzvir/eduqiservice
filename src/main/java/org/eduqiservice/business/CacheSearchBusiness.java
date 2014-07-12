package org.eduqiservice.business;

import java.util.ArrayList;
import java.util.List;

import org.eduqi.eduqiservice.core.dao.DadosEscolaDAO;
import org.eduqi.eduqiservice.core.dao.DadosEscolaDAOImpl;
import org.eduqi.eduqiservice.core.entity.DadosEscola;
import org.eduqiservice.domain.CacheSearch;

public class CacheSearchBusiness {

	/**
	 * Constroi uma lista de objetos Json com os dados das escolas.
	 * @return
	 */
	public static String buildCacheSearchList(){
		List<CacheSearch> result = new ArrayList<CacheSearch>();
		
		DadosEscolaDAO resultadoEscolaDAO = new DadosEscolaDAOImpl();
		
		List<DadosEscola> tempEscolaResult = resultadoEscolaDAO.listAll();
		for (DadosEscola dadosEscola : tempEscolaResult) {
			result.add(new CacheSearch(dadosEscola.getIdEscola(), dadosEscola.getNomeEscola()));
		}
		//return GSonOperations.buildGsonObject(result);
		return null;
	}
}
