package br.org.eduqiservice.business;

import static org.junit.Assert.*;

import org.junit.Test;

public class CacheSearchBusinessTest {

	/**
	 * teste com o intuito de testar o tempo de processamento.
	 */
	@Test(timeout=20000)
	public void testBuildCacheSearchList() {
		assertNotNull(CacheSearchBusiness.buildCacheSearchList());
	}

}
