package com.space.umad.entity.game.ship;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.space.umad.entity.game.Item;

@Entity
@Table(name = "spaceumad_shipmodel")
public class ShipModel extends Item
{
	// Define
	private final static String JSON_HITBOXWIDTH = "hitbox_width";
	private final static String JSON_HITBOXHEIGHT = "hitbox_height";
	private final static String JSON_SCALEMIN = "scale_min";
	private final static String JSON_SCALEMAX = "scale_max";
	private final static String JSON_SPRITE = "sprite";
	private final static String JSON_SPRITEWRECK = "sprite_wreck";
	private final static String JSON_SPRITEWRECKEMBER = "sprite_wreckember";
	private final static String JSON_SPRITEWRECKELEC = "sprite_wreckelec";
	private final static String JSON_SPRITESHIELD = "sprite_shield";
	private final static String JSON_EXPLOSIONSOUND = "explosion_sound";
	private final static String JSON_LEVELCONF = "levelconf";
	private final static String JSON_SHIELD = "shield";
	private final static String JSON_SHIELDREGEN = "shield_regen";
	private final static String JSON_SHIELDRESIST = "shield_resist";
	private final static String JSON_ARMOR = "armor";
	private final static String JSON_ARMORREGEN = "armor_regen";
	private final static String JSON_ARMORRESIST = "armor_resist";
	private final static String JSON_STRUCTURE = "structure";
	private final static String JSON_STRUCTUREREGEN = "structure_regen";
	private final static String JSON_STRUCTURERESIST = "structure_resist";
	private final static String JSON_VELOCITY = "velocity";
	private final static String JSON_QUICKENING = "quickening";
	private final static String JSON_CARGO = "cargo";
	private final static String JSON_WEAPONSLOT = "weapon_slot";
	private final static String JSON_UPGRADESLOT = "upgrade_slot";
	private final static String JSON_STUFFSLOT = "stuff_slot";
	private final static String JSON_ROTATIONVELOCITY = "rotation_velocity";
	private final static String JSON_REACTORS = "reactors";
	private final static String JSON_REATORSOUND = "reactor_sound";
	private final static String JSON_FLASHINGLIGHTS = "flashinglights";
	private final static String JSON_WEAPONS = "weapons";
	private final static String JSON_TURRETS = "turrets";
	private final static String JSON_RADARS = "radars";
	private final static String JSON_WEAPONTYPEALLOWED = "weapontype_allowed";
			
