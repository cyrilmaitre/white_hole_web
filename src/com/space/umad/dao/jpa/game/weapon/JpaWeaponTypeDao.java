package com.space.umad.dao.jpa.game.weapon;

import com.space.umad.dao.game.weapon.WeaponTypeDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.weapon.WeaponType;

public class JpaWeaponTypeDao extends AbstractJpaDao<WeaponType> implements WeaponTypeDao
{

	public JpaWeaponTypeDao() 
	{
		super(WeaponType.class);
	}

}
