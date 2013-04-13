package br.org.eduqiservice.json;

import com.google.gson.Gson;

public class GSonOperations {

	
	public static String buildGsonObject(Object object){
		Gson gson = new Gson();
		return gson.toJson(object);
	}
}
