package com.space.umad.servlet.db;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.ship.ShipModel;

public class DbInitShipModel
{
	public static void init()
	{
		// 1000
		{
			ShipModel shipmodel = new ShipModel();
			shipmodel.setName("shipModelFXT01Name");
			shipmodel.setDescription("shipModelFXT01Description");
			shipmodel.setPrice(500);
			shipmodel.setStackMax(1);
			shipmodel.setSpriteId("0-0");
			shipmodel.setItemType(DaoFactory.getItemTypeDao().findById(35));
			shipmodel.setItemTier(DaoFactory.getItemTierDao().findById(1));
			shipmodel.setShipType(DaoFactory.getShipTypeDao().findById(1));
			DaoFactory.getShipModelDao().add(shipmodel);
		}
		
		// 1001
		{
			ShipModel shipmodel = new ShipModel();
			shipmodel.setName("shipModelFXT02Name");
			shipmodel.setDescription("shipModelFXT02Description");
			shipmodel.setPrice(500);
			shipmodel.setStackMax(1);
			shipmodel.setSpriteId("0-0");
			shipmodel.setItemType(DaoFactory.getItemTypeDao().findById(35));
			shipmodel.setItemTier(DaoFactory.getItemTierDao().findById(1));
			shipmodel.setShipType(DaoFactory.getShipTypeDao().findById(1));
			DaoFactory.getShipModelDao().add(shipmodel);
		}
		
		// 1002
		{
			ShipModel shipmodel = new ShipModel();
			shipmodel.setName("shipModelFXT03Name");
			shipmodel.setDescription("shipModelFXT03Description");
			shipmodel.setPrice(500);
			shipmodel.setStackMax(1);
			shipmodel.setSpriteId("0-0");
			shipmodel.setItemType(DaoFactory.getItemTypeDao().findById(35));
			shipmodel.setItemTier(DaoFactory.getItemTierDao().findById(1));
			shipmodel.setShipType(DaoFactory.getShipTypeDao().findById(1));
			DaoFactory.getShipModelDao().add(shipmodel);
		}
	}
}
