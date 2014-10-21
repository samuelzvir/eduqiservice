package org.eduqi.eduqiservice.core.service;

import java.util.List;
import java.util.Properties;

import javax.annotation.Resource;

import org.eduqi.eduqiservice.core.dao.ResultadoEscolaDAO;
import org.eduqi.eduqiservice.core.entity.ResultadoEscola;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultadoEscolaServiceImpl implements ResultadoEscolaService{
	
	@Autowired
	private ResultadoEscolaDAO resultadoEscolaDAO;
	@Resource(name="eduqiProps")
	private Properties properties;
	
	@Override
	public List<ResultadoEscola> getPrimeirosMat() {
		String n = properties.getProperty("nota.primeiros.mat");
		int v = Integer.parseInt(n);
		return 	resultadoEscolaDAO.listByRangeColumnDesc(v, "mediaMt");
	}

	@Override
	public List<ResultadoEscola> getPrimeirosLp() {
		String n = properties.getProperty("nota.primeiros.lp");
		int v = Integer.parseInt(n);
		return 	resultadoEscolaDAO.listByRangeColumnDesc(v, "mediaLp");
	}

	@Override
	public List<ResultadoEscola> getUltimosMt() {
		String n = properties.getProperty("nota.ultimos.mat");
		int v = Integer.parseInt(n);
		return 	resultadoEscolaDAO.listByRangeColumnAsc(v, "mediaMt");
	}

	@Override
	public List<ResultadoEscola> getUltimosLp() {
		String n = properties.getProperty("nota.ultimos.lp");
		int v = Integer.parseInt(n);
		return 	resultadoEscolaDAO.listByRangeColumnAsc(v, "mediaLp");
	}

}