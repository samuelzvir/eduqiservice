package br.org.eduqiservice.cache;

/**
 * Esta classe tem a responsabilidade de manter dados que são utilizados pela aplicão em cache.
 * @author samuelzvir
 *
 */


public class CachedCollections {

	//objetos para cache de pesquisa.
	private static String cacheSearchObjects;

	public synchronized static String getSearcheCacheObjects() {
		return cacheSearchObjects;
	}

	public synchronized static void setSearcheCacheObjects(String searcheCacheObjects) {
		CachedCollections.cacheSearchObjects = searcheCacheObjects;
	}
	
}
