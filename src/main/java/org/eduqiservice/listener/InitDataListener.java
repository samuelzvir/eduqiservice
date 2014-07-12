package org.eduqiservice.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eduqiservice.control.CacheSearchController;
import org.eduqiservice.core.util.EduqiPropertiesLoader;
import org.eduqiservice.log.LogUtils;
import org.eduqiservice.thread.ProbThread;

/**
 * Listener utilizado para iniciar o processamento dos dados.
 *
 */
public class InitDataListener implements ServletContextListener, HttpSessionListener {

	Logger log = Logger.getLogger(InitDataListener.class);
	
    /**
     * Default constructor. 
     */
    public InitDataListener() {}

    public void contextInitialized(ServletContextEvent contextEvent) {
        
    	ServletContext context = contextEvent.getServletContext();
   
    	//configura log4j
    	String logpath = context.getRealPath("WEB-INF/log4j/log4j.properties");
		LogUtils.setPathLog(logpath);
		PropertyConfigurator.configure(logpath);
    	
		//configura propriedades utilizadas
		String props = context.getRealPath("WEB-INF/properties/properties.properties");
    	EduqiPropertiesLoader.setPropertiesPath(props);
    	
    	log.info("Inicia o loading dos dados");
        CacheSearchController.initCacheSearchList();
        Thread t = new Thread(new ProbThread());
        t.start();        
    }

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {}
	
}
