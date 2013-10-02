package com.space.umad.entity.game.weapon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.ship.CharacterShip;

@Entity
@Table(name = "spaceumad_weapon")
public class Weapon implements Comparable<Weapon>
{
	// Define
	private static final String JSON_IDWEAPON = "idWeapon";
	private static final String JSON_IDAMMO = "idAmmo";
	private static final String JSON_AMMOCOUNT = "ammoCount";
	private static final String JSON_ACTIF = "actif";
	private static final String JSON_IDCHARACTERSHIP = "idCharacterShip";
	private static final String JSON_IDWEAPONMODEL = "idWeaponModel";
	
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdWeapon;
	
	private int mAmmoCount;
	private boolean mActif;
	
	@ManyToOne
    @JoinColumn(name="mIdCharacterShip")
	private CharacterShip mCharacterShip;
	
	@ManyToOne
    @JoinColumn(name="mIdWeaponModel")
	private WeaponModel mWeaponModel;
	
	@ManyToOne
    @JoinColumn(name="mIdAmmo")
	private AmmoModel mAmmo;
	
	
	// Constructor
	public Weapon()
	{
		this.mIdWeapon = -1;
		this.mAmmo = null;
		this.mAmmoCount = 0;
		this.mActif = true;
		this.mCharacterShip = null;
		this.mWeaponModel = null;
	}
	
	public Weapon(JSONObject json)
	{
		if(json == null)
			return;
		
		this.setIdWeapon(json.optInt(JSON_IDWEAPON, -1));
		this.setAmmoCount(json.optInt(JSON_AMMOCOUNT, 0));
		this.setActif(json.optBoolean(JSON_ACTIF, true));
		this.setCharacterShip(DaoFactory.getCharacterShipDao().findById(json.optInt(JSON_IDCHARACTERSHIP, -1)));
		this.setWeaponModel(DaoFactory.getWeaponModelDao().findById(json.optInt(JSON_IDWEAPONMODEL, -1)));
		this.setAmmo(DaoFactory.getAmmoModelDao().findById(json.optInt(JSON_IDAMMO, -1)));
	}
	
	
	// Getters - Setters
	public int getIdWeapon() 
	{
		return mIdWeapon;
	}

	public void setIdWeapon(int mIdWeapon)
	{
		this.mIdWeapon = mIdWeapon;
	}

	public int getAmmoCount()
	{
		return mAmmoCount;
	}

	public void setAmmoCount(int mAmmo)
	{
		this.mAmmoCount = mAmmo;
	}

	public boolean isActif() 
	{
		return mActif;
	}

	public void setActif(boolean mActif)
	{
		this.mActif = mActif;
	}

	public CharacterShip getCharacterShip() 
	{
		return mCharacterShip;
	}

	public void setCharacterShip(CharacterShip mCharacterShip) 
	{
		this.mCharacterShip = mCharacterShip;
	}

	public WeaponModel getWeaponModel() 
	{
		return mWeaponModel;
	}

	public void setWeaponModel(WeaponModel mWeaponModel) 
	{
		this.mWeaponModel = mWeaponModel;
	}
	
	public AmmoModel getAmmo() 
	{
		return mAmmo;
	}

	public void setAmmo(AmmoModel mAmmo)
	{
		this.mAmmo = mAmmo;
	}

	
	// Utils
	public JSONObject toJson()
	{
		JSONObject json = new JSONObject();
		
		try
		{
			json.put(JSON_IDWEAPON, this.getIdWeapon());
			json.put(JSON_AMMOCOUNT, this.getAmmoCount());
			json.put(JSON_ACTIF, this.isActif());
			json.put(JSON_IDCHARACTERSHIP, this.getCharacterShip() != null ? this.getCharacterShip().getIdCharacterShip() : -1);
			json.put(JSON_IDWEAPONMODEL, this.getWeaponModel() != null ? this.getWeaponModel().getIdItem() : -1);
			json.put(JSON_IDAMMO, this.getAmmo() != null ? this.getAmmo().getIdItem() : -1);
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}

	@Override
	public int compareTo(Weapon o) 
	{
		return new Integer(this.mIdWeapon).compareTo(o.getIdWeapon());
	}
}
