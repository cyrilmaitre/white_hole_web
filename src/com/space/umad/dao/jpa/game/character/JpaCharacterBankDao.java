package com.space.umad.dao.jpa.game.character;

import com.space.umad.dao.game.character.CharacterBankDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.character.CharacterBank;

public class JpaCharacterBankDao extends AbstractJpaDao<CharacterBank> implements CharacterBankDao
{

	public JpaCharacterBankDao()
	{
		super(CharacterBank.class);
	}

}
