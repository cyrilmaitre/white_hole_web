package com.space.umad.dao.jpa.game;

import com.space.umad.dao.game.ItemStackDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.ItemStack;

public class JpaItemStackDao extends AbstractJpaDao<ItemStack> implements ItemStackDao
{

	public JpaItemStackDao()
	{
		super(ItemStack.class);
	}

}
