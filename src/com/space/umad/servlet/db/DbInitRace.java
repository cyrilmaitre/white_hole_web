package com.space.umad.servlet.db;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.character.Race;

public class DbInitRace 
{
	public static void init()
	{
		// 1
		{
			Race race = new Race();
			race.setName("raceHumanName");
			race.setDescription("raceHumanDescription");
			race.setBonus("1(10)");
			race.setSpriteId("0-0");
			race.setAvatarIndex("0-0;1-0;2-0;3-0;4-0;5-0;6-0;7-0;8-0;9-0");
			DaoFactory.getRaceDao().add(race);
		}
		
		// 2
		{
			Race race = new Race();
			race.setName("raceAndroidName");
			race.setDescription("raceAndroidDescription");
			race.setBonus("1(11);2(5)");
			race.setSpriteId("1-0");
			race.setAvatarIndex("0-1;1-1;2-1;3-1;4-1");
			DaoFactory.getRaceDao().add(race);
		}
	}
}
