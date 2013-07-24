package com.space.umad.dao.jpa.game.character;

import com.space.umad.dao.game.character.CharacterSkillDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.character.CharacterSkill;

public class JpaCharacterSkillDao extends AbstractJpaDao<CharacterSkill> implements CharacterSkillDao
{

	public JpaCharacterSkillDao() 
	{
		super(CharacterSkill.class);
	}

}
