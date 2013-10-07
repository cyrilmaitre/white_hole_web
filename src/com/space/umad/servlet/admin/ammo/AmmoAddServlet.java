package com.space.umad.servlet.admin.ammo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.weapon.AmmoModel;
import com.space.umad.tools.Constants;

@WebServlet(Constants.LINK_AMMO_ADD)
public class AmmoAddServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public AmmoAddServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		RequestDispatcher rd = request.getRequestDispatcher(Constants.LINK_AMMO_ADD_STATIC);
        rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		String volume = request.getParameter("volume");
		String price = request.getParameter("price");
		String sprite = request.getParameter("sprite");
		String itemtype = request.getParameter("itemtype");
		String itemtier = request.getParameter("itemtier");
		String lifetime = request.getParameter("lifetime");
		String damage = request.getParameter("damage");
		String splashradius = request.getParameter("splashradius");
		String ammotype = request.getParameter("ammotype");
		String velocity = request.getParameter("velocity");
		String quickening = request.getParameter("quickening");
		String projectiletype = request.getParameter("projectiletype");
		String projectilecolor = request.getParameter("projectilecolor");
		String projectilescale = request.getParameter("projectilescale");
		String soundfire = request.getParameter("soundfire");
		
		try
		{
			AmmoModel newAmmo = new AmmoModel();
			newAmmo.setName(name);
			newAmmo.setDescription(description);
			newAmmo.setVolume(Float.parseFloat(volume));
			newAmmo.setPrice(Float.parseFloat(price));
			newAmmo.setSpriteId(sprite);
			newAmmo.setItemType(DaoFactory.getItemTypeDao().findById(Integer.parseInt(itemtype)));
			newAmmo.setItemTier(DaoFactory.getItemTierDao().findById(Integer.parseInt(itemtier)));
			newAmmo.setLifeTime(Long.parseLong(lifetime));
			newAmmo.setDamage(Double.parseDouble(damage));
			newAmmo.setSplashRadius(Double.parseDouble(splashradius));
			newAmmo.setAmmoType(DaoFactory.getAmmoTypeDao().findById(Integer.parseInt(ammotype)));
			newAmmo.setVelocity(Float.parseFloat(velocity));
			newAmmo.setQuickening(Float.parseFloat(quickening));
			newAmmo.setProjectileType(Integer.parseInt(projectiletype));
			newAmmo.setProjectileColor(projectilecolor);
			newAmmo.setProjectileScale(Float.parseFloat(projectilescale));
			newAmmo.setSoundFire(soundfire);
			
			DaoFactory.getAmmoModelDao().add(newAmmo);
		}
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		}
	
		doGet(request, response);
	}

}
