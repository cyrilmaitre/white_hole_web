package com.space.umad.dao;

import java.util.List;
import java.util.Map;

public interface Dao<T> 
{
	T add(T newObject);
    void update(T object);
    void remove(int id);
    T findById(int id);
    List<T> findAll();
	T findByCondition(String condition);
	List<T> findAllByNamedQuery(String queryName, Map<String, Object> parameters);
	List<T> findAllByCondition(String condition);
	T findByNamedQuery(String queryName, Map<String, Object> parameters);	
}