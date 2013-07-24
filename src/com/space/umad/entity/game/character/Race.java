package com.space.umad.entity.game.character;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;


@Entity
@Table(name = "spaceumad_race")
public class Race implements Comparable<Race>
{
	// Define
	private static final String JSON_IDRACE = "idRace";
	private static final String JSON_NAME = "name";
	private static final String JSON_DESCRIPTION = "description";
	private static final String JSON_BONUS = "bonus";
	private static final String JSON_SPRITEID = "spriteId";
	private static final String JSON_AVATARINDEX = "avatarIndex";
	
	private static final String CONFIG_IDRACE = "id";
	private static final String CONFIG_NAME = "name";
	private static final String CONFIG_DESCRIPTION = "description";
	private static final String CONFIG_BONUS = "bonus";
	private static final String CONFIG_SPRITEID = "spriteId";
	private static final String CONFIG_AVATARINDEX = "avatarIndex";
	
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdRace;
	
	private String mName;
	private String mDescription;
	private String mBonus;
	private String mSpriteId;
	private String mAvatarIndex;
	
	
	// Constructor
	public Race() 
	{
		this.mIdRace = -1;
		this.mName = null;
		this.mDescription = null;
		this.mBonus = null;
		this.mSpriteId = null;
		this.mAvatarIndex = null;
	}
	
	public Race(JSONObject json) 
	{
		this.setIdRace(json.optInt(JSON_IDRACE, -1));
		this.setName(json.optString(JSON_NAME, ""));
		this.setDescription(json.optString(JSON_DESCRIPTION, ""));
		this.setBonus(json.optString(JSON_BONUS, null));
		this.setSpriteId(json.optString(JSON_SPRITEID, null));
		this.setAvatarIndex(json.optString(JSON_AVATARINDEX, null));
	}
	
	
	// Getters - Setters
	public int getIdRace() 
	{
		return mIdRace;
	}

	public void setIdRace(int mIdRace)
	{
		this.mIdRace = mIdRace;
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

	public String getBonus() 
	{
		return mBonus;
	}

	public void setBonus(String mBonus)
	{
		this.mBonus = mBonus;
	}

	public String getSpriteId()
	{
		return mSpriteId;
	}

	public void setSpriteId(String mSpriteId) 
	{
		this.mSpriteId = mSpriteId;
	}

	public String getAvatarIndex()
	{
		return mAvatarIndex;
	}

	public void setAvatarIndex(String mAvatarIndex)
	{
		this.mAvatarIndex = mAvatarIndex;
	}
	

	// Utils
	@Override
	public int compareTo(Race o) 
	{
		return 0;
	}

	@Override
	public boolean equals(Object o) 
	{
		if(o instanceof Race)
		{
			if(this.getIdRace() == ((Race) o).getIdRace())
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
			json.put(JSON_IDRACE, this.getIdRace());
			json.put(JSON_NAME, this.getName());
			json.put(JSON_DESCRIPTION, this.getDescription());
			json.put(JSON_BONUS, this.getBonus());
			json.put(JSON_SPRITEID, this.getSpriteId());
			json.put(JSON_AVATARINDEX, this.getAvatarIndex());
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
}
