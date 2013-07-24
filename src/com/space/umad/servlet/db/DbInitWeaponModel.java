package com.space.umad.servlet.db;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.weapon.WeaponModel;

public class DbInitWeaponModel 
{
	public static void init()
	{
		// 1
		{
			WeaponModel weaponmodel = new WeaponModel();
			weaponmodel.setName("weaponModelLightAutoCannonName");
			weaponmodel.setDescription("weaponModelLightAutoCannonDescription");
			weaponmodel.setPrice(500);
			weaponmodel.setStackMax(1);
			weaponmodel.setSpriteId("0-0");
			weaponmodel.setItemType(DaoFactory.getItemTypeDao().findById(24));
			weaponmodel.setItemTier(DaoFactory.getItemTierDao().findById(1));
			weaponmodel.setWeaponType(DaoFactory.getWeaponTypeDao().findById(1));
			DaoFactory.getWeaponModelDao().add(weaponmodel);
		}
		
		// 2
		{
			WeaponModel weaponmodel = new WeaponModel();
			weaponmodel.setName("weaponModelMediumAutoCannonName");
			weaponmodel.setDescription("weaponModelMediumAutoCannonDescription");
			weaponmodel.setPrice(2500);
			weaponmodel.setStackMax(1);
			weaponmodel.setSpriteId("1-0");
			weaponmodel.setItemType(DaoFactory.getItemTypeDao().findById(24));
			weaponmodel.setItemTier(DaoFactory.getItemTierDao().findById(2));
			weaponmodel.setWeaponType(DaoFactory.getWeaponTypeDao().findById(1));
			DaoFactory.getWeaponModelDao().add(weaponmodel);
		}
		
		// 3
		{
			WeaponModel weaponmodel = new WeaponModel();
			weaponmodel.setName("weaponModelLargeAutoCannonName");
			weaponmodel.setDescription("weaponModelLargeAutoCannonDescription");
			weaponmodel.setPrice(10000);
			weaponmodel.setStackMax(1);
			weaponmodel.setSpriteId("2-0");
			weaponmodel.setItemType(DaoFactory.getItemTypeDao().findById(24));
			weaponmodel.setItemTier(DaoFactory.getItemTierDao().findById(3));
			weaponmodel.setWeaponType(DaoFactory.getWeaponTypeDao().findById(1));
			DaoFactory.getWeaponModelDao().add(weaponmodel);
		}
		
		// 4
		{
			WeaponModel weaponmodel = new WeaponModel();
			weaponmodel.setName("weaponModelLightLaserName");
			weaponmodel.setDescription("weaponModelLightLaserDescription");
			weaponmodel.setPrice(5000);
			weaponmodel.setStackMax(1);
			weaponmodel.setSpriteId("3-0");
			weaponmodel.setItemType(DaoFactory.getItemTypeDao().findById(25));
			weaponmodel.setItemTier(DaoFactory.getItemTierDao().findById(2));
			weaponmodel.setWeaponType(DaoFactory.getWeaponTypeDao().findById(2));
			DaoFactory.getWeaponModelDao().add(weaponmodel);
		}
		
		// 5
		{
			WeaponModel weaponmodel = new WeaponModel();
			weaponmodel.setName("weaponModelMediumLaserName");
			weaponmodel.setDescription("weaponModelMediumLaserDescription");
			weaponmodel.setPrice(5000);
			weaponmodel.setStackMax(1);
			weaponmodel.setSpriteId("8-0");
			weaponmodel.setItemType(DaoFactory.getItemTypeDao().findById(25));
			weaponmodel.setItemTier(DaoFactory.getItemTierDao().findById(2));
			weaponmodel.setWeaponType(DaoFactory.getWeaponTypeDao().findById(2));
			DaoFactory.getWeaponModelDao().add(weaponmodel);
		}
		
		// 6
		{
			WeaponModel weaponmodel = new WeaponModel();
			weaponmodel.setName("weaponModelLightLauncherName");
			weaponmodel.setDescription("weaponModelLightLauncherDescription");
			weaponmodel.setPrice(5000);
			weaponmodel.setStackMax(1);
			weaponmodel.setSpriteId("10-0");
			weaponmodel.setItemType(DaoFactory.getItemTypeDao().findById(26));
			weaponmodel.setItemTier(DaoFactory.getItemTierDao().findById(2));
			weaponmodel.setWeaponType(DaoFactory.getWeaponTypeDao().findById(3));
			DaoFactory.getWeaponModelDao().add(weaponmodel);
		}
		
		// 7
		{
			WeaponModel weaponmodel = new WeaponModel();
			weaponmodel.setName("weaponModelMediumLauncherLauncherName");
			weaponmodel.setDescription("weaponModelMediumLauncherDescription");
			weaponmodel.setPrice(5000);
			weaponmodel.setStackMax(1);
			weaponmodel.setSpriteId("11-0");
			weaponmodel.setItemType(DaoFactory.getItemTypeDao().findById(26));
			weaponmodel.setItemTier(DaoFactory.getItemTierDao().findById(2));
			weaponmodel.setWeaponType(DaoFactory.getWeaponTypeDao().findById(3));
			DaoFactory.getWeaponModelDao().add(weaponmodel);
		}
	}
}
