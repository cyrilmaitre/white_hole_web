package com.space.umad.servlet.db;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.weapon.AmmoModel;

public class DbInitAmmoModel 
{
	public static void init()
	{
		// 2000
		{
			AmmoModel ammomodel = new AmmoModel();
			ammomodel.setName("ammo200mmName");
			ammomodel.setDescription("ammo200mmDescription");
			ammomodel.setPrice(10);
			ammomodel.setStackMax(128);
			ammomodel.setSpriteId("0-1");
			ammomodel.setItemType(DaoFactory.getItemTypeDao().findById(31));
			ammomodel.setItemTier(DaoFactory.getItemTierDao().findById(1));
			ammomodel.setLifeTime(-1);
			ammomodel.setDamage(20);
			ammomodel.setSplashRadius(5);
			ammomodel.setAmmoType(DaoFactory.getAmmoTypeDao().findById(1));
			ammomodel.setWeaponType(DaoFactory.getWeaponTypeDao().findById(1));
			ammomodel.setVelocity(-1);
			ammomodel.setQuickening(-1);
			ammomodel.setProjectileColor("#FF0000");
			ammomodel.setProjectileSize(0);
			ammomodel.setImpactSize(0);
			DaoFactory.getAmmoModelDao().add(ammomodel);
		}
		
		// 2001
		{
			AmmoModel ammomodel = new AmmoModel();
			ammomodel.setName("ammo200mmAntiShieldName");
			ammomodel.setDescription("ammo200mmAntiShieldDescription");
			ammomodel.setPrice(15);
			ammomodel.setStackMax(128);
			ammomodel.setSpriteId("1-1");
			ammomodel.setItemType(DaoFactory.getItemTypeDao().findById(31));
			ammomodel.setItemTier(DaoFactory.getItemTierDao().findById(1));
			ammomodel.setLifeTime(-1);
			ammomodel.setDamage(20);
			ammomodel.setSplashRadius(0);
			ammomodel.setAmmoType(DaoFactory.getAmmoTypeDao().findById(2));
			ammomodel.setWeaponType(DaoFactory.getWeaponTypeDao().findById(1));
			ammomodel.setVelocity(-1);
			ammomodel.setQuickening(-1);
			ammomodel.setProjectileColor("#00FF00");
			ammomodel.setProjectileSize(0);
			ammomodel.setImpactSize(1);
			DaoFactory.getAmmoModelDao().add(ammomodel);
		}
		
		// 2002
		{
			AmmoModel ammomodel = new AmmoModel();
			ammomodel.setName("ammoLaserSmallName");
			ammomodel.setDescription("ammoLaserSmallDescription");
			ammomodel.setPrice(20);
			ammomodel.setStackMax(128);
			ammomodel.setSpriteId("8-2");
			ammomodel.setItemType(DaoFactory.getItemTypeDao().findById(32));
			ammomodel.setItemTier(DaoFactory.getItemTierDao().findById(1));
			ammomodel.setLifeTime(2);
			ammomodel.setDamage(10);
			ammomodel.setSplashRadius(0);
			ammomodel.setAmmoType(DaoFactory.getAmmoTypeDao().findById(1));
			ammomodel.setWeaponType(DaoFactory.getWeaponTypeDao().findById(2));
			ammomodel.setVelocity(1250);
			ammomodel.setQuickening(99999);
			ammomodel.setProjectileColor("#009600");
			ammomodel.setProjectileSize(0);
			ammomodel.setImpactSize(0);
			DaoFactory.getAmmoModelDao().add(ammomodel);
		}
		
		// 2003
		{
			AmmoModel ammomodel = new AmmoModel();
			ammomodel.setName("ammoLaserLargeName");
			ammomodel.setDescription("ammoLaserLargeDescription");
			ammomodel.setPrice(30);
			ammomodel.setStackMax(128);
			ammomodel.setSpriteId("0-4");
			ammomodel.setItemType(DaoFactory.getItemTypeDao().findById(32));
			ammomodel.setItemTier(DaoFactory.getItemTierDao().findById(1));
			ammomodel.setLifeTime(2);
			ammomodel.setDamage(10);
			ammomodel.setSplashRadius(0);
			ammomodel.setAmmoType(DaoFactory.getAmmoTypeDao().findById(1));
			ammomodel.setWeaponType(DaoFactory.getWeaponTypeDao().findById(2));
			ammomodel.setVelocity(1250);
			ammomodel.setQuickening(99999);
			ammomodel.setProjectileColor("#C80000");
			ammomodel.setProjectileSize(0);
			ammomodel.setImpactSize(0);
			DaoFactory.getAmmoModelDao().add(ammomodel);
		}
		
		// 2004
		{
			AmmoModel ammomodel = new AmmoModel();
			ammomodel.setName("ammoMissileSmallName");
			ammomodel.setDescription("ammoMissileSmallDescription");
			ammomodel.setPrice(30);
			ammomodel.setStackMax(128);
			ammomodel.setSpriteId("8-4");
			ammomodel.setItemType(DaoFactory.getItemTypeDao().findById(33));
			ammomodel.setItemTier(DaoFactory.getItemTierDao().findById(1));
			ammomodel.setLifeTime(10);
			ammomodel.setDamage(20);
			ammomodel.setSplashRadius(10);
			ammomodel.setAmmoType(DaoFactory.getAmmoTypeDao().findById(1));
			ammomodel.setWeaponType(DaoFactory.getWeaponTypeDao().findById(3));
			ammomodel.setVelocity(800);
			ammomodel.setQuickening(300);
			ammomodel.setProjectileColor("#FFFFFF");
			ammomodel.setProjectileSize(0);
			ammomodel.setImpactSize(1);
			DaoFactory.getAmmoModelDao().add(ammomodel);
		}
		
		// 2005
		{
			AmmoModel ammomodel = new AmmoModel();
			ammomodel.setName("ammoRoquetSmallName");
			ammomodel.setDescription("ammoRoquetSmallDescription");
			ammomodel.setPrice(30);
			ammomodel.setStackMax(128);
			ammomodel.setSpriteId("0-5");
			ammomodel.setItemType(DaoFactory.getItemTypeDao().findById(34));
			ammomodel.setItemTier(DaoFactory.getItemTierDao().findById(1));
			ammomodel.setLifeTime(10);
			ammomodel.setDamage(20);
			ammomodel.setSplashRadius(10);
			ammomodel.setAmmoType(DaoFactory.getAmmoTypeDao().findById(1));
			ammomodel.setWeaponType(DaoFactory.getWeaponTypeDao().findById(3));
			ammomodel.setVelocity(1000);
			ammomodel.setQuickening(350);
			ammomodel.setProjectileColor("#FFFFFF");
			ammomodel.setProjectileSize(0);
			ammomodel.setImpactSize(1);
			DaoFactory.getAmmoModelDao().add(ammomodel);
		}
	}
}
