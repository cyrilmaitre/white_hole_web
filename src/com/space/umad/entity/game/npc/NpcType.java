package com.space.umad.entity.game.npc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;


@Entity
@Table(name = "spaceumad_npctype")
public class NpcType
{
	// Define
	public static final String JSON_IDNPCTYPE = "idNpcType";
	public static final String JSON_NAME = "name";
	public static final String JSON_COLOR = "color";
	public static final String JSON_AGGRESSIVE = "aggressive";
	
	public static final String CONFIG_IDNPCTYPE = "id";
	public static final String CONFIG_NAME = "name";
	public static final String CONFIG_COLOR = "color";
	public static final String CONFIG_AGGRESSIVE = "aggressive";
	
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdNpcType;
	
	private String mName;
	private String mColor;
	private boolean mAggressive;
	
	
	// Constructor
	public NpcType()
	{
		this.mIdNpcType = -1;
		this.mName = "";
		this.mColor = null;
		this.mAggressive = true;
	}
	
	public NpcType(JSONObject json)
	{
		this.setIdNpcType(json.optInt(JSON_IDNPCTYPE, -1));
		this.setName(json.optString(JSON_NAME, ""));
		this.setColor(json.optString(JSON_COLOR, null));
		this.setAggressive(json.optBoolean(JSON_AGGRESSIVE, true));
	}
	
	
	// Getters - Setters
	public int getIdNpcType()
	{
		return mIdNpcType;
	}

	public void setIdNpcType(int mIdNpcType) 
	{
		this.mIdNpcType = mIdNpcType;
	}

	public String getName()
	{
		return mName;
	}

	public void setName(String mName)
	{
		this.mName = mName;
	}

	public String getColor()
	{
		return mColor;
	}

	public void setColor(String mColor)
	{
		this.mColor = mColor;
	}

	public boolean isAggressive() 
	{
		return mAggressive;
	}

	public void setAggressive(boolean mAggressive) 
	{
		this.mAggressive = mAggressive;
	}
	
	
	// Methods
	public JSONObject toJson()
	{
		JSONObject json = new JSONObject();
		
		try
		{
			json.put(JSON_IDNPCTYPE, this.getIdNpcType());
			json.put(JSON_NAME, this.getName());
			json.put(JSON_COLOR, this.getColor());
			json.put(JSON_AGGRESSIVE, this.isAggressive());
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
}
