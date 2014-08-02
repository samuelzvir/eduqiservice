package org.eduqi.eduqiservice.core.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.apache.log4j.Logger;
import org.eduqi.eduqiservice.core.util.EduqiHibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public abstract class HibernateGenericDAO<T> implements GenericDAO<T> {

	private static Logger log = Logger.getLogger(HibernateGenericDAO.class);
	private Class<T> persistentClass;
	private Session session;

	@SuppressWarnings("unchecked")
	public HibernateGenericDAO() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public Session getSession(){
		return this.session;
	}

	public void create(T entidade) {
		session = EduqiHibernateUtil.getInstance();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(entidade);
			tx.commit();
		} catch (HibernateException e) {
			log.error(e,e);
			tx.rollback();
		} finally {
			session.close();
		}
	}

	public void delete(T entity) {
		session = EduqiHibernateUtil.getInstance();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.delete(entity);
			tx.commit();
		} catch (HibernateException e) {
			log.error(e,e);
			tx.rollback();
		} finally {
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	public List<T> listAll() {
		session = EduqiHibernateUtil.getInstance();
		try {
			return this.session.createCriteria(this.persistentClass).list();
		} catch (HibernateException e) {
			log.error(e,e);
		} finally {
			session.close();
		}
		return null;
	}

	public void update(T entity) {
		session = EduqiHibernateUtil.getInstance();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.update(entity);
			tx.commit();
		} catch (HibernateException e) {
			log.error(e,e);
			tx.rollback();
		} finally {
			session.close();
		}
	}

	@SuppressWarnings("unchecked")
	public T findById(Serializable id) {
		session = EduqiHibernateUtil.getInstance();
		T r = (T) this.session.get(this.persistentClass, id);
		session.close();
		return r;
	}
}
