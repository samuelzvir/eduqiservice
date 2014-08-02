package org.eduqi.eduqiservice.core.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

public interface GenericDAO<T> {

	public Session getSession();

	public T findById(Serializable id);

	public List<T> listAll();
	
	public void create(T entity);
	
	public void update(T entity);
	
	public void delete(T entity);

}
