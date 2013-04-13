package br.org.eduqiservice.testes;

import java.util.List;

import br.org.eduqiservice.dao.QuestEscolaDAOImpl;
import br.org.eduqiservice.model.QuestEscola;

public class TesteConexao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		QuestEscolaDAOImpl dao = new QuestEscolaDAOImpl();
		
		List<QuestEscola> result = dao.listAll();
		
		System.out.println(result.size());
		
		
		
	}

}
