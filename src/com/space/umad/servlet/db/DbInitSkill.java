package com.space.umad.servlet.db;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.character.Skill;

public class DbInitSkill
{
	public static void init()
	{
		// 1
		{
			Skill skill = new Skill();
			skill.setName("skillFightingName");
			skill.setDescription("skillFightingDescription");
			skill.setSpriteId("0-0");
			DaoFactory.getSkillDao().add(skill);
		}
		
		// 2
		{
			Skill skill = new Skill();
			skill.setName("skillDroneName");
			skill.setDescription("skillDroneDescription");
			skill.setSpriteId("1-0");
			DaoFactory.getSkillDao().add(skill);
		}
		
		// 3
		{
			Skill skill = new Skill();
			skill.setName("skillSteeringName");
			skill.setDescription("skillSteeringDescription");
			skill.setSpriteId("2-0");
			DaoFactory.getSkillDao().add(skill);
		}
		
		// 4
		{
			Skill skill = new Skill();
			skill.setName("skillMiningName");
			skill.setDescription("skillMiningDescription");
			skill.setSpriteId("3-0");
			DaoFactory.getSkillDao().add(skill);
		}
		
		// 5
		{
			Skill skill = new Skill();
			skill.setName("skillCraftingName");
			skill.setDescription("skillCraftingDescription");
			skill.setSpriteId("4-0");
			DaoFactory.getSkillDao().add(skill);
		}
		
		// 6
		{
			Skill skill = new Skill();
			skill.setName("skillAlchemyName");
			skill.setDescription("skillAlchemyDescription");
			skill.setSpriteId("5-0");
			DaoFactory.getSkillDao().add(skill);
		}
		
		// 7
		{
			Skill skill = new Skill();
			skill.setName("skillBargainingName");
			skill.setDescription("skillBargainingDescription");
			skill.setSpriteId("6-0");
			DaoFactory.getSkillDao().add(skill);
		}
		
		// 8
		{
			Skill skill = new Skill();
			skill.setName("skillSalvagingName");
			skill.setDescription("skillSalvagingDescription");
			skill.setSpriteId("7-0");
			DaoFactory.getSkillDao().add(skill);
		}
		
		// 9
		{
			Skill skill = new Skill();
			skill.setName("skillConstructionName");
			skill.setDescription("skillConstructionDescription");
			skill.setSpriteId("8-0");
			DaoFactory.getSkillDao().add(skill);
		}		
	}
}
