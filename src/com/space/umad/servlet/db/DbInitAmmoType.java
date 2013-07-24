package com.space.umad.servlet.db;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.weapon.AmmoType;

public class DbInitAmmoType
{
	public static void init()
	{
		// 1
		{
			AmmoType ammotype = new AmmoType();
			ammotype.setName("ammoTypeNormalName");
			ammotype.setDescription("ammoTypeNormalDescription");
			ammotype.setColor("#7A5844");
			ammotype.setDamageBonus("0;0;0");
			ammotype.setDamageMalus("0;0;0");
			DaoFactory.getAmmoTypeDao().add(ammotype);
		}
		
		// 2
		{
			AmmoType ammotype = new AmmoType();
			ammotype.setName("ammoTypeAntiShieldName");
			ammotype.setDescription("ammoTypeAntiShieldDescription");
			ammotype.setColor("#68A2FF");
			ammotype.setDamageBonus("10;0;0");
			ammotype.setDamageMalus("0;5;5");
			DaoFactory.getAmmoTypeDao().add(ammotype);
		}
		
		// 3
		{
			AmmoType ammotype = new AmmoType();
			ammotype.setName("ammoTypeAntiArmorName");
			ammotype.setDescription("ammoTypeAntiArmorDescription");
			ammotype.setColor("#7BCC53");
			ammotype.setDamageBonus("0;10;0");
			ammotype.setDamageMalus("5;0;5");
			DaoFactory.getAmmoTypeDao().add(ammotype);
		}
		
		// 4
		{
			AmmoType ammotype = new AmmoType();
			ammotype.setName("ammoTypeAntiStructureName");
			ammotype.setDescription("ammoTypeAntiStructureDescription");
			ammotype.setColor("#FF8C3F");
			ammotype.setDamageBonus("0;0;10");
			ammotype.setDamageMalus("5;5;0");
			DaoFactory.getAmmoTypeDao().add(ammotype);
		}
	}
}