	private final static String CONFIG_HITBOXWIDTH = "hitbox_width";
	private final static String CONFIG_HITBOXHEIGHT = "hitbox_height";
	private final static String CONFIG_SCALEMIN = "scale_min";
	private final static String CONFIG_SCALEMAX = "scale_max";
	private final static String CONFIG_SPRITE = "sprite";
	private final static String CONFIG_SPRITEWRECK = "sprite_wreck";
	private final static String CONFIG_SPRITEWRECKEMBER = "sprite_wreckember";
	private final static String CONFIG_SPRITEWRECKELEC = "sprite_wreckelec";
	private final static String CONFIG_SPRITESHIELD = "sprite_shield";
	private final static String CONFIG_EXPLOSIONSOUND = "explosion_sound";
	private final static String CONFIG_LEVELCONF = "levelconf";
	private final static String CONFIG_SHIELD = "shield";
	private final static String CONFIG_SHIELDREGEN = "shield_regen";
	private final static String CONFIG_SHIELDRESIST = "shield_resist";
	private final static String CONFIG_ARMOR = "armor";
	private final static String CONFIG_ARMORREGEN = "armor_regen";
	private final static String CONFIG_ARMORRESIST = "armor_resist";
	private final static String CONFIG_STRUCTURE = "structure";
	private final static String CONFIG_STRUCTUREREGEN = "structure_regen";
	private final static String CONFIG_STRUCTURERESIST = "structure_resist";
	private final static String CONFIG_VELOCITY = "velocity";
	private final static String CONFIG_QUICKENING = "quickening";
	private final static String CONFIG_CARGO = "cargo";
	private final static String CONFIG_WEAPONSLOT = "weapon_slot";
	private final static String CONFIG_UPGRADESLOT = "upgrade_slot";
	private final static String CONFIG_STUFFSLOT = "stuff_slot";
	private final static String CONFIG_ROTATIONVELOCITY = "rotation_velocity";
	private final static String CONFIG_REACTORS = "reactors";
	private final static String CONFIG_REATORSOUND = "reactor_sound";
	private final static String CONFIG_FLASHINGLIGHTS = "flashinglights";
	private final static String CONFIG_WEAPONS = "weapons";
	private final static String CONFIG_TURRETS = "turrets";
	private final static String CONFIG_RADARS = "radars";
	private final static String CONFIG_WEAPONTYPEALLOWED = "weapontype_allowed";
	
			
	// Attributs
	int mHitboxWidth;
	int mHitboxHeight;
	float mScaleMin;
	float mScaleMax;
	String mSprite;
	String mSpriteWreck;
	String mSpriteWreckEmber;
	String mSpriteWreckElec;
	String mSpriteShield;
	String mExplosionSoud;
	String mLevelConf;
	double mShield;
	double mShieldRegen;
	double mShieldResist;
	double mArmor;
	double mArmorRegen;
	double mArmorResist;
	double mStructure;
	double mStructureRegen;
	double mStructureResist;
	float mVelocity;
	float mQuickening;
	int mCargo;
	int mWeaponSlot;
	int mUpgradeSlot;
	int mStuffSlot;
	float mRotationVelocity;
	String mReactors;
	String mReactorSound;
	String mFlashingLights;
	String mWeapons;
	String mTurrets;
	String mRadars;
	String mWeaponTypeAllowed;
		
	
	// Constructor
	public ShipModel()
	{
		this.mHitboxWidth= 1;
		this.mHitboxHeight = 1;
		this.mScaleMin = 1.0f;
		this.mScaleMax = 1.0f;
		this.mSprite = "";
		this.mSpriteWreck = "";
		this.mSpriteWreckEmber = "";
		this.mSpriteWreckElec = "";
		this.mSpriteShield = "";
		this.mExplosionSoud = "";
		this.mLevelConf = "";
		this.mShield = 0.0;
		this.mShieldRegen = 0.0;
		this.mShieldResist = 0.0;
		this.mArmor = 0.0;
		this.mArmorRegen = 0.0;
		this.mArmorResist = 0.0;
		this.mStructure = 1.0;
		this.mStructureRegen = 0.0;
		this.mStructureResist = 0.0;
		this.mVelocity = 1.0f;
		this.mQuickening = 1.0f;
		this.mCargo = 1;
		this.mWeaponSlot = 1;
		this.mUpgradeSlot = 0;
		this.mStuffSlot = 0;
		this.mRotationVelocity = 180.0f;
		this.mReactors = null;
		this.mReactorSound = null;
		this.mFlashingLights = null;
		this.mWeapons = null;
		this.mTurrets = null;
		this.mRadars = null;
		this.mWeaponTypeAllowed = "";
	}
	
	public ShipModel(JSONObject json)
	{
		super(json);
		this.setHitboxWidth(json.optInt(JSON_HITBOXWIDTH, 1));
		this.setHitboxHeight(json.optInt(JSON_HITBOXHEIGHT, 1));
		this.setScaleMin((float)json.optDouble(JSON_SCALEMIN, 1.0f));
		this.setScaleMax((float)json.optDouble(JSON_SCALEMAX, 1.0f));
		this.setSprite(json.optString(JSON_SPRITE, ""));
		this.setSpriteWreck(json.optString(JSON_SPRITEWRECK, ""));
		this.setSpriteWreckEmber(json.optString(JSON_SPRITEWRECKEMBER, ""));
		this.setSpriteWreckElec(json.optString(JSON_SPRITEWRECKELEC, ""));
		this.setSpriteShield(json.optString(JSON_SPRITESHIELD, ""));
		this.setExplosionSoud(json.optString(JSON_EXPLOSIONSOUND, ""));
		this.setLevelConf(json.optString(JSON_LEVELCONF, ""));
		
		this.setShield(json.optDouble(JSON_SHIELD, 0.0));
		this.setShieldRegen(json.optDouble(JSON_SHIELDREGEN, 0.0));
		this.setShieldResist(json.optDouble(JSON_SHIELDRESIST, 0.0));
		this.setArmor(json.optDouble(JSON_ARMOR, 0.0));
		this.setArmorRegen(json.optDouble(JSON_ARMORREGEN, 0.0));
		this.setArmorResist(json.optDouble(JSON_ARMORRESIST, 0.0));
		this.setStructure(json.optDouble(JSON_STRUCTURE, 0.0));
		this.setStructureRegen(json.optDouble(JSON_STRUCTUREREGEN, 0.0));
		this.setStructureResist(json.optDouble(JSON_STRUCTURERESIST, 0.0));
		
		this.setVelocity((float)json.optDouble(JSON_VELOCITY, 1.0f));
		this.setQuickening((float)json.optDouble(JSON_QUICKENING, 1.0f));
		this.setCargo(json.optInt(JSON_CARGO, 1));
		this.setWeaponSlot(json.optInt(JSON_WEAPONSLOT, 1));
		this.setUpgradeSlot(json.optInt(JSON_UPGRADESLOT, 0));
		this.setStuffSlot(json.optInt(JSON_STUFFSLOT, 0));
		
		this.setRotationVelocity((float)json.optDouble(JSON_ROTATIONVELOCITY, 180.0f));
		this.setReactors(json.optString(JSON_REACTORS, null));
		this.setReactorSound(json.optString(JSON_REATORSOUND, null));
		this.setFlashingLights(json.optString(JSON_FLASHINGLIGHTS, null));
		this.setWeapons(json.optString(JSON_WEAPONS, null));
		this.setTurrets(json.optString(JSON_TURRETS, null));
		this.setRadars(json.optString(JSON_RADARS, null));
		this.setWeaponTypeAllowed(json.optString(JSON_WEAPONTYPEALLOWED, ""));
	}

	
	// Getters - Setters
	public int getHitboxWidth() 
	{
		return mHitboxWidth;
	}

