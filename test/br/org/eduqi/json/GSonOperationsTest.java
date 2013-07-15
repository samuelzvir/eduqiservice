package br.org.eduqi.json;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import br.org.eduqiservice.dao.QuestEscolaDAOImpl;
import br.org.eduqiservice.model.QuestEscola;

public class GSonOperationsTest {

	@Test
	public void testBuildGsonObject() {
		QuestEscolaDAOImpl dao = new QuestEscolaDAOImpl();
		
		List<QuestEscola> result = dao.listAll();
		assertNotNull(result);
		assertTrue(result.size() > 0);
		
	}

}
