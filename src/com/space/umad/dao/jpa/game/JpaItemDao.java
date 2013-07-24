package com.space.umad.dao.jpa.game;

import com.space.umad.dao.game.ItemDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.Item;

public class JpaItemDao extends AbstractJpaDao<Item> implements ItemDao 
{
	public JpaItemDao()
	{
		super(Item.class);
	}
}
