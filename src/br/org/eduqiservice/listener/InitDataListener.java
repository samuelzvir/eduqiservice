package br.org.eduqiservice.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.propertiesconfig.util.PropertiesLoader;

import br.org.eduqiservice.control.CacheSearchController;
import br.org.eduqiservice.thread.ProbThread;

/**
 * Listener utilizado para iniciar o processamento dos dados.
 *
 */
public class InitDataListener implements ServletContextListener, HttpSessionListener {

    /**
     * Default constructor. 
     */
    public InitDataListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent contextEvent) {
        
    	ServletContext context = contextEvent.getServletContext();
    	
    	String props = context.getRealPath("WEB-INF/properties/properties.properties");
    	PropertiesLoader.setPropertiesPath(props);
    	
    	System.out.println("Carrega dados");
        CacheSearchController.initCacheSearchList();
        Thread t = new Thread(new ProbThread());
        t.start();        
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0) {
        // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0) {
        // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
