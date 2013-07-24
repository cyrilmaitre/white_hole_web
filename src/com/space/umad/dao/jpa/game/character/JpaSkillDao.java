package com.space.umad.dao.jpa.game.character;

import com.space.umad.entity.game.character.Skill;

import com.space.umad.dao.game.character.SkillDao;
import com.space.umad.dao.jpa.AbstractJpaDao;

public class JpaSkillDao extends AbstractJpaDao<Skill> implements SkillDao
{

	public JpaSkillDao() 
	{
		super(Skill.class);
	}

}
