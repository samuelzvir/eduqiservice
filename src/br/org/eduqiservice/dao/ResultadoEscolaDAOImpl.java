package br.org.eduqiservice.dao;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.criterion.Property;

import br.org.eduqiservice.util.PropertiesLoader;

import br.org.eduqiservice.model.ResultadoEscola;
import br.org.eduqiservice.util.HibernateUtil;

public class ResultadoEscolaDAOImpl extends HibernateGenericDAO<ResultadoEscola> implements ResultadoEscolaDAO {

	
	private static Logger log = Logger.getLogger(ResultadoEscolaDAOImpl.class);
	
	/**
	 * Retorna as N escolas com notas mais altas em MT
	 * @return
	 */
	public List<ResultadoEscola> getMilPrimeirosMat(){
		Session session = HibernateUtil.getInstance();
		
		int number = 0;
		try {
				number =Integer.parseInt( PropertiesLoader.getProps().getProperty("numero-escolas-media-alta-mt") );
		
		} catch (NumberFormatException e) {
			log.error(e,e);
		} catch (IOException e) {
			log.error(e,e);
		}
	
	
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
		Session session = HibernateUtil.getInstance();
		
		int number = 0;
		try {
				number =Integer.parseInt( PropertiesLoader.getProps().getProperty("numero-escolas-media-alta-lp") );
		
		} catch (NumberFormatException e) {
			log.error(e,e);
		} catch (IOException e) {
			log.error(e,e);
		}
	
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
		Session session = HibernateUtil.getInstance();
		
		int number = 0;
		try {
				number =Integer.parseInt( PropertiesLoader.getProps().getProperty("numero-escolas-media-baixa-mt") );
		
		} catch (NumberFormatException e) {
			log.error(e,e);
		} catch (IOException e) {
			log.error(e,e);
		}
		
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
		Session session = HibernateUtil.getInstance();
	
		int number = 0;
		try {
				number =Integer.parseInt( PropertiesLoader.getProps().getProperty("numero-escolas-media-baixa-lp") );
		
		} catch (NumberFormatException e) {
			log.error(e,e);
		} catch (IOException e) {
			log.error(e,e);
		}
		
		@SuppressWarnings("unchecked")
		List<ResultadoEscola> escolas = session.createCriteria(ResultadoEscola.class).addOrder(Property.forName("mediaLp").asc()).setMaxResults(number).list();
		session.close();
		
		return escolas;
	}

}
