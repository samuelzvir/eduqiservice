package br.org.eduqiservice.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.org.eduqiservice.util.HibernateUtil;

public abstract class HibernateGenericDAO<T> implements GenericDAO<T> {

	private Class<T> persistentClass;
	private Session session;

	public HibernateGenericDAO() {
		//this.session = session;
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public Session getSession(){
		
		return this.session;
	}
	
	public void create(T entidade) {

		session = HibernateUtil.getInstance();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.save(entidade);
			tx.commit();

		} catch (HibernateException e) {

			e.printStackTrace();
			tx.rollback();

		} finally {
			session.close();
		}

	}

	public void delete(T entity) {

		session = HibernateUtil.getInstance();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.delete(entity);
			tx.commit();

		} catch (HibernateException e) {

			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
	}

	public List<T> listAll() {

		session = HibernateUtil.getInstance();
		try {
			return this.session.createCriteria(this.persistentClass).list();

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;

	}

	public void update(T entity) {

		session = HibernateUtil.getInstance();
		Transaction tx = null;
		try {

			tx = session.beginTransaction();
			session.update(entity);
			tx.commit();

		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
	}

	public T findById(Serializable id) {
		session = HibernateUtil.getInstance();
		return (T) this.session.get(this.persistentClass, id);
	}


}
