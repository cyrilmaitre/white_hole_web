package com.space.umad.dao.jpa.game.weapon;

import com.space.umad.dao.game.weapon.WeaponDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.weapon.Weapon;

public class JpaWeaponDao extends AbstractJpaDao<Weapon> implements WeaponDao 
{

	public JpaWeaponDao() 
	{
		super(Weapon.class);
	}

}
