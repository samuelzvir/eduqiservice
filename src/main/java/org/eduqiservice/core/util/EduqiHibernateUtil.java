package org.eduqiservice.core.util;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Class that delivers  {@link Session} objects used 
 * in database transactions.
 * @author samuel
 *
 */
public class EduqiHibernateUtil {

	private static final Logger LOG = Logger.getLogger(EduqiHibernateUtil.class);
	private static  SessionFactory sessionFactory;
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();

	static {
		try {
			 
			Configuration cfg = new Configuration().configure("org/eduqiservice/connection/hibernate.cfg.xml");         
			StandardServiceRegistryBuilder sb = new StandardServiceRegistryBuilder();
			sb.applySettings(cfg.getProperties());
			StandardServiceRegistry standardServiceRegistry = sb.build();                   
			sessionFactory = cfg.buildSessionFactory(standardServiceRegistry);

		} catch (Throwable t) {
			LOG.warn("Session Factory Creation failed!");
			LOG.error(t,t);
		}
	}

	public static Session getInstance() {
		Session session = (Session) threadLocal.get();
		session = sessionFactory.openSession();
		threadLocal.set(session);
		return session;
	}
}
