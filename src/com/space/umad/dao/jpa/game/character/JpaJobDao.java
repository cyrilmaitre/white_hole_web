package com.space.umad.dao.jpa.game.character;

import com.space.umad.dao.game.character.JobDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.character.Job;

public class JpaJobDao extends AbstractJpaDao<Job> implements JobDao
{

	public JpaJobDao() 
	{
		super(Job.class);
	}

}
