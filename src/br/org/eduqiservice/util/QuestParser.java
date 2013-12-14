package br.org.eduqiservice.util;

public class QuestParser {

	
	public static String match(char character){
		String r = "";
		switch (character) {
		case 'a':r = "BOM";
			break;
		
		case 'b':r = "REGULAR";
			break;
		case 'c':r = "RUIM";
			break;

		default:r = "INEXISTENTE";
			break;
		}
		return r;
	}
	public static String matchString(char character){
		if(character == 'a'){
			return "BOM";
		}
		else if(character == 'b'){
			return "REGULAR";
		}
		else if(character == 'c'){
			return "RUIM";
		}
		else{
			
		return "INEXISTENTE";
		}
	}
}
