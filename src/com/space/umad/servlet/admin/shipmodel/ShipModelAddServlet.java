package com.space.umad.servlet.admin.shipmodel;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.ship.ShipModel;
import com.space.umad.tools.Constants;


@WebServlet(Constants.LINK_SHIPMODEL_ADD)
public class ShipModelAddServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public ShipModelAddServlet() 
    {
    	super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher rd = request.getRequestDispatcher(Constants.LINK_SHIPMODEL_ADD_STATIC);
        rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		String spriteitem = request.getParameter("spriteitem");
		String itemtype = request.getParameter("itemtype");
		String itemtier = request.getParameter("itemtier");
		String hitbox_width = request.getParameter("hitbox_width");
		String hitbox_height = request.getParameter("hitbox_height");
		String sprite = request.getParameter("sprite");
		String sprite_wreck = request.getParameter("sprite_wreck");
		String sprite_wreckember = request.getParameter("sprite_wreckember");
		String sprite_wreckelec = request.getParameter("sprite_wreckelec");
		String sprite_shield = request.getParameter("sprite_shield");
		String explosion_sound = request.getParameter("explosion_sound");
		String levelconf = request.getParameter("levelconf");
		String reactors = request.getParameter("reactors");
		String reactor_sound = request.getParameter("reactor_sound");
		String flashinglights = request.getParameter("flashinglights");
		String weapons = request.getParameter("weapons");
		String turrets = request.getParameter("turrets");
		String radars = request.getParameter("radars");
		String weapontype_allowed = request.getParameter("weapontype_allowed");
		
		try
		{
			ShipModel newShipModel = new ShipModel();
			newShipModel.setName(name);
			newShipModel.setDescription(description);
			newShipModel.setPrice(1000000.0f);
			newShipModel.setStackMax(1);
			newShipModel.setSpriteId(spriteitem);
			newShipModel.setItemType(DaoFactory.getItemTypeDao().findById(Integer.parseInt(itemtype)));
			newShipModel.setItemTier(DaoFactory.getItemTierDao().findById(Integer.parseInt(itemtier)));
			newShipModel.setBuyable(true);
			newShipModel.setStockMinimumMin(1);
			newShipModel.setStockMinimumMax(2);
			newShipModel.setStockMaximumMin(5);
			newShipModel.setStockMaximumMax(10);
			newShipModel.setProductionMin(0.5f);
			newShipModel.setProductionMax(2.5f);
			newShipModel.setConsumptionMin(0.5f);
			newShipModel.setConsumptionMax(2.5f);
			
			newShipModel.setHitboxWidth(Integer.parseInt(hitbox_width));
			newShipModel.setHitboxHeight(Integer.parseInt(hitbox_height));
			newShipModel.setScaleMin(1.0f);
			newShipModel.setScaleMax(1.0f);
			newShipModel.setSprite(sprite);
			newShipModel.setSpriteWreck(sprite_wreck);
			newShipModel.setSpriteWreckEmber(sprite_wreckember);
			newShipModel.setSpriteWreckElec(sprite_wreckelec);
			newShipModel.setSpriteShield(sprite_shield);
			newShipModel.setExplosionSoud(explosion_sound);
			newShipModel.setLevelConf(levelconf);
			newShipModel.setShield(1000.0);
			newShipModel.setShieldRegen(5.0);
			newShipModel.setShieldResist(0.0);
			newShipModel.setArmor(1500.0);
			newShipModel.setArmorRegen(2.0);
			newShipModel.setArmorResist(0.0);
			newShipModel.setStructure(2000.0);
			newShipModel.setStructureRegen(1.0);
			newShipModel.setStructureResist(0.0);
			newShipModel.setVelocity(750.0f);
			newShipModel.setQuickening(200.0f);
			newShipModel.setCargo(50);
			newShipModel.setWeaponSlot(4);
			newShipModel.setUpgradeSlot(2);
			newShipModel.setStuffSlot(2);
			newShipModel.setRotationVelocity(180.0f);
			newShipModel.setReactors(!reactors.equals("") ? reactors : null);
			newShipModel.setReactorSound(reactor_sound);
			newShipModel.setFlashingLights(!flashinglights.equals("") ? flashinglights : null);
			newShipModel.setWeapons(!weapons.equals("") ? weapons : null);
			newShipModel.setTurrets(!turrets.equals("") ? turrets : null);
			newShipModel.setRadars(!radars.equals("") ? radars : null);
			newShipModel.setWeaponTypeAllowed(weapontype_allowed);			
			
			DaoFactory.getShipModelDao().add(newShipModel);
		}
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		}		
		
		doGet(request, response);
	}

}
