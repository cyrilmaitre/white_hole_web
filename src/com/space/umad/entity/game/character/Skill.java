package com.space.umad.entity.game.character;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;


@Entity
@Table(name = "spaceumad_skill")
public class Skill implements Comparable<Skill>
{
	// Define
	private static final String JSON_IDSKILL = "idSkill";
	private static final String JSON_NAME = "name";
	private static final String JSON_DESCRIPTION = "description";
	private static final String JSON_SPRITEID = "spriteId";
	
	private static final String CONFIG_IDSKILL = "id";
	private static final String CONFIG_NAME = "name";
	private static final String CONFIG_DESCRIPTION = "description";
	private static final String CONFIG_SPRITEID = "spriteId";
	
			
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdSkill;
	
	private String mName;
	private String mDescription;
	private String mSpriteId;
		
	
	// Constructor
	public Skill()
	{
		this.mIdSkill = -1;
		this.mName = "";
		this.mDescription = "";
		this.mSpriteId = null;
	}
	
	public Skill(JSONObject json)
	{
		this.setIdSkill(json.optInt(JSON_IDSKILL, -1));
		this.setName(json.optString(JSON_NAME, ""));
		this.setDescription(json.optString(JSON_DESCRIPTION, ""));
		this.setSpriteId(json.optString(JSON_SPRITEID, null));
	}
	
	
	// Getters - Setters
	public int getIdSkill() 
	{
		return mIdSkill;
	}
	
	public void setIdSkill(int mIdSkill)
	{
		this.mIdSkill = mIdSkill;
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
	
	public String getSpriteId() 
	{
		return mSpriteId;
	}

	public void setSpriteId(String mSpriteId)
	{
		this.mSpriteId = mSpriteId;
	}
	

	// Utils
	@Override
	public int compareTo(Skill o) 
	{
		return 0;
	}

	@Override
	public boolean equals(Object o) 
	{
		if(o instanceof Skill)
		{
			if(this.getIdSkill() == ((Skill) o).getIdSkill())
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
			json.put(JSON_IDSKILL, this.getIdSkill());
			json.put(JSON_NAME, this.getName());
			json.put(JSON_DESCRIPTION, this.getDescription());
			json.put(JSON_SPRITEID, this.getSpriteId());
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
}
