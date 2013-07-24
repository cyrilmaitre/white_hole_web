package com.space.umad.entity.game;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;


@Entity
@Table(name = "spaceumad_itemtier")
public class ItemTier 
{
	// Define
	public static final String JSON_IDITEMTIER = "idItemTier";
	public static final String JSON_NAME = "name";
	public static final String JSON_DESCRIPTION = "description";
	
	public static final String CONFIG_IDITEMTIER = "id";
	public static final String CONFIG_NAME = "name";
	public static final String CONFIG_DESCRIPTION = "description";
	
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdItemTier;
	
	private String mName;
	private String mDescription;
	
	
	// Constructor
	public ItemTier()
	{
		this.mIdItemTier = -1;
		this.mName = "";
		this.mDescription = "";
	}
	
	public ItemTier(JSONObject json)
	{
		this.setIdItemTier(json.optInt(JSON_IDITEMTIER, -1));
		this.setName(json.optString(JSON_NAME, ""));
		this.setDescription(json.optString(JSON_DESCRIPTION, ""));
	}
	
	
	// Getters - Setters
	public int getIdItemTier()
	{
		return mIdItemTier;
	}

	public void setIdItemTier(int mIdItemTier)
	{
		this.mIdItemTier = mIdItemTier;
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
	
	
	// Methods
	@Override
	public boolean equals(Object o) 
	{
		if(o instanceof ItemTier)
		{
			if(this.getIdItemTier() == ((ItemTier) o).getIdItemTier())
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public String toString() 
	{
		return this.getName();
	}
	
	public JSONObject toJson()
	{
		JSONObject json = new JSONObject();
		
		try
		{
			json.put(JSON_IDITEMTIER, this.getIdItemTier());
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
