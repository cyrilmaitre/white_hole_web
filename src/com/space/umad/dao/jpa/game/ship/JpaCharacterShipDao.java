package com.space.umad.dao.jpa.game.ship;

import com.space.umad.dao.game.ship.CharacterShipDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.ship.CharacterShip;

public class JpaCharacterShipDao extends AbstractJpaDao<CharacterShip> implements CharacterShipDao
{

	public JpaCharacterShipDao() 
	{
		super(CharacterShip.class);
	}
	
}
