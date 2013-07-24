package com.space.umad.dao.jpa.game.weapon;

import com.space.umad.dao.game.weapon.AmmoTypeDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.weapon.AmmoType;

public class JpaAmmoTypeDao extends AbstractJpaDao<AmmoType> implements AmmoTypeDao
{

	public JpaAmmoTypeDao() 
	{
		super(AmmoType.class);
	}

}
