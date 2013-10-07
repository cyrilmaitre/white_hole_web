package com.space.umad.servlet.admin.config;

import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.Item;
import com.space.umad.entity.game.weapon.AmmoModel;
import com.space.umad.tools.Constants;

/**
 * Servlet implementation class ConfigItem
 */
@WebServlet(Constants.LINK_CONFIGITEM)
public class ConfigItem extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public ConfigItem() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ZipOutputStream zipos = null;
		ZipEntry ze = null;
		
		List<Item> items = DaoFactory.getItemDao().findAll();
		
		try
		{
			zipos = new ZipOutputStream(response.getOutputStream());
			response.setContentType("application/zip");
			response.addHeader("Content-Disposition", "attachment; filename=item.zip");
		
			for(Item current : items)
			{
				ze = new ZipEntry("item-" + current.getIdItem());
				zipos.putNextEntry(ze);
				zipos.write(current.toConfigItem().getBytes());
				zipos.flush();
			}
		} 
		catch (Exception e) 
		{ 
			e.printStackTrace();
		}
		finally  
		{ 
			if(zipos != null)
				zipos.close();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
