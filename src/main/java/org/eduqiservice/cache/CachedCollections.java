package org.eduqiservice.cache;

import java.util.Map;

public class CachedCollections {

	//objetos para cache de pesquisa.
	private static String cacheSearchObjects;
	private static Map<String, Double> mathAverage;
	private static Map<String, Double> portugueseAverage;
	
	//Getters e Setters
	
	public synchronized static String getSearcheCacheObjects() {
		return cacheSearchObjects;
	}

	public synchronized static void setSearcheCacheObjects(String searcheCacheObjects) {
		CachedCollections.cacheSearchObjects = searcheCacheObjects;
	}

	public synchronized static Map<String, Double> getMathAverage() {
		return mathAverage;
	}

	public synchronized static void setMathAverage(Map<String, Double> mathAverage) {
		CachedCollections.mathAverage = mathAverage;
	}

	public synchronized static Map<String, Double> getPortugueseAverage() {
		return portugueseAverage;
	}

	public synchronized static void setPortugueseAverage(Map<String, Double> portugueseAverage) {
		CachedCollections.portugueseAverage = portugueseAverage;
	}
}
