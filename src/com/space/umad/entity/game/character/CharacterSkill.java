package com.space.umad.entity.game.character;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.space.umad.dao.DaoFactory;

@Entity
@Table(name = "spaceumad_characterskill")
public class CharacterSkill 
{
	// Define
	private static final String JSON_IDCHARACTERSKILL = "idCharacterSkill";
	private static final String JSON_IDCHARACTER = "idCharacter";
	private static final String JSON_IDSKILL = "idSkill";
	private static final String JSON_LEVEL = "level";
	
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdCharacterSkill;
	
	private int mLevel;
	
	@ManyToOne
    @JoinColumn(name="mIdCharacter")
    private Character mCharacter;
	
	@ManyToOne
    @JoinColumn(name="mIdSkill")
    private Skill mSkill;
	
	
	// Constructor
	public CharacterSkill() 
	{
		this.mIdCharacterSkill = -1;
		this.mCharacter = null;
		this.mSkill = null;
		this.mLevel = 0;
	}
	
	public CharacterSkill(JSONObject json) 
	{
		if(json == null)
			return;
		
		this.setIdCharacterSkill(json.optInt(JSON_IDCHARACTERSKILL, -1));
		this.setCharacter(DaoFactory.getCharacterDao().findById(json.optInt(JSON_IDCHARACTER, -1)));
		this.setSkill(DaoFactory.getSkillDao().findById(json.optInt(JSON_IDSKILL, -1)));
		this.setLevel(json.optInt(JSON_LEVEL, 0));
	}
	
	
	// Getters - Setters
	public int getIdCharacterSkill() 
	{
		return mIdCharacterSkill;
	}

	public void setIdCharacterSkill(int mCharacterSkill)
	{
		this.mIdCharacterSkill = mCharacterSkill;
	}

	public Character getCharacter()
	{
		return mCharacter;
	}

	public void setCharacter(Character mCharacter)
	{
		this.mCharacter = mCharacter;
	}

	public Skill getSkill()
	{
		return mSkill;
	}

	public void setSkill(Skill mSkill) 
	{
		this.mSkill = mSkill;
	}
	
	public int getLevel()
	{
		return mLevel;
	}

	public void setLevel(int mLevel) 
	{
		this.mLevel = mLevel;
	}
	

	// Utils
	@Override
	public boolean equals(Object o) 
	{
		if(o instanceof CharacterSkill)
		{
			if(this.getIdCharacterSkill() == ((CharacterSkill) o).getIdCharacterSkill())
				return true;
			else
				return false;
		}
		return false;
	}
	
	public JSONObject toJson()
	{
		JSONObject json = new JSONObject();
		
		try
		{
			json.put(JSON_IDCHARACTERSKILL, this.getIdCharacterSkill());
			json.put(JSON_IDCHARACTER, this.getCharacter().getIdCharacter());
			json.put(JSON_IDSKILL, this.getSkill().getIdSkill());
			json.put(JSON_LEVEL, this.getLevel());
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
}
