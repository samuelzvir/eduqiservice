package org.eduqi.eduqiservice.core.service;

import java.util.List;

import org.eduqi.eduqiservice.core.entity.ResultadoEscola;

public interface ResultadoEscolaService {
	
	List<ResultadoEscola> getMilPrimeirosMat();
	List<ResultadoEscola> getMilPrimeirosLp();
	List<ResultadoEscola> getMilUltimosMt();
	List<ResultadoEscola> getMilUltimosLp();

}
