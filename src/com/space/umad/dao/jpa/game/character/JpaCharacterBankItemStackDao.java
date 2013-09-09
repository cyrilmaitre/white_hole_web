package com.space.umad.dao.jpa.game.character;

import com.space.umad.dao.game.character.CharacterBankItemStackDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.character.CharacterBankItemStack;

public class JpaCharacterBankItemStackDao extends AbstractJpaDao<CharacterBankItemStack> implements CharacterBankItemStackDao 
{
	public JpaCharacterBankItemStackDao()
	{
		super(CharacterBankItemStack.class);
	}
}
