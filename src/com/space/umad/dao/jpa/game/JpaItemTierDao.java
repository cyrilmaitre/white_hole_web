package com.space.umad.dao.jpa.game;

import com.space.umad.dao.game.ItemTierDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.ItemTier;

public class JpaItemTierDao extends AbstractJpaDao<ItemTier> implements ItemTierDao
{
	public JpaItemTierDao()
	{
		super(ItemTier.class);
	}
}
