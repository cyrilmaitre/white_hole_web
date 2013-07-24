package com.space.umad.servlet.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.User;
import com.space.umad.tools.Constants;
import com.space.umad.tools.Tools;
import com.space.umad.tools.UserTools;


@WebServlet(Constants.LINK_USER_LOGIN)
public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public LoginServlet()
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher rd = request.getRequestDispatcher(Constants.LINK_USER_LOGIN_STATIC);
        rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User user = UserTools.findUserByUsernameAndPassword(DaoFactory.getUserDao().findAll(), username, Tools.sha1(password));
		if( user != null) 
		{
			HttpSession session = request.getSession(true);
		    session.setAttribute("login", user);
            response.sendRedirect(Constants.LINK_ABSOLUTE_PREFIXE); 
		}
		else
		{
			request.setAttribute("username", username);
			request.setAttribute("error", "Invalid username or password. Please try again.");
			doGet(request, response);
		}
	}
	
}
