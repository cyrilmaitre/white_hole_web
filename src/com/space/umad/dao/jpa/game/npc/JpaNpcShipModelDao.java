package com.space.umad.dao.jpa.game.npc;

import com.space.umad.dao.game.npc.NpcShipModelDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.npc.NpcShipModel;

public class JpaNpcShipModelDao extends AbstractJpaDao<NpcShipModel> implements NpcShipModelDao
{

	public JpaNpcShipModelDao()
	{
		super(NpcShipModel.class);
	}

}
