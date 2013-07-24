package com.space.umad.servlet.db;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.ItemTier;

public class DbInitItemTier 
{
	public static void init()
	{
		// 1
		{
			ItemTier itemtier = new ItemTier();
			itemtier.setName("itemTierIName");
			itemtier.setDescription("itemTierIDescription");
			DaoFactory.getItemTierDao().add(itemtier);
		}
		
		// 2
		{
			ItemTier itemtier = new ItemTier();
			itemtier.setName("itemTierIIName");
			itemtier.setDescription("itemTierIIDescription");
			DaoFactory.getItemTierDao().add(itemtier);
		}
		
		// 3
		{
			ItemTier itemtier = new ItemTier();
			itemtier.setName("itemTierIIIName");
			itemtier.setDescription("itemTierIIIDescription");
			DaoFactory.getItemTierDao().add(itemtier);
		}
		
		// 4
		{
			ItemTier itemtier = new ItemTier();
			itemtier.setName("itemTierIVName");
			itemtier.setDescription("itemTierIVDescription");
			DaoFactory.getItemTierDao().add(itemtier);
		}
		
		// 5
		{
			ItemTier itemtier = new ItemTier();
			itemtier.setName("itemTierVName");
			itemtier.setDescription("itemTierVDescription");
			DaoFactory.getItemTierDao().add(itemtier);
		}
	}
}
