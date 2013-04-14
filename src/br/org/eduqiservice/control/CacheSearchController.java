package br.org.eduqiservice.control;

import br.org.eduqiservice.business.CacheSearchBusiness;
import br.org.eduqiservice.cache.CachedCollections;

public class CacheSearchController {

	public static void initCacheSearchList(){
		  String searcheCacheObjects = CacheSearchBusiness.buildCacheSearchList();
		  CachedCollections.setSearcheCacheObjects(searcheCacheObjects);
	}
}
