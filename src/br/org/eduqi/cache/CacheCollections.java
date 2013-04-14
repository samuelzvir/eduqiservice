package br.org.eduqi.cache;

import java.util.List;

import br.org.eduqi.domain.CacheSearch;

/**
 * Esta classe tem a responsabilidade de manter dados que são utilizados pela aplicão em cache.
 * @author samuelzvir
 *
 */


public class CacheCollections {

	//objetos para cache de pesquisa.
	private static List<CacheSearch> cacheSearchObjects;

	public synchronized static List<CacheSearch> getSearcheCacheObjects() {
		return cacheSearchObjects;
	}

	public synchronized static void setSearcheCacheObjects(List<CacheSearch> searcheCacheObjects) {
		CacheCollections.cacheSearchObjects = searcheCacheObjects;
	}
	
	public synchronized static void addCacheObject(CacheSearch cacheSearchObjects) {
		CacheCollections.getSearcheCacheObjects().add(cacheSearchObjects);
	}
	
}
