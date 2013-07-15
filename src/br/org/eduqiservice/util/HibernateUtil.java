package br.org.eduqiservice.util;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

	private static Logger log = Logger.getLogger(HibernateUtil.class);
	private static  SessionFactory sessionFactory;
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();

	static {
		try {
				sessionFactory = new AnnotationConfiguration().configure("br/org/eduqiservice/connection/hibernate.cfg.xml").buildSessionFactory();

		} catch (Throwable t) {
			log.error(t,t);
		}
	}

	public static Session getInstance() {
		Session session = (Session) threadLocal.get();
		session = sessionFactory.openSession();
		threadLocal.set(session);
		return session;
	}
}
