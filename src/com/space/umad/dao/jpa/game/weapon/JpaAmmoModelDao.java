package com.space.umad.dao.jpa.game.weapon;

import com.space.umad.dao.game.weapon.AmmoModelDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.weapon.AmmoModel;

public class JpaAmmoModelDao extends AbstractJpaDao<AmmoModel> implements AmmoModelDao
{

	public JpaAmmoModelDao()
	{
		super(AmmoModel.class);
	}

}
