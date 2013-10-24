package com.space.umad.servlet.admin.weapon;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.weapon.WeaponModel;
import com.space.umad.tools.Constants;

@WebServlet(Constants.LINK_WEAPONMODEL_ADD)
public class WeaponModelAddServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public WeaponModelAddServlet() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher rd = request.getRequestDispatcher(Constants.LINK_WEAPONMODEL_ADD_STATIC);
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
		String damagemultiplier = request.getParameter("damagemultiplier");
		String ammomax = request.getParameter("ammomax");
		String range = request.getParameter("range");
		String rangeangle = request.getParameter("rangeangle");
		String reloadingspeed = request.getParameter("reloadingspeed");
		String firerate = request.getParameter("firerate");
		String soundreload = request.getParameter("soundreload");
		String ammotypeallowed = request.getParameter("ammotypeallowed");
		
		try
		{
			WeaponModel newWeaponModel = new WeaponModel();
			newWeaponModel.setName(name);
			newWeaponModel.setDescription(description);
			newWeaponModel.setVolume(Float.parseFloat(volume));
			newWeaponModel.setStackMax(1); // Pre-defined value
			newWeaponModel.setPrice(Float.parseFloat(price));
			newWeaponModel.setSpriteId(sprite);
			newWeaponModel.setItemType(DaoFactory.getItemTypeDao().findById(Integer.parseInt(itemtype)));
			newWeaponModel.setItemTier(DaoFactory.getItemTierDao().findById(Integer.parseInt(itemtier)));
			newWeaponModel.setDamageMultiplier(Float.parseFloat(damagemultiplier));
			newWeaponModel.setAmmoMax(Integer.parseInt(ammomax));
			newWeaponModel.setRange(Double.parseDouble(range));
			newWeaponModel.setRangeAngle(Double.parseDouble(rangeangle));
			newWeaponModel.setReloadingSpeed((float)Double.parseDouble(reloadingspeed));
			newWeaponModel.setFireRate((float)Double.parseDouble(firerate));
			newWeaponModel.setSoundReload(soundreload);
			newWeaponModel.setAmmoTypeAllowed(ammotypeallowed);
			
			DaoFactory.getWeaponModelDao().add(newWeaponModel);
		}
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		}
		
		doGet(request, response);
	}

}
