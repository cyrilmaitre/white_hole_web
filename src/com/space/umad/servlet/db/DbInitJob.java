package com.space.umad.servlet.db;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.character.Job;

public class DbInitJob 
{
	public static void init()
	{
		// 1
		{
			Job job = new Job();
			job.setName("jobMercenaryName");
			job.setDescription("jobMercenaryDescription");
			job.setBonus("2(12);3(9)");
			job.setSpriteId("0-0");
			DaoFactory.getJobDao().add(job);
		}
		
		// 2
		{
			Job job = new Job();
			job.setName("jobIndustrialistName");
			job.setDescription("jobIndustrialistDescription");
			job.setBonus("2(7)");
			job.setSpriteId("1-0");
			DaoFactory.getJobDao().add(job);
		}
		
		// 3
		{
			Job job = new Job();
			job.setName("jobTraderName");
			job.setDescription("jobTraderDescription");
			job.setBonus(null);
			job.setSpriteId("2-0");
			DaoFactory.getJobDao().add(job);
		}
		
		// 4
		{
			Job job = new Job();
			job.setName("jobBuilderName");
			job.setDescription("jobBuilderDescription");
			job.setBonus("6(26);8(12)");
			job.setSpriteId("3-0");
			DaoFactory.getJobDao().add(job);
		}
	}
}
