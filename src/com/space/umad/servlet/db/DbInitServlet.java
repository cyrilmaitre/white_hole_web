package com.space.umad.servlet.db;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.space.umad.tools.Constants;


@WebServlet(Constants.LINK_DBINIT)
public class DbInitServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public DbInitServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// Independent objects
		DbInitItemTier.init();
		DbInitAmmoType.init();
		DbInitJob.init();
		DbInitRace.init();
		DbInitSkill.init();
		DbInitNpcType.init();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

	}

}
