package org.eduqi.eduqiservice.core.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Simple class to get properties from a .properties file.
 * 
 * @author samuel
 *
 */

public class EduqiPropertiesLoader {

        private static String propertiesPath;
        
        /**
         * Gets a Properties object from a .properties file 
         * specified in propertiesPath
         * 
         * @throws IOException
         */
        public static Properties getProps() throws IOException {
        Properties properties = new Properties();
        FileInputStream file = new FileInputStream(propertiesPath);
        properties.load(file);
        
        return properties;
    }

        public static String getPropertiesPath() {
                return propertiesPath;
        }

        public static void setPropertiesPath(String propertiesPath) {
                EduqiPropertiesLoader.propertiesPath = propertiesPath;
        }
        
}