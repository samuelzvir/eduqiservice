package org.eduqiservice.control;

import org.eduqiservice.business.CacheSearchBusiness;
import org.eduqiservice.cache.CachedCollections;

public class CacheSearchController {

	public static void initCacheSearchList(){
		  String searcheCacheObjects = CacheSearchBusiness.buildCacheSearchList();
		  CachedCollections.setSearcheCacheObjects(searcheCacheObjects);
	}
}
