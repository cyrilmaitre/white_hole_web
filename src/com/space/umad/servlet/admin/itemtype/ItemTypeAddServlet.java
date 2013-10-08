package com.space.umad.servlet.admin.itemtype;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.ItemType;
import com.space.umad.tools.Constants;


@WebServlet(Constants.LINK_ITEMTYPE_ADD)
public class ItemTypeAddServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	public ItemTypeAddServlet() 
	{
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher rd = request.getRequestDispatcher(Constants.LINK_ITEMTYPE_ADD_STATIC);
        rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		String icon = request.getParameter("icon");
		String parent = request.getParameter("parent");
		
		try
		{
			ItemType newItemType = new ItemType();
			newItemType.setName(name);
			newItemType.setDescription(description);
			newItemType.setIcon(icon);
			int idParent = Integer.parseInt(parent);
			if(idParent > 0)
				newItemType.setParent(DaoFactory.getItemTypeDao().findById(idParent));
			else
				newItemType.setParent(null);
			
			DaoFactory.getItemTypeDao().add(newItemType);
		}
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		}
		
		doGet(request, response);
	}

}
