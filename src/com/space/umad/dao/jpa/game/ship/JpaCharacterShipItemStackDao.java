package com.space.umad.dao.jpa.game.ship;

import com.space.umad.dao.game.ship.CharacterShipItemStackDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.ship.CharacterShipItemStack;

public class JpaCharacterShipItemStackDao extends AbstractJpaDao<CharacterShipItemStack> implements CharacterShipItemStackDao
{

	public JpaCharacterShipItemStackDao()
	{
		super(CharacterShipItemStack.class);
	}

}
