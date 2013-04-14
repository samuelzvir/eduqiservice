package br.org.eduqiservice.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Property;


import br.org.eduqiservice.model.ResultadoEscola;
import br.org.eduqiservice.util.HibernateUtil;

public class ResultadoEscolaDAOImpl extends HibernateGenericDAO<ResultadoEscola> implements ResultadoEscolaDAO {

	/**
	 * Retorna as 100 escolas com notas mais altas em MT
	 * @return
	 */
	public List<ResultadoEscola> getMilPrimeirosMat(){
		Session session = HibernateUtil.getInstance();
	
		@SuppressWarnings("unchecked")
		List<ResultadoEscola> escolas = session.createCriteria(ResultadoEscola.class)
			    .addOrder(Property.forName("mediaMt").desc()).setMaxResults(100).list();
		
		return escolas;
	}
	
	/**
	 * Retorna as 100 escolas com notas mais altas em LP
	 * @return
	 */
	public List<ResultadoEscola> getMilPrimeirosLp(){
		Session session = HibernateUtil.getInstance();
	
		@SuppressWarnings("unchecked")
		List<ResultadoEscola> escolas = session.createCriteria(ResultadoEscola.class).addOrder(Property.forName("mediaLp").desc()).setMaxResults(100).list();
		
		return escolas;
	}
	
	/**
	 * Retorna as 100 escolas com notas mais baixas em LP
	 * @return
	 */
	public List<ResultadoEscola> getMilUltimosMt(){
		Session session = HibernateUtil.getInstance();
	
		@SuppressWarnings("unchecked")
		List<ResultadoEscola> escolas = session.createCriteria(ResultadoEscola.class).addOrder(Property.forName("mediaMt").asc()).setMaxResults(100).list();
		
		return escolas;
	}
	
	/**
	 * Retorna as 100 escolas com notas mais baixas em LP
	 * @return
	 */
	public List<ResultadoEscola> getMilUltimosLp(){
		Session session = HibernateUtil.getInstance();
	
		@SuppressWarnings("unchecked")
		List<ResultadoEscola> escolas = session.createCriteria(ResultadoEscola.class).addOrder(Property.forName("mediaLp").asc()).setMaxResults(100).list();
		
		return escolas;
	}

}
