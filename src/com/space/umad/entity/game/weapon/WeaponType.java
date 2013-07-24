package com.space.umad.entity.game.weapon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;


@Entity
@Table(name = "spaceumad_weapontype")
public class WeaponType 
{
	// Define
	private static final String JSON_IDWEAPONTYPE = "idWeaponType";
	private static final String JSON_NAME = "name";
	private static final String JSON_DESCRIPTION = "description";
	
	private static final String CONFIG_IDWEAPONTYPE = "id";
	private static final String CONFIG_NAME = "name";
	private static final String CONFIG_DESCRIPTION = "description";
	
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdWeaponType;
	
	private String mName;
	private String mDescription;

	
	// Constructor
	public WeaponType()
	{
		this.mIdWeaponType = -1;
		this.mName = null;
		this.mDescription = null;
	}
	
	public WeaponType(JSONObject json)
	{
		this.setIdWeaponType(json.optInt(JSON_IDWEAPONTYPE, -1));
		this.setName(json.optString(JSON_NAME, ""));
		this.setDescription(json.optString(JSON_DESCRIPTION, ""));
	}

		
	// Getters - Setters
	public int getIdWeaponType()
	{
		return mIdWeaponType;
	}

	public void setIdWeaponType(int mIdWeaponType) 
	{
		this.mIdWeaponType = mIdWeaponType;
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
	
	
	// Utils
	public JSONObject toJson()
	{
		JSONObject json = new JSONObject();
		
		try
		{
			json.put(JSON_IDWEAPONTYPE, this.getIdWeaponType());
			json.put(JSON_NAME, this.getName());
			json.put(JSON_DESCRIPTION, this.getDescription());
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}	
}
