package com.space.umad.entity.game.character;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;


@Entity
@Table(name = "spaceumad_job")
public class Job implements Comparable<Job> 
{
	// Define
	private static final String JSON_IDJOB = "idJob";
	private static final String JSON_NAME = "name";
	private static final String JSON_DESCRIPTION = "description";
	private static final String JSON_BONUS = "bonus";
	private static final String JSON_SPRITEID = "spriteId";
	
	private static final String CONFIG_IDJOB = "id";
	private static final String CONFIG_NAME = "name";
	private static final String CONFIG_DESCRIPTION = "description";
	private static final String CONFIG_BONUS = "bonus";
	private static final String CONFIG_SPRITEID = "spriteId";

	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdJob;
	
	private String mName;
	private String mDescription;
	private String mBonus;
	private String mSpriteId;
	
	
	// Constructor
	public Job() 
	{
		this.mIdJob = -1;
		this.mName = null;
		this.mDescription = null;
		this.mBonus = null;
		this.mSpriteId = null;
	}
	
	public Job(JSONObject json) 
	{
		this.setIdJob(json.optInt(JSON_IDJOB, -1));
		this.setName(json.optString(JSON_NAME, ""));
		this.setDescription(json.optString(JSON_DESCRIPTION, ""));
		this.setBonus(json.optString(JSON_BONUS, null));
		this.setSpriteId(json.optString(JSON_SPRITEID, null));
	}
	
	
	// Getters - Setters
	public int getIdJob() 
	{
		return mIdJob;
	}

	public void setIdJob(int mIdJob) 
	{
		this.mIdJob = mIdJob;
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

	
	// Utils
	@Override
	public int compareTo(Job o) 
	{
		return 0;
	}

	@Override
	public boolean equals(Object o) 
	{
		if(o instanceof Job)
		{
			if(this.getIdJob() == ((Job) o).getIdJob())
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
			json.put(JSON_IDJOB, this.getIdJob());
			json.put(JSON_NAME, this.getName());
			json.put(JSON_DESCRIPTION, this.getDescription());
			json.put(JSON_BONUS, this.getBonus());
			json.put(JSON_SPRITEID, this.getSpriteId());
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
}
