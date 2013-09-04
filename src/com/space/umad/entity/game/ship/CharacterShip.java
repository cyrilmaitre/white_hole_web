package com.space.umad.entity.game.ship;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.character.Character;
import com.space.umad.entity.game.weapon.Weapon;


@Entity
@Table(name = "spaceumad_charactership")
public class CharacterShip
{
	// Define
	private static final String JSON_IDCHARACTERSHIP = "idCharacterShip";
	private static final String JSON_LEVEL = "level";
	private static final String JSON_EXPERIENCE = "experience";
	private static final String JSON_PILOTED = "piloted";
	private static final String JSON_IDSHIPMODEL = "idShipModel";
	private static final String JSON_IDCHARACTER = "idCharacter";
	private static final String JSON_WEAPONS = "weapons";
	private static final String JSON_ITEMSTACKS = "itemStacks";
	
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdCharacterShip;
	
	private int mLevel;
	private int mExperience;
	private boolean mPiloted;
	
	@ManyToOne
    @JoinColumn(name="mIdShipModel")
    private ShipModel mShipModel;
	
	@ManyToOne
    @JoinColumn(name="mIdCharacter")
    private Character mCharacter;
	
	@OneToMany(mappedBy = "mCharacterShip")
	@LazyCollection(LazyCollectionOption.FALSE)
    private Collection<Weapon> mWeapons;
	
	@OneToMany(mappedBy = "mCharacterShip")
	@LazyCollection(LazyCollectionOption.FALSE)
    private Collection<CharacterShipItemStack> mItemStacks;
	
	
	// Constructor
	public CharacterShip()
	{
		this.mIdCharacterShip = -1;
		this.mLevel = 0;
		this.mExperience = 0;
		this.mPiloted = true;
		this.mShipModel = null;
	}
	
	public CharacterShip(JSONObject json)
	{
		this.setIdCharacterShip(json.optInt(JSON_IDCHARACTERSHIP, -1));
		this.setLevel(json.optInt(JSON_LEVEL, 0));
		this.setExperience(json.optInt(JSON_EXPERIENCE, 0));
		this.setPiloted(json.optBoolean(JSON_PILOTED, false));
		this.setShipModel(DaoFactory.getShipModelDao().findById(json.optInt(JSON_IDSHIPMODEL, -1)));
		this.setCharacter(DaoFactory.getCharacterDao().findById(json.optInt(JSON_IDCHARACTER, -1)));
		this.setWeapons(json.optJSONArray(JSON_WEAPONS));
		this.setItemStacks(json.optJSONArray(JSON_ITEMSTACKS));
	}

	
	// Getters - Setters
	public int getIdCharacterShip() 
	{
		return mIdCharacterShip;
	}

	public void setIdCharacterShip(int mIdCharacterShip) 
	{
		this.mIdCharacterShip = mIdCharacterShip;
	}

	public int getLevel() 
	{
		return mLevel;
	}

	public void setLevel(int mLevel) 
	{
		this.mLevel = mLevel;
	}

	public int getExperience() 
	{
		return mExperience;
	}

	public void setExperience(int mExperience)
	{
		this.mExperience = mExperience;
	}

	public boolean isPiloted() 
	{
		return mPiloted;
	}

	public void setPiloted(boolean mPiloted) 
	{
		this.mPiloted = mPiloted;
	}

	public ShipModel getShipModel()
	{
		return mShipModel;
	}
	
	public void setShipModel(ShipModel mShipModel)
	{
		this.mShipModel = mShipModel;
	}
	
	public Character getCharacter() 
	{
		return mCharacter;
	}

	public void setCharacter(Character mCharacter) 
	{
		this.mCharacter = mCharacter;
	}
	
	public Collection<Weapon> getWeapons() 
	{
		return mWeapons;
	}

	public void setWeapons(Collection<Weapon> mWeapons)
	{
		this.mWeapons = mWeapons;
	}
	
	public void setWeapons(JSONArray json)
	{
		if(this.mWeapons == null)
			this.mWeapons = new ArrayList<Weapon>();
		
		if(json != null)
		{
			for(int i = 0; i < json.length(); i++)
			{
				this.mWeapons.add(new Weapon(json.optJSONObject(i)));
			}
		}
	}
	
	public Collection<CharacterShipItemStack> getItemStacks() 
	{
		return mItemStacks;
	}
	
	public CharacterShipItemStack getItemStack(int p_position)
	{
		for(CharacterShipItemStack current : this.mItemStacks)
		{
			if(current.getPosition() == p_position)
				return current;
		}
		return null;
	}
	
	public void setItemStacks(Collection<CharacterShipItemStack> mItemStacks) 
	{
		this.mItemStacks = mItemStacks;
	}
	
	public void setItemStacks(JSONArray json) 
	{
		if(this.mItemStacks == null)
			this.mItemStacks = new ArrayList<CharacterShipItemStack>();
		
		if(json != null)
		{
			for(int i = 0; i < json.length(); i++)
			{
				this.mItemStacks.add(new CharacterShipItemStack(json.optJSONObject(i)));
			}
		}
	}
	

	// Methods
	public JSONObject toJson()
	{
		JSONObject json = new JSONObject();
		
		try
		{
			json.put(JSON_IDCHARACTERSHIP, this.getIdCharacterShip());
			json.put(JSON_LEVEL, this.getLevel());
			json.put(JSON_EXPERIENCE, this.getExperience());
			json.put(JSON_PILOTED, this.isPiloted());
			json.put(JSON_IDSHIPMODEL, this.getShipModel() != null ? this.getShipModel().getIdItem() : -1);
			json.put(JSON_IDCHARACTER, this.getCharacter() != null ? this.getCharacter().getIdCharacter() : -1);
			
			JSONArray weapons = new JSONArray();
			{
				int index = 0;
				for (Weapon currentWeapon : this.getWeapons()) 
				{
					weapons.put(index, currentWeapon.toJson());
					index++;
				}
			}
			json.put(JSON_WEAPONS, weapons);
			
			JSONArray itemStacks = new JSONArray();
			{
				int index = 0;
				for (CharacterShipItemStack currentStack : this.getItemStacks()) 
				{
					if(currentStack.getItemStack() != null)
					{
						itemStacks.put(index, currentStack.toJson());
						index++;
					}
				}
			}
			json.put(JSON_ITEMSTACKS, itemStacks);
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
}