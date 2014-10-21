package org.eduqi.eduqiservice.core.service;

import java.util.List;

import org.eduqi.eduqiservice.core.entity.ResultadoEscola;

public interface ResultadoEscolaService {
	
	List<ResultadoEscola> getPrimeirosMat();
	List<ResultadoEscola> getPrimeirosLp();
	List<ResultadoEscola> getUltimosMt();
	List<ResultadoEscola> getUltimosLp();

}