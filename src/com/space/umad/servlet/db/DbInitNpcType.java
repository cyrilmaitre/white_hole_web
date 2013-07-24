package com.space.umad.servlet.db;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.npc.NpcType;

public class DbInitNpcType 
{
	public static void init()
	{
		// 1
		{
			NpcType npctype = new NpcType();
			npctype.setName("Friendly");
			npctype.setColor("#00FF00");
			npctype.setAggressive(false);
			DaoFactory.getNpcTypeDao().add(npctype);
		}
		
		// 2
		{
			NpcType npctype = new NpcType();
			npctype.setName("Neutral");
			npctype.setColor("#909090");
			npctype.setAggressive(false);
			DaoFactory.getNpcTypeDao().add(npctype);
		}
		
		// 3
		{
			NpcType npctype = new NpcType();
			npctype.setName("Wicked");
			npctype.setColor("#FF0000");
			npctype.setAggressive(true);
			DaoFactory.getNpcTypeDao().add(npctype);
		}
	}
}
