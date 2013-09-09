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
import com.space.umad.entity.game.ItemStack;


@Entity
@Table(name = "spaceumad_characterbankitemstack")
public class CharacterBankItemStack 
{
	// Define
	public static final String JSON_IDCHARACTERBANKITEMSTACK = "idCharacterBankItemStack";
	public static final String JSON_POSITION = "position";
	public static final String JSON_CHARACTERBANK = "characterBank";
	public static final String JSON_IDCHARACTERBANK = "idCharacterBank";
	public static final String JSON_ITEMSTACK = "itemStack";
	public static final String JSON_IDITEMSTACK = "idItemStack";
	
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdCharacterBankItemStack;
	
	private int mPosition;
	
	@ManyToOne
    @JoinColumn(name="mIdCharacterBank")
    private CharacterBank mCharacterBank;
	
	@ManyToOne
    @JoinColumn(name="mIdItemStack")
    private ItemStack mItemStack;
	
	
	// Constructor
	public CharacterBankItemStack()
	{
		this.mIdCharacterBankItemStack = -1;
		this.mPosition = -1;
		this.mCharacterBank = null;
		this.mItemStack = null;
	}
	
	public CharacterBankItemStack(JSONObject json)
	{
		this.setIdCharacterBankItemStack(json.optInt(JSON_IDCHARACTERBANKITEMSTACK, -1));
		this.setPosition(json.optInt(JSON_POSITION));
		
		if(json.has(JSON_CHARACTERBANK))
			this.setCharacterBank(new CharacterBank(json.optJSONObject(JSON_CHARACTERBANK)));
		else
			this.setCharacterBank(DaoFactory.getCharacterBankDao().findById(json.optInt(JSON_IDCHARACTERBANK, -1)));
		
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
	public int getIdCharacterBankItemStack()
	{
		return mIdCharacterBankItemStack;
	}

	public void setIdCharacterBankItemStack(int mIdCharacterBankItemStack)
	{
		this.mIdCharacterBankItemStack = mIdCharacterBankItemStack;
	}

	public int getPosition() 
	{
		return mPosition;
	}

	public void setPosition(int mPosition)
	{
		this.mPosition = mPosition;
	}

	public CharacterBank getCharacterBank() 
	{
		return mCharacterBank;
	}

	public void setCharacterBank(CharacterBank mCharacterBank) 
	{
		this.mCharacterBank = mCharacterBank;
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
			json.put(JSON_IDCHARACTERBANKITEMSTACK, this.getIdCharacterBankItemStack());
			json.put(JSON_POSITION, this.getPosition());
			json.put(JSON_IDCHARACTERBANK, this.getCharacterBank() != null ? this.getCharacterBank().getIdCharacterBank() : -1);
			json.put(JSON_ITEMSTACK, this.getItemStack() != null ? this.getItemStack().toJson() : null);
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
}
