package com.space.umad.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.space.umad.tools.PersistenceManager;


@WebListener
public class PersistenceAppListener implements ServletContextListener 
{
	//********************
	// Methods
	//********************
	@Override
	public void contextDestroyed(ServletContextEvent arg0) 
	{
		PersistenceManager.closeEntityManagerFactory();
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) 
	{

	}
}