package com.space.umad.entity.game;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.space.umad.dao.DaoFactory;

@Entity
@Table(name = "spaceumad_item")
@Inheritance (strategy=InheritanceType.JOINED)
public class Item 
{
	// Define
	public static final String JSON_IDITEM = "idItem";
	public static final String JSON_NAME = "name";
	public static final String JSON_DESCRIPTION = "description";
	public static final String JSON_PRICE = "price";
	public static final String JSON_STACKMAX = "stackMax";
	public static final String JSON_SPRITEID = "spriteId";
	public static final String JSON_IDITEMTYPE = "idItemtType";
	public static final String JSON_IDITEMTIER = "idItemTier";
	
	public static final String CONFIG_IDITEM = "id";
	public static final String CONFIG_NAME = "name";
	public static final String CONFIG_DESCRIPTION = "description";
	public static final String CONFIG_PRICE = "price";
	public static final String CONFIG_STACKMAX = "stackmax";
	public static final String CONFIG_SPRITEID = "sprite";
	public static final String CONFIG_ITEMTYPE = "itemtype";
	public static final String CONFIG_ITEMTIER = "itemtier";
	
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int mIdItem;
	
	private String mName;
	private String mDescription;
	private float mPrice;
	private int mStackMax;
	private String mSpriteId;
	
	@ManyToOne
    @JoinColumn(name="mIdItemType")
    private ItemType mItemType;
	
	@ManyToOne
    @JoinColumn(name="mIdItemTier")
    private ItemTier mItemTier;
	
	
	// Constructor
	public Item()
	{
		this.mIdItem = -1;
		this.mName = "";
		this.mDescription = "";
		this.mPrice = -1;
		this.mStackMax = -1;
		this.mSpriteId = null;
		this.mItemType = null;
		this.mItemTier = null;
	}
	
	public Item(JSONObject json)
	{
		this.setIdItem(json.optInt(JSON_IDITEM, -1));
		this.setName(json.optString(JSON_NAME, ""));
		this.setDescription(json.optString(JSON_DESCRIPTION, ""));
		this.setPrice(json.optInt(JSON_PRICE, -1));
		this.setStackMax(json.optInt(JSON_STACKMAX, -1));
		this.setSpriteId(json.optString(JSON_SPRITEID, null));
		this.setItemType(DaoFactory.getItemTypeDao().findById(json.optInt(JSON_IDITEMTYPE, -1)));
		this.setItemTier(DaoFactory.getItemTierDao().findById(json.optInt(JSON_IDITEMTIER, -1)));
	}
	
	
	// Getters - Setters
	public int getIdItem() 
	{
		return mIdItem;
	}

	public void setIdItem(int mIdItem)
	{
		this.mIdItem = mIdItem;
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

	public float getPrice()
	{
		return mPrice;
	}

	public void setPrice(float mPrice) 
	{
		this.mPrice = mPrice;
	}

	public int getStackMax() 
	{
		return mStackMax;
	}

	public void setStackMax(int mStackMax)
	{
		this.mStackMax = mStackMax;
	}

	public String getSpriteId() 
	{
		return mSpriteId;
	}

	public void setSpriteId(String mSpriteId) 
	{
		this.mSpriteId = mSpriteId;
	}

	public ItemType getItemType() 
	{
		return mItemType;
	}

	public void setItemType(ItemType mItemType) 
	{
		this.mItemType = mItemType;
	}

	public ItemTier getItemTier()
	{
		return mItemTier;
	}

	public void setItemTier(ItemTier mItemTier) 
	{
		this.mItemTier = mItemTier;
	}
	
	
	// Methods
	@Override
	public boolean equals(Object o) 
	{
		if(o instanceof Item)
		{
			if(this.getIdItem() == ((Item) o).getIdItem())
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
			json.put(JSON_IDITEM, this.getIdItem());
			json.put(JSON_NAME, this.getName());
			json.put(JSON_DESCRIPTION, this.getDescription());
			json.put(JSON_PRICE, this.getPrice());
			json.put(JSON_STACKMAX, this.getStackMax());
			json.put(JSON_SPRITEID, this.getSpriteId());
			json.put(JSON_IDITEMTIER, this.getItemTier() != null ? this.getItemTier().getIdItemTier() : -1);
			json.put(JSON_IDITEMTYPE, this.getItemType() != null ? this.getItemType().getIdItemType() : -1);
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
}
