package org.eduqi.eduqiservice.core.dao;

//import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.eduqi.eduqiservice.core.entity.ResultadoEscola;
import org.eduqi.eduqiservice.core.util.EduqiHibernateUtil;
//import org.eduqi.eduqiservice.core.util.EduqiPropertiesLoader;
import org.hibernate.Session;
import org.hibernate.criterion.Property;

public class ResultadoEscolaDAOImpl extends HibernateGenericDAO<ResultadoEscola> implements ResultadoEscolaDAO {

	
	private static final Logger LOG = Logger.getLogger(ResultadoEscolaDAOImpl.class);
	
	/**
	 * Retorna as N escolas com notas mais altas em MT
	 * @return
	 */
	public List<ResultadoEscola> getMilPrimeirosMat(){
		LOG.info("Getting Math results ...");
		Session session = EduqiHibernateUtil.getInstance();
		
		int number = 1000;
//		try {
//				number =Integer.parseInt( EduqiPropertiesLoader.getProps().getProperty("numero-escolas-media-alta-mt") );
//		
//		} catch (NumberFormatException e) {
//			log.error(e,e);
//		} catch (IOException e) {
//			log.error(e,e);
//		}
	
	
		@SuppressWarnings("unchecked")
		List<ResultadoEscola> escolas = session.createCriteria(ResultadoEscola.class)
			    .addOrder(Property.forName("mediaMt").desc()).setMaxResults(number).list();
		session.close();
		
		return escolas;
	}
	
	/**
	 * Retorna as N escolas com notas mais altas em LP
	 * @return
	 */
	public List<ResultadoEscola> getMilPrimeirosLp(){
		Session session = EduqiHibernateUtil.getInstance();
		
		int number = 1000;
//		try {
//			number =Integer.parseInt( EduqiPropertiesLoader.getProps().getProperty("numero-escolas-media-alta-lp") );
//			
//		} catch (NumberFormatException e) {
//			log.error(e,e);
//		} catch (IOException e) {
//			log.error(e,e);
//		}
		
		@SuppressWarnings("unchecked")
		List<ResultadoEscola> escolas = session.createCriteria(ResultadoEscola.class).addOrder(Property.forName("mediaLp").desc()).setMaxResults(number).list();
			session.close();
			
			return escolas;
	}
	
	/**
	 * Retorna as N escolas com notas mais baixas em LP
	 * @return
	 */
	public List<ResultadoEscola> getMilUltimosMt(){
		Session session = EduqiHibernateUtil.getInstance();
		
		int number = 1000;
//		try {
//				number =Integer.parseInt( EduqiPropertiesLoader.getProps().getProperty("numero-escolas-media-baixa-mt") );
//		
//		} catch (NumberFormatException e) {
//			log.error(e,e);
//		} catch (IOException e) {
//			log.error(e,e);
//		}
		
		@SuppressWarnings("unchecked")
		List<ResultadoEscola> escolas = session.createCriteria(ResultadoEscola.class).addOrder(Property.forName("mediaMt").asc()).setMaxResults(number).list();
		session.close();
		
		return escolas;
	}
	
	/**
	 * Retorna as N escolas com notas mais baixas em LP
	 * @return
	 */
	public List<ResultadoEscola> getMilUltimosLp(){
		Session session = EduqiHibernateUtil.getInstance();
	
		int number = 1000;
//		try {
//				number =Integer.parseInt( EduqiPropertiesLoader.getProps().getProperty("numero-escolas-media-baixa-lp") );
//		
//		} catch (NumberFormatException e) {
//			log.error(e,e);
//		} catch (IOException e) {
//			log.error(e,e);
//		}
		
		@SuppressWarnings("unchecked")
		List<ResultadoEscola> escolas = session.createCriteria(ResultadoEscola.class).addOrder(Property.forName("mediaLp").asc()).setMaxResults(number).list();
		session.close();
		
		return escolas;
	}

}
