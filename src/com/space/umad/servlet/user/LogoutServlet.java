package com.space.umad.servlet.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.space.umad.tools.Constants;


@WebServlet("/logged/logout")
public class LogoutServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public LogoutServlet()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession(true);
	    session.setAttribute("login", null);
	    response.sendRedirect(Constants.LINK_ABSOLUTE_PREFIXE);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
	
}
