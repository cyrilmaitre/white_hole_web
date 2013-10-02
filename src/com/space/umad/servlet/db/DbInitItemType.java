package com.space.umad.servlet.db;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.ItemType;

public class DbInitItemType 
{
	public static void init()
	{
		// 1
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeElementName");
			itemtype.setDescription("itemTypeElementDescription");
			itemtype.setParent(null);
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 2
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeGemName");
			itemtype.setDescription("itemTypeGemDescription");
			itemtype.setParent(null);
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 3
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeOreName");
			itemtype.setDescription("itemTypeOreDescription");
			itemtype.setParent(null);
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 4
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeCalciteName");
			itemtype.setDescription("itemTypeCalciteDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(3));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 5
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeCopperName");
			itemtype.setDescription("itemTypeCopperDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(3));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 6
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeFeldsparName");
			itemtype.setDescription("itemTypeFeldsparDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(3));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 7
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeIronName");
			itemtype.setDescription("itemTypeIronDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(3));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 8
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeMetalName");
			itemtype.setDescription("itemTypeMetalDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(3));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 9
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeOreOtherName");
			itemtype.setDescription("itemTypeOreOtherDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(3));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 10
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeSilicateName");
			itemtype.setDescription("itemTypeSilicateName");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(3));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 11
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeShipName");
			itemtype.setDescription("itemTypeShipDescription");
			itemtype.setParent(null);
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 12
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeShipStuffName");
			itemtype.setDescription("itemTypeShipStuffDescription");
			itemtype.setParent(null);
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 13
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeAsteroidScannerName");
			itemtype.setDescription("itemTypeAsteroidScannerDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(12));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 14
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeDistrubtorName");
			itemtype.setDescription("itemTypeDistrubtorDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(12));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 15
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeScannerName");
			itemtype.setDescription("itemTypeScannerDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(12));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 16
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeShipUpgradeName");
			itemtype.setDescription("itemTypeShipUpgradeDescription");
			itemtype.setParent(null);
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 17
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeArmorUpgradeName");
			itemtype.setDescription("itemTypeArmorUpgradeDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(16));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 18
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeCargoUpgradeName");
			itemtype.setDescription("itemTypeCargoUpgradeDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(16));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 19
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypePropulsionUpgradeName");
			itemtype.setDescription("itemTypePropulsionUpgradeDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(16));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 20
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeShieldUpgradeName");
			itemtype.setDescription("itemTypeShieldUpgradeDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(16));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 21
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeStructureUpgradeName");
			itemtype.setDescription("itemTypeStructureUpgradeDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(16));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 22
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeWeaponUpgradeName");
			itemtype.setDescription("itemTypeWeaponUpgradeDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(16));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 23
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeWeaponName");
			itemtype.setDescription("itemTypeWeaponDescription");
			itemtype.setParent(null);
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 24
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeWeaponKineticName");
			itemtype.setDescription("itemTypeWeaponKineticDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(23));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 25
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeWeaponLazerName");
			itemtype.setDescription("itemTypeWeaponLazerDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(23));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 26
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeWeaponLauncherName");
			itemtype.setDescription("itemTypeWeaponLauncherDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(23));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 27
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeStationName");
			itemtype.setDescription("itemTypeStationDescription");
			itemtype.setParent(null);
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 28
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeStationMineralName");
			itemtype.setDescription("itemTypeStationMineralDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(27));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 29
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeStationOrbitalName");
			itemtype.setDescription("itemTypeStationOrbitalDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(27));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 30
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeAmmoName");
			itemtype.setDescription("itemTypeAmmoDescription");
			itemtype.setParent(null);
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 31
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeAmmoKineticName");
			itemtype.setDescription("itemTypeAmmoKineticDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(30));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 32
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeAmmoLaserName");
			itemtype.setDescription("itemTypeAmmoLaserDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(30));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 33
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeAmmoMissile");
			itemtype.setDescription("itemTypeAmmoMissileDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(30));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 34
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeAmmoRoquet");
			itemtype.setDescription("itemTypeAmmoRoquetDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(30));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 35
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeShipFrigateName");
			itemtype.setDescription("itemTypeShipFrigateDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(11));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
		
		// 36
		{
			ItemType itemtype = new ItemType();
			itemtype.setName("itemTypeShipCruiserName");
			itemtype.setDescription("itemTypeShipCruiserDescription");
			itemtype.setParent(DaoFactory.getItemTypeDao().findById(11));
			DaoFactory.getItemTypeDao().add(itemtype);
		}
	}
}
