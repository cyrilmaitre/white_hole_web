package com.space.umad.entity.game.weapon;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.Item;

@Entity
@Table(name = "spaceumad_ammomodel")
public class AmmoModel extends Item
{
	// Define
	private final static String JSON_LIFETIME = "lifeTime";
	private final static String JSON_DAMAGE = "damage";
	private final static String JSON_SPLASHRADIUS = "splashradius";
	private final static String JSON_IDAMMOTYPE = "idAmmoType";
	private final static String JSON_VELOCITY = "velocity";
	private final static String JSON_QUICKENING = "quickening";
	private final static String JSON_PROJECTILETYPE = "projectile_type";
	private final static String JSON_PROJECTILECOLOR = "projectile_color";
	private final static String JSON_PROJECTILESCALE = "projectile_scale";
	private final static String JSON_SOUNDFIRE = "sound_fire";
	
	private final static String CONFIG_LIFETIME = "lifeTime";
	private final static String CONFIG_DAMAGE = "damage";
	private final static String CONFIG_SPLASHRADIUS = "splashradius";
	private final static String CONFIG_AMMOTYPE = "ammotype";
	private final static String CONFIG_VELOCITY = "velocity";
	private final static String CONFIG_QUICKENING = "quickening";
	private final static String CONFIG_PROJECTILETYPE = "projectile_type";
	private final static String CONFIG_PROJECTILECOLOR = "projectile_color";
	private final static String CONFIG_PROJECTILESCALE = "projectile_scale";
	private final static String CONFIG_SOUNDFIRE = "sound_fire";
	
	
	// Attributs
	private long mLifeTime;
	private double mDamage;
	private double mSplashRadius;
	private float mVelocity;
	private float mQuickening;
	private int mProjectileType;
	private String mProjectileColor;
	private float mProjectileScale;
	private String mSoundFire;
	
	@ManyToOne
    @JoinColumn(name="mIdAmmoType")
    private AmmoType mAmmoType;

	
	// Constructor
	public AmmoModel()
	{
		this.mLifeTime = -1;
		this.mDamage = -1;
		this.mSplashRadius = -1;
		this.mVelocity = -1;
		this.mQuickening = -1;
		this.mAmmoType = null;
		this.mProjectileType = 0;
		this.mProjectileColor = "#FFFFFF";
		this.mProjectileScale = 1;
		this.mSoundFire = "";
	}
	
	public AmmoModel(JSONObject json)
	{
		super(json);
		this.setLifeTime(json.optLong(JSON_LIFETIME, -1));
		this.setDamage(json.optDouble(JSON_DAMAGE, -1));
		this.setSplashRadius(json.optDouble(JSON_SPLASHRADIUS, -1));
		this.setAmmoType(DaoFactory.getAmmoTypeDao().findById(json.optInt(JSON_IDAMMOTYPE, -1)));
		this.setVelocity((float) json.optDouble(JSON_VELOCITY, -1));
		this.setQuickening((float) json.optDouble(JSON_QUICKENING, -1));
		this.setProjectileType(json.optInt(JSON_PROJECTILETYPE, 0));
		this.setProjectileColor(json.optString(CONFIG_PROJECTILECOLOR, "#FFFFFF"));
		this.setProjectileScale((float)json.optDouble(CONFIG_PROJECTILESCALE, 1));
		this.setSoundFire(json.optString(JSON_SOUNDFIRE, ""));
	}

		
	// Getters - Setters
	public long getLifeTime() 
	{
		return mLifeTime;
	}

	public void setLifeTime(long mLifeTime)
	{
		this.mLifeTime = mLifeTime;
	}

	public double getDamage() 
	{
		return mDamage;
	}

	public void setDamage(double mDamage) 
	{
		this.mDamage = mDamage;
	}

	public double getSplashRadius() 
	{
		return mSplashRadius;
	}

	public void setSplashRadius(double mSplashRadius) 
	{
		this.mSplashRadius = mSplashRadius;
	}

	public float getVelocity() 
	{
		return mVelocity;
	}

	public void setVelocity(float mVelocity) 
	{
		this.mVelocity = mVelocity;
	}

	public float getQuickening() 
	{
		return mQuickening;
	}

	public void setQuickening(float mQuickening)
	{
		this.mQuickening = mQuickening;
	}

	public AmmoType getAmmoType()
	{
		return mAmmoType;
	}

	public void setAmmoType(AmmoType mAmmoType)
	{
		this.mAmmoType = mAmmoType;
	}
	
	public int getProjectileType() 
	{
		return mProjectileType;
	}

	public void setProjectileType(int mProjectileType)
	{
		this.mProjectileType = mProjectileType;
	}

	public String getProjectileColor()
	{
		return mProjectileColor;
	}

	public void setProjectileColor(String mProjectileColor)
	{
		this.mProjectileColor = mProjectileColor;
	}

	public float getProjectileScale() 
	{
		return mProjectileScale;
	}

	public void setProjectileScale(float mProjectileScale)
	{
		this.mProjectileScale = mProjectileScale;
	}

	public String getSoundFire() 
	{
		return mSoundFire;
	}

	public void setSoundFire(String mSoundFire) 
	{
		this.mSoundFire = mSoundFire;
	}

	
	// Methods
	public JSONObject toJsonAmmoModel()
	{
		JSONObject json = this.toJsonItem();
		
		try
		{
			json.put(JSON_LIFETIME, this.getLifeTime());
			json.put(JSON_DAMAGE, this.getDamage());
			json.put(JSON_SPLASHRADIUS, this.getSplashRadius());
			json.put(JSON_IDAMMOTYPE, this.getAmmoType() != null ? this.getAmmoType().getIdAmmoType() : -1);
			json.put(JSON_VELOCITY, this.getVelocity());
			json.put(JSON_QUICKENING, this.getQuickening());
			json.put(JSON_PROJECTILETYPE, this.getProjectileType());
			json.put(JSON_PROJECTILECOLOR, this.getProjectileColor());
			json.put(JSON_PROJECTILESCALE, this.getProjectileScale());
			json.put(JSON_SOUNDFIRE, this.getSoundFire());
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
	
	public String toConfigAmmoModel()
	{
		String config = "";
		config += "# ITEM\n";
		config += CONFIG_IDITEM + " = " + this.getIdItem() + "\n";
		config += "# AMMO\n";
		config += CONFIG_LIFETIME + " = " + this.getLifeTime() + "\n";
		config += CONFIG_DAMAGE + " = " + this.getDamage() + "\n";
		config += CONFIG_SPLASHRADIUS + " = " + this.getSplashRadius() + "\n";
		config += CONFIG_AMMOTYPE + " = " + this.getAmmoType().getIdAmmoType() + "\n";
		config += CONFIG_VELOCITY + " = " + this.getVelocity() + "\n";
		config += CONFIG_QUICKENING + " = " + this.getQuickening() + "\n";
		config += CONFIG_PROJECTILETYPE + " = " + this.getProjectileType() + "\n";
		config += CONFIG_PROJECTILECOLOR + " = " + this.getProjectileColor() + "\n";
		config += CONFIG_PROJECTILESCALE + " = " + this.getProjectileScale() + "\n";
		config += CONFIG_SOUNDFIRE + " = " + this.getSoundFire();
		return config;
	}
}