	public void setHitboxWidth(int mHitboxWidth) 
	{
		this.mHitboxWidth = mHitboxWidth;
	}

	public int getHitboxHeight() 
	{
		return mHitboxHeight;
	}

	public void setHitboxHeight(int mHitboxHeight) 
	{
		this.mHitboxHeight = mHitboxHeight;
	}

	public float getScaleMin() 
	{
		return mScaleMin;
	}

	public void setScaleMin(float mScaleMin) 
	{
		this.mScaleMin = mScaleMin;
	}

	public float getScaleMax() 
	{
		return mScaleMax;
	}

	public void setScaleMax(float mScaleMax) 
	{
		this.mScaleMax = mScaleMax;
	}

	public String getSprite() 
	{
		return mSprite;
	}

	public void setSprite(String mSprite) 
	{
		this.mSprite = mSprite;
	}

	public String getSpriteWreck() 
	{
		return mSpriteWreck;
	}

	public void setSpriteWreck(String mSpriteWreck) 
	{
		this.mSpriteWreck = mSpriteWreck;
	}

	public String getSpriteWreckEmber() 
	{
		return mSpriteWreckEmber;
	}

	public void setSpriteWreckEmber(String mSpriteWreckEmber) 
	{
		this.mSpriteWreckEmber = mSpriteWreckEmber;
	}

	public String getSpriteWreckElec() 
	{
		return mSpriteWreckElec;
	}

	public void setSpriteWreckElec(String mSpriteWreckElec) 
	{
		this.mSpriteWreckElec = mSpriteWreckElec;
	}

	public String getSpriteShield() 
	{
		return mSpriteShield;
	}

	public void setSpriteShield(String mSpriteShield) 
	{
		this.mSpriteShield = mSpriteShield;
	}

	public String getExplosionSoud() 
	{
		return mExplosionSoud;
	}

	public void setExplosionSoud(String mExplosionSoud) 
	{
		this.mExplosionSoud = mExplosionSoud;
	}

	public String getLevelConf() 
	{
		return mLevelConf;
	}

	public void setLevelConf(String mLevelConf) 
	{
		this.mLevelConf = mLevelConf;
	}

	public double getShield() 
	{
		return mShield;
	}

	public void setShield(double mShield) 
	{
		this.mShield = mShield;
	}

	public double getShieldRegen() 
	{
		return mShieldRegen;
	}

	public void setShieldRegen(double mShieldRegen) 
	{
		this.mShieldRegen = mShieldRegen;
	}

	public double getShieldResist() 
	{
		return mShieldResist;
	}

	public void setShieldResist(double mShieldResist) 
	{
		this.mShieldResist = mShieldResist;
	}

	public double getArmor() 
	{
		return mArmor;
	}

	public void setArmor(double mArmor) 
	{
		this.mArmor = mArmor;
	}

	public double getArmorRegen() 
	{
		return mArmorRegen;
	}

	public void setArmorRegen(double mArmorRegen) 
	{
		this.mArmorRegen = mArmorRegen;
	}

	public double getArmorResist() 
	{
		return mArmorResist;
	}

	public void setArmorResist(double mArmorResist) 
	{
		this.mArmorResist = mArmorResist;
	}

