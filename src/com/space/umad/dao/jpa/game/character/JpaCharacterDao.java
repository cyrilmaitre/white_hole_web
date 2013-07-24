package com.space.umad.dao.jpa.game.character;

import com.space.umad.dao.game.character.CharacterDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.character.Character;

public class JpaCharacterDao extends AbstractJpaDao<Character> implements CharacterDao
{

	public JpaCharacterDao()
	{
		super(Character.class);
	}

}
