package com.space.umad.entity.game.weapon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

@Entity
@Table(name = "spaceumad_ammotype")
public class AmmoType
{
	// Define
	private final static String JSON_IDAMMOTYPE = "idAmmoType";
	private final static String JSON_NAME = "name";
	private final static String JSON_DESCRIPTION = "description";
	private final static String JSON_COLOR = "color";
	private final static String JSON_DAMAGEBONUS = "damageBonus";
	private final static String JSON_DAMAGEMALUS = "damageMalus";
	
	private final static String CONIFG_IDAMMOTYPE = "id";
	private final static String CONIFG_NAME = "name";
	private final static String CONIFG_DESCRIPTION = "description";
	private final static String CONIFG_COLOR = "color";
	private final static String CONIFG_DAMAGEBONUS = "damagebonus";
	private final static String CONIFG_DAMAGEMALUS = "damagemalus";
	
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdAmmoType;
	
	private String mName;
	private String mDescription;
	private String mColor;
	private String mDamageBonus;
	private String mDamageMalus;

	
	// Constructor
	public AmmoType()
	{
		this.mIdAmmoType = -1;
		this.mName = null;
		this.mDescription = null;
		this.mColor = null;
		this.mDamageBonus = null;
		this.mDamageMalus = null;
	}

	public AmmoType(JSONObject json)
	{
		this.setIdAmmoType(json.optInt(JSON_IDAMMOTYPE, -1));
		this.setName(json.optString(JSON_NAME, ""));
		this.setDescription(json.optString(JSON_DESCRIPTION, ""));
		this.setColor(json.optString(JSON_COLOR, null));
		this.setDamageBonus(json.optString(JSON_DAMAGEBONUS, null));
		this.setDamageMalus(json.optString(JSON_DAMAGEMALUS, null));
	}
	
	
	// Getters - Setters
	public int getIdAmmoType() 
	{
		return mIdAmmoType;
	}

	public void setIdAmmoType(int mIdAmmoType) 
	{
		this.mIdAmmoType = mIdAmmoType;
	}

	public String getName() 
	{
		return mName;
	}

	public void setName(String mName) 
	{
		this.mName = mName;
	}

	public String getDescription() 
	{
		return mDescription;
	}

	public void setDescription(String mDescription)
	{
		this.mDescription = mDescription;
	}
	
	public String getColor() 
	{
		return mColor;
	}

	public void setColor(String mColor) 
	{
		this.mColor = mColor;
	}

	public String getDamageBonus() 
	{
		return mDamageBonus;
	}

	public void setDamageBonus(String mDamageBonus) 
	{
		this.mDamageBonus = mDamageBonus;
	}

	public String getDamageMalus() 
	{
		return mDamageMalus;
	}

	public void setDamageMalus(String mDamageMalus) 
	{
		this.mDamageMalus = mDamageMalus;
	}
	

	// Utils
	public JSONObject toJson()
	{
		JSONObject json = new JSONObject();
		
		try
		{
			json.put(JSON_IDAMMOTYPE, this.getIdAmmoType());
			json.put(JSON_NAME, this.getName());
			json.put(JSON_DESCRIPTION, this.getDescription());
			json.put(JSON_COLOR, this.getColor());
			json.put(JSON_DAMAGEBONUS, this.getDamageBonus());
			json.put(JSON_DAMAGEMALUS, this.getDamageMalus());
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
}
