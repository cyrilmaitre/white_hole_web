package com.space.umad.entity.game;

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
@Table(name = "spaceumad_itemstack")
public class ItemStack
{
	// Define
	public static final String JSON_IDITEMSTACK = "idItemStack";
	public static final String JSON_STACKSIZE = "stackSize";
	public static final String JSON_IDITEM = "idItem";
	
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdItemStack;
	
	private int mStackSize;
	
	@ManyToOne
    @JoinColumn(name="mIdItem")
    private Item mItem;
	
	
	// Constructor
	public ItemStack()
	{
		this.mIdItemStack = -1;
		this.mStackSize = -1;
		this.mItem = null;
	}
	
	public ItemStack(JSONObject json)
	{
		this.setIdItemStack(json.optInt(JSON_IDITEMSTACK, -1));
		this.setStackSize(json.optInt(JSON_STACKSIZE, -1));
		this.setItem(DaoFactory.getItemDao().findById(json.optInt(JSON_IDITEM, -1)));
	}
	
	
	// Getters - Setters
	public int getIdItemStack()
	{
		return mIdItemStack;
	}

	public void setIdItemStack(int mIdItemStack)
	{
		this.mIdItemStack = mIdItemStack;
	}

	public int getStackSize()
	{
		return mStackSize;
	}

	public void setStackSize(int mStackSize)
	{
		this.mStackSize = mStackSize;
	}

	public Item getItem() 
	{
		return mItem;
	}

	public void setItem(Item mItem)
	{
		this.mItem = mItem;
	}
	
	
	// Methods
	public JSONObject toJson()
	{
		JSONObject json = new JSONObject();
		
		try
		{
			json.put(JSON_IDITEMSTACK, this.getIdItemStack());
			json.put(JSON_STACKSIZE, this.getStackSize());
			json.put(JSON_IDITEM, this.getItem() != null ? this.getItem().getIdItem() : -1);
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
}
