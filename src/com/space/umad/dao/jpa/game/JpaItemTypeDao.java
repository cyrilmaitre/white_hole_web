package com.space.umad.dao.jpa.game;

import com.space.umad.dao.game.ItemTypeDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.ItemType;

public class JpaItemTypeDao extends AbstractJpaDao<ItemType> implements ItemTypeDao
{
	public JpaItemTypeDao()
	{
		super(ItemType.class);
	}
}
