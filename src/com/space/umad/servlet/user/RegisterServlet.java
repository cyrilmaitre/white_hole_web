package com.space.umad.servlet.user;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.space.umad.checker.Checker.SuccessType;
import com.space.umad.checker.UserChecker;
import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.User;
import com.space.umad.tools.Constants;
import com.space.umad.tools.Tools;


@WebServlet(Constants.LINK_USER_REGISTER)
public class RegisterServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

    public RegisterServlet() 
    {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher rd = request.getRequestDispatcher(Constants.LINK_USER_REGISTER_STATIC);
        rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// Get param
		String username 	= request.getParameter("username");
		String password		= request.getParameter("password");
		String passwordConf = request.getParameter("passwordConf");
		String email 		= request.getParameter("email");
		
		// Build object
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setRegisterDate(Calendar.getInstance());
		user.setAdmin(false);
		
		// Check
		UserChecker checker = new UserChecker();
		if(!password.equals(passwordConf))
			checker.addError("Password and Confirm Password are not equal");
		
		if(!checker.hasError() && checker.isValid(user))
		{
			// Add into database
			user.setPassword(Tools.sha1(user.getPassword()));
			DaoFactory.getUserDao().add(user);

			// Set success message
			request.setAttribute("success", checker.getSuccessMessage(SuccessType.ADD));
		}
		else
		{
			// Set param
			request.setAttribute("username", username);
			request.setAttribute("password", password);
			request.setAttribute("passwordConf", passwordConf);
			request.setAttribute("email", email);
			
			// Set error message
			request.setAttribute("error", checker.buildHtmlErrorString());
		}
		
		// Redirect
		RequestDispatcher rd = request.getRequestDispatcher(Constants.LINK_USER_REGISTER_STATIC);
        rd.forward(request, response);
	}
	
}
