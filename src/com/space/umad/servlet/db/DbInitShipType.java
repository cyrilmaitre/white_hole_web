package com.space.umad.servlet.db;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.ship.ShipType;

public class DbInitShipType 
{
	public static void init()
	{
		// 1
		{
			ShipType shiptype = new ShipType();
			shiptype.setName("shipTypeFrigateName");
			shiptype.setDescription("shipTypeFrigateDescription");
			DaoFactory.getShipTypeDao().add(shiptype);
		}
		
		// 2
		{
			ShipType shiptype = new ShipType();
			shiptype.setName("shipTypeCruiserName");
			shiptype.setDescription("shipTypeCruiserDescription");
			DaoFactory.getShipTypeDao().add(shiptype);
		}
	}
}
