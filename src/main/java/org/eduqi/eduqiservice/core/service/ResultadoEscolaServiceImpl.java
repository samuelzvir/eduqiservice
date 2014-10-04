package org.eduqi.eduqiservice.core.service;

import java.util.List;

import org.eduqi.eduqiservice.core.dao.ResultadoEscolaDAO;
import org.eduqi.eduqiservice.core.entity.ResultadoEscola;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultadoEscolaServiceImpl implements ResultadoEscolaService{
	
	@Autowired
	private ResultadoEscolaDAO resultadoEscolaDAO;

	@Override
	public List<ResultadoEscola> getMilPrimeirosMat() {
		return 	resultadoEscolaDAO.listByRangeColumnDesc(1000, "mediaMt");
	}

	@Override
	public List<ResultadoEscola> getMilPrimeirosLp() {
		return 	resultadoEscolaDAO.listByRangeColumnDesc(1000, "mediaLp");
	}

	@Override
	public List<ResultadoEscola> getMilUltimosMt() {
		return 	resultadoEscolaDAO.listByRangeColumnAsc(1000, "mediaMt");
	}

	@Override
	public List<ResultadoEscola> getMilUltimosLp() {
		return 	resultadoEscolaDAO.listByRangeColumnAsc(1000, "mediaLp");
	}

}