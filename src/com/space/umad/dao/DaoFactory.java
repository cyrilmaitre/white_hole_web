package com.space.umad.dao;

import com.space.umad.dao.game.ItemDao;
import com.space.umad.dao.game.ItemStackDao;
import com.space.umad.dao.game.ItemTierDao;
import com.space.umad.dao.game.ItemTypeDao;
import com.space.umad.dao.game.character.CharacterBankDao;
import com.space.umad.dao.game.character.CharacterBankItemStackDao;
import com.space.umad.dao.game.character.CharacterDao;
import com.space.umad.dao.game.character.CharacterSkillDao;
import com.space.umad.dao.game.character.JobDao;
import com.space.umad.dao.game.character.RaceDao;
import com.space.umad.dao.game.character.SkillDao;
import com.space.umad.dao.game.npc.NpcShipModelDao;
import com.space.umad.dao.game.npc.NpcTypeDao;
import com.space.umad.dao.game.ship.CharacterShipDao;
import com.space.umad.dao.game.ship.CharacterShipItemStackDao;
import com.space.umad.dao.game.ship.ShipModelDao;
import com.space.umad.dao.game.weapon.AmmoModelDao;
import com.space.umad.dao.game.weapon.AmmoTypeDao;
import com.space.umad.dao.game.weapon.WeaponModelDao;
import com.space.umad.dao.jpa.JpaPatchNoteDao;
import com.space.umad.dao.jpa.JpaPatchNoteFeatureDao;
import com.space.umad.dao.jpa.JpaUserDao;
import com.space.umad.dao.jpa.game.JpaItemDao;
import com.space.umad.dao.jpa.game.JpaItemStackDao;
import com.space.umad.dao.jpa.game.JpaItemTierDao;
import com.space.umad.dao.jpa.game.JpaItemTypeDao;
import com.space.umad.dao.jpa.game.character.JpaCharacterBankDao;
import com.space.umad.dao.jpa.game.character.JpaCharacterBankItemStackDao;
import com.space.umad.dao.jpa.game.character.JpaCharacterDao;
import com.space.umad.dao.jpa.game.character.JpaCharacterSkillDao;
import com.space.umad.dao.jpa.game.character.JpaJobDao;
import com.space.umad.dao.jpa.game.character.JpaRaceDao;
import com.space.umad.dao.jpa.game.character.JpaSkillDao;
import com.space.umad.dao.jpa.game.npc.JpaNpcShipModelDao;
import com.space.umad.dao.jpa.game.npc.JpaNpcTypeDao;
import com.space.umad.dao.jpa.game.ship.JpaCharacterShipDao;
import com.space.umad.dao.jpa.game.ship.JpaCharacterShipItemStackDao;
import com.space.umad.dao.jpa.game.ship.JpaShipModelDao;
import com.space.umad.dao.jpa.game.weapon.JpaAmmoModelDao;
import com.space.umad.dao.jpa.game.weapon.JpaAmmoTypeDao;
import com.space.umad.dao.jpa.game.weapon.JpaWeaponModelDao;
import com.space.umad.tools.Constants;

public class DaoFactory 
{
	private DaoFactory()
	{
		
	}
	
	public static UserDao getUserDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaUserDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	public static RaceDao getRaceDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaRaceDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	public static JobDao getJobDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaJobDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	public static SkillDao getSkillDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaSkillDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	public static CharacterDao getCharacterDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaCharacterDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	public static CharacterShipDao getCharacterShipDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaCharacterShipDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	public static CharacterSkillDao getCharacterSkillDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaCharacterSkillDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	
	public static ShipModelDao getShipModelDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaShipModelDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	public static AmmoTypeDao getAmmoTypeDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaAmmoTypeDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	public static AmmoModelDao getAmmoModelDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaAmmoModelDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	public static WeaponModelDao getWeaponModelDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaWeaponModelDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	public static PatchNoteDao getPatchNoteDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaPatchNoteDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}

	public static PatchNoteFeatureDao getPatchNoteFeatureDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaPatchNoteFeatureDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	public static ItemDao getItemDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaItemDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	public static ItemTierDao getItemTierDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaItemTierDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	public static ItemTypeDao getItemTypeDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaItemTypeDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	public static NpcTypeDao getNpcTypeDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaNpcTypeDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	public static NpcShipModelDao getNpcShipModelDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaNpcShipModelDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	public static ItemStackDao getItemStackDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaItemStackDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	public static CharacterShipItemStackDao getCharacterShipItemStackDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaCharacterShipItemStackDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	public static CharacterBankDao getCharacterBankDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaCharacterBankDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
	public static CharacterBankItemStackDao getCharacterBankItemStackDao()
	{
		switch(Constants.TYPE_DAO_USED)
		{
		case TYPE_DAO_JPA:
			return new JpaCharacterBankItemStackDao();
			
		case TYPE_DAO_JDBC:
			break;
			
		case TYPE_DAO_JAXB:
			break;
		}
		return null;
	}
	
}
