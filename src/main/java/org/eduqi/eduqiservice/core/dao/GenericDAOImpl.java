package org.eduqi.eduqiservice.core.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.hibernate.engine.transaction.spi.LocalStatus;
import org.springframework.core.GenericTypeResolver;
import org.springframework.stereotype.Repository;

@Repository
@SuppressWarnings("unchecked")
public abstract class GenericDAOImpl<T> implements GenericDAO<T> {

	protected Class<T> persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	protected Session session;
	private static Logger LOG = LoggerFactory.getLogger(GenericDAOImpl.class);
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	private Transaction transaction;

	@Override
	public Session getSession(){
		session = sessionFactory.getCurrentSession();
		if(session == null){
			this.session = sessionFactory.openSession();
			LOG.debug("Session opened");
		}
		if(session != null && !(session.getTransaction().getLocalStatus().equals(LocalStatus.ACTIVE))){
			session.beginTransaction();
			LOG.debug("Begining Transaction");
		}
		return this.session;
	}

	@Override
	public boolean create(T entity) {
		session = getSession();
		boolean success = true;
		try {
			transaction = session.getTransaction();
			session.save(entity);
			transaction.commit();
		} catch (HibernateException e) {
			success = false;
			transaction.rollback();
			e.printStackTrace();
			LOG.error("Error: ", e.getMessage());
		}
		return success;
	}

	@Override
	public boolean delete(T entity) {
		boolean success = true;
		session = getSession();
		try {
			session.delete(entity);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			success = false;
			LOG.error("error", e.getMessage());
		} 
		return success;
	}

	public void deleteAll(){
		session = getSession();
		transaction = session.getTransaction();
		try {
			this.persistentClass = (Class<T>) GenericTypeResolver
					.resolveTypeArgument(getClass(), GenericDAO.class);
			final Query query = (Query) session.createQuery("delete from "
					+ persistentClass.getName());
			query.executeUpdate();	
			transaction.commit();
		} catch (final HibernateException e) {
			transaction.rollback();
			LOG.error("Problem deleting all", e.getMessage());
		}
	}

	public List<T> listAll() {
		session = getSession();
		try {
			return this.session.createCriteria(this.persistentClass).list();
		} catch (HibernateException e) {
			LOG.error("error", e.getMessage());
		} 
		return null;
	}

	@Override
	public boolean update(T entity) {
		boolean success = true;
		session = getSession();

		try {
			transaction = session.getTransaction();
			session.update(entity);
			transaction.commit();
		} catch (HibernateException e) {
			success = false;
			transaction.rollback();
			LOG.error("error", e.getMessage());
		}
		return success;
	}

	public T findById(Integer id) {
		session = getSession();
		return (T) this.session.get(this.persistentClass, id);
	}

	public List<T> findByValueBetweenValue(String column, Object first, Object last) {
		session = getSession();
		Criteria criteria = session.createCriteria(this.persistentClass);
		criteria.add(Restrictions.between(column, first, last));
		return criteria.list();
	}

	public List<T> findByParams(Map<String, Object> params) {
		session = getSession();
		Criteria criteria = session.createCriteria(this.persistentClass);
		Set<Entry<String, Object>> s = params.entrySet();
		Iterator<Entry<String, Object>> it = s.iterator();
		while (it.hasNext()) {
			Entry<String, Object> m = it.next();
			String key = (String) m.getKey();
			Object value = m.getValue();
			criteria.add(Restrictions.like(key, value));
		}
		List<T> list = criteria.list();
		return list;
	}

	public List<T> findByParamsOrderByDesc(Map<String, Object> params, String ColumnOrderBy) {
		session = getSession();
		Criteria criteria = session.createCriteria(this.persistentClass);
		Set<Entry<String, Object>> s = params.entrySet();
		Iterator<Entry<String, Object>> it = s.iterator();
		while (it.hasNext()) {
			Entry<String, Object> m = it.next();
			String key = (String) m.getKey();
			Object value = m.getValue();
			criteria.add(Restrictions.like(key, value));
		}
		criteria.addOrder(Order.desc(ColumnOrderBy));
		List<T> list = criteria.list();
		return list;
	}

	public List<T> findByParamsOrderByAsc(Map<String, Object> params, String ColumnOrderBy) {
		session = getSession();
		Criteria criteria = session.createCriteria(this.persistentClass);
		Set<Entry<String, Object>> s = params.entrySet();
		Iterator<Entry<String, Object>> it = s.iterator();
		while (it.hasNext()) {
			Entry<String, Object> m = it.next();
			String key = (String) m.getKey();
			Object value = m.getValue();
			criteria.add(Restrictions.like(key, value));
		}
		criteria.addOrder(Order.asc(ColumnOrderBy));
		List<T> list = criteria.list();
		return list;
	}

	public List<T> findObjectByLimitParams(Map<String, Object> params, int first, int max) {
		session = getSession();
		Criteria criteria = session.createCriteria(this.persistentClass);
		Set<Entry<String, Object>> s = params.entrySet();
		Iterator<Entry<String, Object>> it = s.iterator();
		while (it.hasNext()) {
			Entry<String, Object> m = it.next();
			String key = (String) m.getKey();
			Object value = m.getValue();
			criteria.add(Restrictions.like(key, value));
		}
		criteria.setMaxResults(max);
		criteria.setFirstResult(first);
		List<T> list = criteria.list();
		return list;
	}

	@Override
	public T findById(Serializable id) {
		session = getSession();
		return (T) this.session.get(this.persistentClass, id);
	}

	@Override
	public List<T> getByQuery(String instruction) {
		session = getSession();
		Query query = session.createQuery(instruction);
		return query.list();
	}

	@Override
	public List<T> listByRangeColumnAsc(int limit, String column){
		return session.createCriteria(this.persistentClass).addOrder(Property.forName(column).asc()).setMaxResults(limit).list();
	}

	@Override
	public List<T> listByRangeColumnDesc(int limit, String column){
		session = getSession();
		return session.createCriteria(this.persistentClass).addOrder(Property.forName(column).desc()).setMaxResults(limit).list();
	}
}