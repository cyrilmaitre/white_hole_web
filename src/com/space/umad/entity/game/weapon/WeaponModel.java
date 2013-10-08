package com.space.umad.entity.game.weapon;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.space.umad.entity.game.Item;


@Entity
@Table(name = "spaceumad_weaponmodel")
public class WeaponModel extends Item
{
	// Define
	private static final String JSON_DAMAGEMULTIPLIER = "damagemultiplier";
	private static final String JSON_AMMOMAX = "ammomax";
	private static final String JSON_RANGE = "range";
	private static final String JSON_RANGEANGLE = "rangeangle";
	private static final String JSON_RELOADINGSPEED = "reloadingspeed";
	private static final String JSON_FIRERATE = "firerate";
	private static final String JSON_SOUNDRELOAD = "soundreload";
	private static final String JSON_AMMOTYPEALLOWED = "ammotype_allowed";
	
	private static final String CONFIG_DAMAGEMULTIPLIER = "damagemultiplier";
	private static final String CONFIG_AMMOMAX = "ammomax";
	private static final String CONFIG_RANGE = "range";
	private static final String CONFIG_RANGEANGLE = "rangeangle";
	private static final String CONFIG_RELOADINGSPEED = "reloadingspeed";
	private static final String CONFIG_FIRERATE = "firerate";
	private static final String CONFIG_SOUNDRELOAD = "soundreload";
	private static final String CONFIG_AMMOTYPEALLOWED = "ammotype_allowed";
	
	
	// Attributs	
	private float mDamageMultiplier;
	private int mAmmoMax;
	private double mRange;
	private double mRangeAngle;
	private float mReloadingSpeed;
	private float mFireRate;
	private String mSoundReload;
	private String mAmmoTypeAllowed;
	
	
	// Constructor
	public WeaponModel()
	{
		this.mDamageMultiplier = 0;
		this.mAmmoMax = 0;
		this.mRange = 0;
		this.mRangeAngle = 0;
		this.mReloadingSpeed = 0;
		this.mFireRate = 0;
		this.mSoundReload = "";
		this.mAmmoTypeAllowed = "";
	}
	
	public WeaponModel(JSONObject json)
	{
		super(json);
		this.setDamageMultiplier((float)json.optDouble(JSON_DAMAGEMULTIPLIER, 0));
		this.setAmmoMax(json.optInt(JSON_AMMOMAX, 0));
		this.setRange(json.optDouble(JSON_RANGE, 0));
		this.setRangeAngle(json.optDouble(JSON_RANGEANGLE, 0));
		this.setReloadingSpeed((float)json.optDouble(JSON_RELOADINGSPEED, 0));
		this.setFireRate((float)json.optDouble(JSON_FIRERATE, 0));
		this.setSoundReload(json.optString(JSON_SOUNDRELOAD, ""));
		this.setAmmoTypeAllowed(json.optString(JSON_AMMOTYPEALLOWED, ""));
	}
	
	
	// Getters - Setters
	public float getDamageMultiplier() 
	{
		return mDamageMultiplier;
	}

	public void setDamageMultiplier(float mDamageMultiplier) 
	{
		this.mDamageMultiplier = mDamageMultiplier;
	}

	public int getAmmoMax() 
	{
		return mAmmoMax;
	}

	public void setAmmoMax(int mAmmoMax) 
	{
		this.mAmmoMax = mAmmoMax;
	}

	public double getRange() 
	{
		return mRange;
	}

	public void setRange(double mRange) 
	{
		this.mRange = mRange;
	}

	public double getRangeAngle() 
	{
		return mRangeAngle;
	}

	public void setRangeAngle(double mRangeAngle) 
	{
		this.mRangeAngle = mRangeAngle;
	}

	public float getReloadingSpeed() 
	{
		return mReloadingSpeed;
	}

	public void setReloadingSpeed(float mReloadingSpeed) 
	{
		this.mReloadingSpeed = mReloadingSpeed;
	}

	public float getFireRate() 
	{
		return mFireRate;
	}

	public void setFireRate(float mFireRate) 
	{
		this.mFireRate = mFireRate;
	}

	public String getSoundReload() 
	{
		return mSoundReload;
	}

	public void setSoundReload(String mSoundReload) 
	{
		this.mSoundReload = mSoundReload;
	}

	public String getAmmoTypeAllowed() 
	{
		return mAmmoTypeAllowed;
	}

	public void setAmmoTypeAllowed(String mAmmoTypeAllowed) 
	{
		this.mAmmoTypeAllowed = mAmmoTypeAllowed;
	}
	
	
	// Methods
	public JSONObject toJsonWeapon()
	{
		JSONObject json = this.toJsonItem();
		
		try
		{
			json.put(JSON_DAMAGEMULTIPLIER, this.getDamageMultiplier());
			json.put(JSON_AMMOMAX, this.getAmmoMax());
			json.put(JSON_RANGE, this.getRange());
			json.put(JSON_RANGEANGLE, this.getRangeAngle());
			json.put(JSON_RELOADINGSPEED, this.getReloadingSpeed());
			json.put(JSON_FIRERATE, this.getFireRate());
			json.put(JSON_SOUNDRELOAD, this.getSoundReload());
			json.put(JSON_AMMOTYPEALLOWED, this.getAmmoTypeAllowed());
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
	
	public String toConfigWeapon()
	{
		String config = "";
		config += "# ITEM\n";
		config += CONFIG_IDITEM + " = " + this.getIdItem() + "\n";
		config += "# WEAPON MODEL\n";
		config += CONFIG_DAMAGEMULTIPLIER + " = " + this.getDamageMultiplier() + "\n";
		config += CONFIG_AMMOMAX + " = " + this.getAmmoMax() + "\n";
		config += CONFIG_RANGE + " = " + this.getRange() + "\n";
		config += CONFIG_RANGEANGLE + " = " + this.getRangeAngle() + "\n";
		config += CONFIG_RELOADINGSPEED + " = " + this.getReloadingSpeed() + "\n";
		config += CONFIG_FIRERATE + " = " + this.getFireRate() + "\n";
		config += CONFIG_SOUNDRELOAD + " = " + this.getSoundReload() + "\n";
		config += CONFIG_AMMOTYPEALLOWED + " = " + this.getAmmoTypeAllowed();
		return config;
	}
}
