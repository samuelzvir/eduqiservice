package org.eduqi.eduqiservice.core.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;

public interface GenericDAO<T> {

	Session getSession();
	T findById(Serializable id);
	List<T> listAll();
	boolean create(T entity);
	boolean update(T entity);
	boolean delete(T entity);
	void deleteAll();
	List<T> getByQuery(String instruction);
	List<T> findByValueBetweenValue(String column, Object first, Object last) ;
	List<T> findByParams(Map<String, Object> params);
	List<T> findObjectByLimitParams(Map<String, Object> params,int first, int max); 
	List<T> findByParamsOrderByAsc(Map<String, Object> params, String ColumnOrderBy);
	List<T> findByParamsOrderByDesc(Map<String, Object> params, String ColumnOrderBy);
	List<T> listByRangeColumnDesc(int limit, String column);
	List<T> listByRangeColumnAsc(int limit, String column);
}
