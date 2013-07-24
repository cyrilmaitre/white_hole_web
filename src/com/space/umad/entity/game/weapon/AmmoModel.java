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
	private final static String JSON_VELOCITY = "velocity";
	private final static String JSON_QUICKENING = "quickening";
	private final static String JSON_PROJECTILECOLOR = "projectileColor";
	private final static String JSON_PROJECTILESIZE = "projectileSize";
	private final static String JSON_IMPACTSIZE = "impactSize";
	private final static String JSON_IDAMMOTYPE = "idAmmoType";
	private final static String JSON_IDWEAPONTYPE = "idWeaponType";
	
	private final static String CONFIG_LIFETIME = "lifeTime";
	private final static String CONFIG_DAMAGE = "damage";
	private final static String CONFIG_SPLASHRADIUS = "splashradius";
	private final static String CONFIG_VELOCITY = "velocity";
	private final static String CONFIG_QUICKENING = "quickening";
	private final static String CONFIG_PROJECTILECOLOR = "projectile_color";
	private final static String CONFIG_PROJECTILESIZE = "projectile_size";
	private final static String CONFIG_IMPACTSIZE = "impact_size";
	private final static String CONFIG_AMMOTYPE = "ammotype";
	private final static String CONFIG_WEAPONTYPE = "weapontype";
	
	
	// Attributs
	private long mLifeTime;
	private double mDamage;
	private double mSplashRadius;
	private float mVelocity;
	private float mQuickening;
	private String mProjectileColor;
	private int mProjectileSize;
	private int mImpactSize;
	
	
	@ManyToOne
    @JoinColumn(name="mIdAmmoType")
    private AmmoType mAmmoType;
	
	@ManyToOne
    @JoinColumn(name="mIdWeaponType")
    private WeaponType mWeaponType;

	
	// Constructor
	public AmmoModel()
	{
		this.mLifeTime = -1;
		this.mDamage = -1;
		this.mSplashRadius = -1;
		this.mVelocity = -1;
		this.mQuickening = -1;
		this.mProjectileColor = null;
		this.mProjectileSize = -1;
		this.mImpactSize = -1;
		this.mAmmoType = null;
		this.mWeaponType = null;
	}
	
	public AmmoModel(JSONObject json)
	{
		super(json);
		this.setLifeTime(json.optLong(JSON_LIFETIME, -1));
		this.setDamage(json.optDouble(JSON_DAMAGE, -1));
		this.setSplashRadius(json.optDouble(JSON_SPLASHRADIUS, -1));
		this.setVelocity((float) json.optDouble(JSON_VELOCITY, -1));
		this.setQuickening((float) json.optDouble(JSON_QUICKENING, -1));
		this.setProjectileColor(json.optString(JSON_PROJECTILECOLOR, null));
		this.setProjectileSize(json.optInt(JSON_PROJECTILESIZE, -1));
		this.setImpactSize(json.optInt(JSON_IMPACTSIZE, -1));
		this.setAmmoType(DaoFactory.getAmmoTypeDao().findById(json.optInt(JSON_IDAMMOTYPE, -1)));
		this.setWeaponType(DaoFactory.getWeaponTypeDao().findById(json.optInt(JSON_IDWEAPONTYPE, -1)));
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

	public String getProjectileColor()
	{
		return mProjectileColor;
	}

	public void setProjectileColor(String mProjectileColor)
	{
		this.mProjectileColor = mProjectileColor;
	}

	public int getProjectileSize()
	{
		return mProjectileSize;
	}

	public void setProjectileSize(int mProjectileSize)
	{
		this.mProjectileSize = mProjectileSize;
	}

	public int getImpactSize()
	{
		return mImpactSize;
	}

	public void setImpactSize(int mImpactSize)
	{
		this.mImpactSize = mImpactSize;
	}

	public AmmoType getAmmoType()
	{
		return mAmmoType;
	}

	public void setAmmoType(AmmoType mAmmoType)
{
		this.mAmmoType = mAmmoType;
	}

	public WeaponType getWeaponType()
	{
		return mWeaponType;
	}

	public void setWeaponType(WeaponType mWeaponType)
	{
		this.mWeaponType = mWeaponType;
	}

	
	// Methods
	public JSONObject toJson()
	{
		JSONObject json = super.toJson();
		
		try
		{
			json.put(JSON_LIFETIME, this.getLifeTime());
			json.put(JSON_DAMAGE, this.getDamage());
			json.put(JSON_SPLASHRADIUS, this.getSplashRadius());
			json.put(JSON_VELOCITY, this.getVelocity());
			json.put(JSON_QUICKENING, this.getQuickening());
			json.put(JSON_PROJECTILECOLOR, this.getProjectileColor());
			json.put(JSON_PROJECTILESIZE, this.getProjectileSize());
			json.put(JSON_IMPACTSIZE, this.getImpactSize());
			json.put(JSON_IDAMMOTYPE, this.getAmmoType() != null ? this.getAmmoType().getIdAmmoType() : -1);
			json.put(JSON_IDWEAPONTYPE, this.getWeaponType() != null ? this.getWeaponType().getIdWeaponType() : -1);
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
}
