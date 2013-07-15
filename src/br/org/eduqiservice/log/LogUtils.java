package br.org.eduqiservice.log;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LogUtils {

	private static Properties prop;
	private static String pathLog;

	public static String getPathLog() {
		return pathLog;
	}

	public static void setPathLog(String pathLog) {
		LogUtils.pathLog = pathLog;
	}
	
	@SuppressWarnings("unused")
	private synchronized static Properties getFile() throws IOException {
		
		if (prop == null) {
			prop = new Properties();
			FileInputStream fileInputStream = new FileInputStream(pathLog);			
			prop.load(fileInputStream);
			fileInputStream.close();
		}
		return prop;
		
	}
	
}
