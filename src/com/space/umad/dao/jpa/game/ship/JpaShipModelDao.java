package com.space.umad.dao.jpa.game.ship;

import com.space.umad.dao.game.ship.ShipModelDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.ship.ShipModel;

public class JpaShipModelDao extends AbstractJpaDao<ShipModel> implements ShipModelDao
{

	public JpaShipModelDao() 
	{
		super(ShipModel.class);
	}

}
