package com.space.umad.dao.jpa.game.ship;

import com.space.umad.dao.game.ship.ShipTypeDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.ship.ShipType;

public class JpaShipTypeDao extends AbstractJpaDao<ShipType> implements ShipTypeDao
{

	public JpaShipTypeDao()
	{
		super(ShipType.class);
	}
	
}
