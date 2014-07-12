package org.eduqiservice.core.util;

public class EduqiQuestParser {

	
	public static String match(char character){
		String r = "";
		switch (character) {
		case 'a':r = "BOM";
			break;
		case 'A':r = "BOM";
			break;	
		case 'b':r = "REGULAR";
			break;
		case 'B':r = "REGULAR";
			break;	
		case 'c':r = "RUIM";
			break;
		case 'C':r = "RUIM";
			break;

		default:r = "INEXISTENTE";
			break;
		}
		return r;
	}
	public static String matchString(char character){
		if(character == 'a' || character == 'A' ){
			return "BOM";
		}
		else if(character == 'b' || character == 'B'){
			return "REGULAR";
		}
		else if(character == 'c' || character == 'C'){
			return "RUIM";
		}
		else{
			
		return "INEXISTENTE";
		}
	}
}