	public double getStructure() 
	{
		return mStructure;
	}

	public void setStructure(double mStructure) 
	{
		this.mStructure = mStructure;
	}

	public double getStructureRegen() 
	{
		return mStructureRegen;
	}

	public void setStructureRegen(double mStructureRegen) 
	{
		this.mStructureRegen = mStructureRegen;
	}

	public double getStructureResist() 
	{
		return mStructureResist;
	}

	public void setStructureResist(double mStructureResist) 
	{
		this.mStructureResist = mStructureResist;
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

	public int getCargo() 
	{
		return mCargo;
	}

	public void setCargo(int mCargo) 
	{
		this.mCargo = mCargo;
	}

	public int getWeaponSlot() 
	{
		return mWeaponSlot;
	}

	public void setWeaponSlot(int mWeaponSlot) 
	{
		this.mWeaponSlot = mWeaponSlot;
	}

	public int getUpgradeSlot() 
	{
		return mUpgradeSlot;
	}

	public void setUpgradeSlot(int mUpgradeSlot) 
	{
		this.mUpgradeSlot = mUpgradeSlot;
	}

	public int getStuffSlot() 
	{
		return mStuffSlot;
	}

	public void setStuffSlot(int mStuffSlot)
	{
		this.mStuffSlot = mStuffSlot;
	}

	public float getRotationVelocity() 
	{
		return mRotationVelocity;
	}

	public void setRotationVelocity(float mRotationVelocity) 
	{
		this.mRotationVelocity = mRotationVelocity;
	}

	public String getReactors() 
	{
		return mReactors;
	}

	public void setReactors(String mReactors) 
	{
		this.mReactors = mReactors;
	}

	public String getReactorSound() 
	{
		return mReactorSound;
	}

	public void setReactorSound(String mReactorSound) 
	{
		this.mReactorSound = mReactorSound;
	}

	public String getFlashingLights() 
	{
		return mFlashingLights;
	}

	public void setFlashingLights(String mFlashingLights) 
	{
		this.mFlashingLights = mFlashingLights;
	}

	public String getWeapons() 
	{
		return mWeapons;
	}

	public void setWeapons(String mWeapons) 
	{
		this.mWeapons = mWeapons;
	}

	public String getTurrets() 
	{
		return mTurrets;
	}

	public void setTurrets(String mTurrets) 
	{
		this.mTurrets = mTurrets;
	}

	public String getRadars() 
	{
		return mRadars;
	}

	public void setRadars(String mRadars) 
	{
		this.mRadars = mRadars;
	}

	public String getWeaponTypeAllowed() 
	{
		return mWeaponTypeAllowed;
	}

	public void setWeaponTypeAllowed(String mWeaponTypeAllowed) 
	{
		this.mWeaponTypeAllowed = mWeaponTypeAllowed;
	}


	// Methods
	public JSONObject toJsonAmmoModel()
	{
		JSONObject json = this.toJsonItem();
		
		try
		{
			json.put(JSON_HITBOXWIDTH, this.getHitboxWidth());
			json.put(JSON_HITBOXHEIGHT, this.getHitboxHeight());
			json.put(JSON_SCALEMIN, this.getScaleMin());
			json.put(JSON_SCALEMAX, this.getScaleMax());
			json.put(JSON_SPRITE, this.getSprite());
			json.put(JSON_SPRITEWRECK, this.getSpriteWreck());
			json.put(JSON_SPRITEWRECKEMBER, this.getSpriteWreckElec());
			json.put(JSON_SPRITEWRECKELEC, this.getSpriteWreckElec());
			json.put(JSON_SPRITESHIELD, this.getSpriteShield());			
			json.put(JSON_EXPLOSIONSOUND, this.getExplosionSoud());
			json.put(JSON_LEVELCONF, this.getLevelConf());
			json.put(JSON_SHIELD, this.getShield());
			json.put(JSON_SHIELDREGEN, this.getShieldRegen());
			json.put(JSON_SHIELDRESIST, this.getShieldResist());
			json.put(JSON_ARMOR, this.getArmor());
			json.put(JSON_ARMORREGEN, this.getArmorRegen());
			json.put(JSON_ARMORRESIST, this.getArmorResist());
			json.put(JSON_STRUCTURE, this.getStructure());
			json.put(JSON_STRUCTUREREGEN, this.getStructureRegen());
			json.put(JSON_STRUCTURERESIST, this.getStructureResist());
			json.put(JSON_VELOCITY, this.getVelocity());
			json.put(JSON_QUICKENING, this.getQuickening());
			json.put(JSON_CARGO, this.getCargo());
			json.put(JSON_WEAPONSLOT, this.getWeaponSlot());
			json.put(JSON_UPGRADESLOT, this.getUpgradeSlot());
			json.put(JSON_STUFFSLOT, this.getStuffSlot());
			json.put(JSON_ROTATIONVELOCITY, this.getRotationVelocity());
			json.put(JSON_REACTORS, this.getReactors());
			json.put(JSON_REATORSOUND, this.getReactorSound());
			json.put(JSON_FLASHINGLIGHTS, this.getFlashingLights());
			json.put(JSON_WEAPONS, this.getWeapons());
			json.put(JSON_TURRETS, this.getTurrets());
			json.put(JSON_RADARS, this.getRadars());
			json.put(JSON_WEAPONTYPEALLOWED, this.getWeaponTypeAllowed());
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
	
	public String toConfigShipModel()
	{
		String config = "";
		config += "# ITEM\n";
		config += CONFIG_IDITEM + " = " + this.getIdItem() + "\n";
		config += "# SHIP MODEL\n";
		config += CONFIG_HITBOXWIDTH + " = " + this.getHitboxWidth() + "\n";
		config += CONFIG_HITBOXHEIGHT + " = " + this.getHitboxHeight() + "\n";
		config += CONFIG_SCALEMIN + " = " + this.getScaleMin() + "\n";
		config += CONFIG_SCALEMAX + " = " + this.getScaleMax() + "\n";
		config += CONFIG_SPRITE + " = " + this.getSprite() + "\n";
		config += CONFIG_SPRITEWRECK + " = " + this.getSpriteWreck() + "\n";
		config += CONFIG_SPRITEWRECKEMBER + " = " + this.getSpriteWreckEmber() + "\n";
		config += CONFIG_SPRITEWRECKELEC + " = " + this.getSpriteWreckElec() + "\n";
		config += CONFIG_SPRITESHIELD + " = " + this.getSpriteShield() + "\n";
		config += CONFIG_EXPLOSIONSOUND + " = " + this.getExplosionSoud() + "\n";
		config += CONFIG_LEVELCONF + " = " + this.getLevelConf() + "\n";
		config += CONFIG_SHIELD + " = " + this.getShield() + "\n";
		config += CONFIG_SHIELDREGEN + " = " + this.getShieldRegen() + "\n";
		config += CONFIG_SHIELDRESIST + " = " + this.getShieldResist() + "\n";
		config += CONFIG_ARMOR + " = " + this.getArmor() + "\n";
		config += CONFIG_ARMORREGEN + " = " + this.getArmorRegen() + "\n";
		config += CONFIG_ARMORRESIST + " = " + this.getArmorResist() + "\n";
		config += CONFIG_STRUCTURE + " = " + this.getStructure() + "\n";
		config += CONFIG_STRUCTUREREGEN + " = " + this.getStructureRegen() + "\n";
		config += CONFIG_STRUCTURERESIST + " = " + this.getStructureResist() + "\n";
		config += CONFIG_VELOCITY + " = " + this.getVelocity() + "\n";
		config += CONFIG_QUICKENING + " = " + this.getQuickening() + "\n";
		config += CONFIG_CARGO + " = " + this.getCargo() + "\n";
		config += CONFIG_WEAPONSLOT + " = " + this.getWeaponSlot() + "\n";
		config += CONFIG_UPGRADESLOT + " = " + this.getUpgradeSlot() + "\n";
		config += CONFIG_STUFFSLOT + " = " + this.getStuffSlot() + "\n";
		config += CONFIG_ROTATIONVELOCITY + " = " + this.getRotationVelocity() + "\n";
		if(this.getReactors() != null) config += CONFIG_REACTORS + " = " + this.getReactors() + "\n";
		config += CONFIG_REATORSOUND + " = " + this.getReactorSound() + "\n";
		if(this.getFlashingLights() != null) config += CONFIG_FLASHINGLIGHTS + " = " + this.getFlashingLights() + "\n";
		if(this.getWeapons() != null) config += CONFIG_WEAPONS + " = " + this.getWeapons() + "\n";
		if(this.getTurrets() != null) config += CONFIG_TURRETS + " = " + this.getTurrets() + "\n";
		if(this.getRadars() != null) config += CONFIG_RADARS + " = " + this.getRadars() + "\n";
		config += CONFIG_WEAPONTYPEALLOWED + " = " + this.getWeaponTypeAllowed();
		
		return config;
	}
}
