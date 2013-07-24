package com.space.umad.dao.jpa.game.npc;

import com.space.umad.dao.game.npc.NpcTypeDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.npc.NpcType;

public class JpaNpcTypeDao extends AbstractJpaDao<NpcType> implements NpcTypeDao
{

	public JpaNpcTypeDao()
	{
		super(NpcType.class);
	}

}
