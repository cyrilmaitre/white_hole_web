package com.space.umad.dao.jpa;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.space.umad.dao.Dao;
import com.space.umad.tools.PersistenceManager;

public abstract class AbstractJpaDao<T> implements Dao<T> 
{
	//********************
    // Attributs
    //********************
	private Class<T> object;
	
	
	//********************
    // Constructor
    //********************
	protected AbstractJpaDao(Class<T> object)
	{
		this.object = object;
	}
	
	
	//********************
    // Methods
    //********************
	@Override
	public T add(T newObject) 
	{
		// Init
    	EntityManager em = PersistenceManager.getEntityManagerFactory().createEntityManager();
        
        // Persist
        try
        {
        	em.getTransaction().begin();
        	em.persist(newObject);
        	em.getTransaction().commit();
        	return newObject;
        }
        finally
        {
        	if(em.getTransaction().isActive()) 
        	{ 
                em.getTransaction().rollback();
            }
            em.close();
        }
	}

	@Override
	public void update(T object) 
	{
		// Init
    	EntityManager em = PersistenceManager.getEntityManagerFactory().createEntityManager();

        // Update
        try
        {
        	em.getTransaction().begin();
        	em.merge(object);
        	em.getTransaction().commit();
        }
        finally
        {
        	if(em.getTransaction().isActive()) 
        	{ 
                em.getTransaction().rollback();
            }
            em.close();
        }	
	}

	@Override
	public void remove(int id) 
	{
		// Init
    	EntityManager em = PersistenceManager.getEntityManagerFactory().createEntityManager();
        
        // Remove
        try
        {
        	em.getTransaction().begin();
        	em.remove(em.find(object, id));
        	em.getTransaction().commit();
        }
        finally
        {
        	if(em.getTransaction().isActive()) 
        	{ 
                em.getTransaction().rollback();
            }
            em.close();
        }			
	}

	@Override
	public T findById(int id) 
	{
		// Init
    	EntityManager em = PersistenceManager.getEntityManagerFactory().createEntityManager();
        
        // Get
        try
        {
        	T find = (T) em.find(object, id);
        	
        	return find;
        }
        finally
        {      	
            em.close();
        }	
	}

	@Override
	public List<T> findAll() 
	{
		// Init
    	EntityManager em = PersistenceManager.getEntityManagerFactory().createEntityManager();
    	Query query = em.createQuery("SELECT p FROM "+object.getSimpleName()+" AS p");
    	
    	// Get all
    	try
    	{
    		@SuppressWarnings("unchecked")
    		List<T> list = query.getResultList();
    		return list;
    	}
    	finally
    	{
    		em.close();
    	}
	}
	
	@Override
	public T findByCondition(String condition) 
	{
		EntityManager em = PersistenceManager.getEntityManagerFactory().createEntityManager();
		Query query = (Query) em.createQuery("SELECT p FROM " + object.getSimpleName() + " AS p WHERE " + condition);
		query.setMaxResults(1);

		try 
		{
			@SuppressWarnings("unchecked")
			T result = (T) query.getSingleResult();
			return result;
		} 
		catch (Exception e) 
		{
			return null;
		} 
		finally 
		{
			em.close();
		}
	}

	@Override
	public List<T> findAllByCondition(String condition)
	{
		EntityManager em = PersistenceManager.getEntityManagerFactory().createEntityManager();
		Query query = em.createQuery("SELECT p FROM " + object.getSimpleName() + " AS p WHERE " + condition);

		try 
		{
			@SuppressWarnings("unchecked")
			List<T> resultList = query.getResultList();
			return resultList;
		}
		catch (Exception e) 
		{
			return null;
		} 
		finally 
		{
			em.close();
		}
	}

	@Override
	public T findByNamedQuery(String queryName, Map<String, Object> parameters) 
	{
		EntityManager em = PersistenceManager.getEntityManagerFactory().createEntityManager();
		Query query = em.createNamedQuery(queryName);
		query.setMaxResults(1);

		for (Map.Entry<String, Object> entry : parameters.entrySet()) 
		{
			String key = entry.getKey();
			Object value = entry.getValue();
			query.setParameter(key, value);
		}

		try 
		{
			@SuppressWarnings("unchecked")
			T result = (T) query.getSingleResult();
			return result;
		} 
		catch (Exception e) 
		{
			return null;
		}
		finally 
		{
			em.close();
		}
	}

	@Override
	public List<T> findAllByNamedQuery(String queryName, Map<String, Object> parameters) 
	{
		EntityManager em = PersistenceManager.getEntityManagerFactory().createEntityManager();
		Query query = em.createNamedQuery(queryName);

		// -- Set parameters
		for (Map.Entry<String, Object> entry : parameters.entrySet()) 
		{
			String key = entry.getKey();
			Object value = entry.getValue();
			query.setParameter(key, value);
		}

		try 
		{
			@SuppressWarnings("unchecked")
			List<T> resultList = query.getResultList();
			return resultList;
		} 
		catch (Exception e) 
		{
			return null;
		} 
		finally 
		{
			em.close();
		}
	}
}