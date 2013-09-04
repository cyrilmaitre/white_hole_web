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
@Table(name = "spaceumad_characterbank")
public class CharacterBank 
{
	// Define
	private static final String JSON_IDCHARACTERBANK = "idCharacterBank";
	private static final String JSON_IDCHARACTER = "idCharacter";
	private static final String JSON_NUMBER = "number";
	private static final String JSON_UNLOCK = "unlock";
	
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdCharacterBank;
	
	private int mNumber;
	private boolean mUnlock;
	
	@ManyToOne
    @JoinColumn(name="mIdCharacter")
    private Character mCharacter;
	
	
	// Constructor
	public CharacterBank()
	{
		this.mIdCharacterBank = -1;
		this.mNumber = -1;
		this.mUnlock = false;
		this.mCharacter = null;
	}
	
	public CharacterBank(JSONObject json)
	{
		if(json == null)
			return;
		
		this.setIdCharacterBank(json.optInt(JSON_IDCHARACTERBANK, -1));
		this.setCharacter(DaoFactory.getCharacterDao().findById(json.optInt(JSON_IDCHARACTER, -1)));
		this.setNumber(json.optInt(JSON_NUMBER, -1));
		this.setUnlock(json.optBoolean(JSON_UNLOCK, false));
	}
	
	
	// Getters - Setters
	public int getIdCharacterBank()
	{
		return mIdCharacterBank;
	}

	public void setIdCharacterBank(int mIdCharacterBank) 
	{
		this.mIdCharacterBank = mIdCharacterBank;
	}

	public int getNumber()
	{
		return mNumber;
	}

	public void setNumber(int mNumber)
	{
		this.mNumber = mNumber;
	}

	public boolean isUnlock() 
	{
		return mUnlock;
	}

	public void setUnlock(boolean mUnlock)
	{
		this.mUnlock = mUnlock;
	}

	public Character getCharacter()
	{
		return mCharacter;
	}

	public void setCharacter(Character mCharacter)
	{
		this.mCharacter = mCharacter;
	}
	
	
	// Methods
	@Override
	public boolean equals(Object o) 
	{
		if(o instanceof CharacterBank)
		{
			if(this.getIdCharacterBank() == ((CharacterBank) o).getIdCharacterBank())
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
			json.put(JSON_IDCHARACTERBANK, this.getIdCharacterBank());
			json.put(JSON_IDCHARACTER, this.getCharacter().getIdCharacter());
			json.put(JSON_NUMBER, this.getNumber());
			json.put(JSON_UNLOCK, this.isUnlock());
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
}
