package com.space.umad.servlet.patchnote;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.space.umad.tools.Constants;


@WebServlet(Constants.LINK_PATCHNOTE_ADD)
public class AddPatchNoteServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

    public AddPatchNoteServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(Constants.LINK_PATCHNOTE_LIST_STATIC);
        rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

	}

}
