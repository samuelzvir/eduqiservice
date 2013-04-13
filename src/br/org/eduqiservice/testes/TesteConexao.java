package br.org.eduqiservice.testes;

import java.util.List;

import org.hibernate.Session;

import br.org.eduqiserver.model.Usuario;
import br.org.eduqiservice.dao.QuestEscolaDAO;
import br.org.eduqiservice.dao.QuestEscolaDAOImpl;
import br.org.eduqiservice.model.QuestEscola;
import br.org.eduqiservice.util.HibernateUtil;

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
