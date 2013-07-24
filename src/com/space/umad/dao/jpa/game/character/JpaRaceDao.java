package com.space.umad.dao.jpa.game.character;

import com.space.umad.dao.game.character.RaceDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.character.Race;

public class JpaRaceDao extends AbstractJpaDao<Race> implements RaceDao
{

	public JpaRaceDao()
	{
		super(Race.class);
	}

}
