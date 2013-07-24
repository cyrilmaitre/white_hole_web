package com.space.umad.servlet.db;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.weapon.WeaponType;

public class DbInitWeaponType 
{
	public static void init()
	{
		// 1
		{
			WeaponType weapontype = new WeaponType();
			weapontype.setName("weaponTypeKineticName");
			weapontype.setDescription("weaponTypeKineticDescription");
			DaoFactory.getWeaponTypeDao().add(weapontype);
		}
		
		// 2
		{
			WeaponType weapontype = new WeaponType();
			weapontype.setName("weaponTypeLaserName");
			weapontype.setDescription("weaponTypeLaserDescription");
			DaoFactory.getWeaponTypeDao().add(weapontype);
		}
		
		// 3
		{
			WeaponType weapontype = new WeaponType();
			weapontype.setName("weaponTypeLauncherName");
			weapontype.setDescription("weaponTypeLauncherDescription");
			DaoFactory.getWeaponTypeDao().add(weapontype);
		}
	}
}
