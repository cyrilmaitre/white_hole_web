package com.space.umad.entity.game.ship;

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
import com.space.umad.entity.game.ItemStack;


@Entity
@Table(name = "spaceumad_charactershipitemstack")
public class CharacterShipItemStack 
{
	// Define
	public static final String JSON_IDCHARACTERSHIPITEMSTACK = "idCharacterShipItemStack";
	public static final String JSON_POSITION = "position";
	public static final String JSON_CHARACTERSHIP = "characterShip";
	public static final String JSON_IDCHARACTERSHIP = "idCharacterShip";
	public static final String JSON_ITEMSTACK = "itemStack";
	public static final String JSON_IDITEMSTACK = "idItemStack";
	
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdCharacterShipItemStack;
	
	private int mPosition;
	
	@ManyToOne
    @JoinColumn(name="mIdCharacterShip")
    private CharacterShip mCharacterShip;
	
	@ManyToOne
    @JoinColumn(name="mIdItemStack")
    private ItemStack mItemStack;
	
	
	// Constructor
	public CharacterShipItemStack()
	{
		this.mIdCharacterShipItemStack = -1;
		this.mPosition = -1;
		this.mCharacterShip = null;
		this.mItemStack = null;
	}
	
	public CharacterShipItemStack(JSONObject json)
	{
		this.setIdCharacterShipItemStack(json.optInt(JSON_IDCHARACTERSHIPITEMSTACK, -1));
		this.setPosition(json.optInt(JSON_POSITION));
		
		if(json.has(JSON_CHARACTERSHIP))
			this.setCharacterShip(new CharacterShip(json.optJSONObject(JSON_CHARACTERSHIP)));
		else
			this.setCharacterShip(DaoFactory.getCharacterShipDao().findById(json.optInt(JSON_IDCHARACTERSHIP, -1)));
		
		if(json.has(JSON_ITEMSTACK))
		{
			if(json.optString(JSON_ITEMSTACK, "null").equals("null"))
				this.setItemStack(null);
			else
				this.setItemStack(new ItemStack(json.optJSONObject(JSON_ITEMSTACK)));
		}
		else
			this.setItemStack(DaoFactory.getItemStackDao().findById(json.optInt(JSON_IDITEMSTACK, -1)));
	}
	
	
	// Getters - Setters
	public int getIdCharacterShipItemStack()
	{
		return mIdCharacterShipItemStack;
	}

	public void setIdCharacterShipItemStack(int mIdCharacterShipItemStack)
	{
		this.mIdCharacterShipItemStack = mIdCharacterShipItemStack;
	}

	public int getPosition() 
	{
		return mPosition;
	}

	public void setPosition(int mPosition) 
	{
		this.mPosition = mPosition;
	}

	public CharacterShip getCharacterShip()
	{
		return mCharacterShip;
	}

	public void setCharacterShip(CharacterShip mCharacterShip)
	{
		this.mCharacterShip = mCharacterShip;
	}

	public ItemStack getItemStack() 
	{
		return mItemStack;
	}

	public void setItemStack(ItemStack mItemStack)
	{
		this.mItemStack = mItemStack;
	}
	
	
	// Methods
	public JSONObject toJson()
	{
		JSONObject json = new JSONObject();
		
		try
		{
			json.put(JSON_IDCHARACTERSHIPITEMSTACK, this.getIdCharacterShipItemStack());
			json.put(JSON_POSITION, this.getPosition());
			json.put(JSON_IDCHARACTERSHIP, this.getCharacterShip() != null ? this.getCharacterShip().getIdCharacterShip() : -1);
			json.put(JSON_ITEMSTACK, this.getItemStack() != null ? this.getItemStack().toJson() : null);
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
}
