package com.space.umad.dao.jpa.game.weapon;

import com.space.umad.dao.game.weapon.WeaponModelDao;
import com.space.umad.dao.jpa.AbstractJpaDao;
import com.space.umad.entity.game.weapon.WeaponModel;

public class JpaWeaponModelDao extends AbstractJpaDao<WeaponModel> implements WeaponModelDao
{

	public JpaWeaponModelDao() 
	{
		super(WeaponModel.class);
	}

}
