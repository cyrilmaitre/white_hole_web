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
@Table(name = "spaceumad_itemtype")
public class ItemType
{
	// Define
	public static final String JSON_IDITEMTYPE = "idItemType";
	public static final String JSON_NAME = "name";
	public static final String JSON_DESCRIPTION = "description";
	public static final String JSON_LEAF = "leaf";
	public static final String JSON_IDPARENT = "idParent";
	
	public static final String CONFIG_IDITEMTYPE = "id";
	public static final String CONFIG_NAME = "name";
	public static final String CONFIG_DESCRIPTION = "description";
	public static final String CONFIG_LEAF = "itemtype_parent";
	public static final String CONFIG_IDPARENT = "itemtype_leaf";
	
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdItemType;
	
	private String mName;
	private String mDescription;
	private boolean mLeaf;
	
	@ManyToOne
    @JoinColumn(name="mIdItemType", insertable = false, updatable = false)
    private ItemType mParent;
	
	
	// Constructor
	public ItemType()
	{
		this.mIdItemType = -1;
		this.mName = "";
		this.mDescription = "";
		this.mLeaf = true;
		this.mParent = null;
	}
	
	public ItemType(JSONObject json)
	{
		this.setIdItemType(json.optInt(JSON_IDITEMTYPE, -1));
		this.setName(json.optString(JSON_NAME, ""));
		this.setDescription(json.optString(JSON_DESCRIPTION, ""));
		this.setLeaf(json.optBoolean(JSON_LEAF, true));
		this.setParent(DaoFactory.getItemTypeDao().findById(json.optInt(JSON_IDPARENT, -1)));
	}
	
	
	// Getters - Setters
	public int getIdItemType() 
	{
		return mIdItemType;
	}

	public void setIdItemType(int mIdItemType)
	{
		this.mIdItemType = mIdItemType;
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

	public boolean isLeaf() 
	{
		return mLeaf;
	}

	public void setLeaf(boolean mLeaf)
{
		this.mLeaf = mLeaf;
	}

	public ItemType getParent() 
	{
		return mParent;
	}

	public void setParent(ItemType mParent)
	{
		this.mParent = mParent;
	}
	
	
	// Methods
	@Override
	public boolean equals(Object o) 
	{
		if(o instanceof ItemType)
		{
			if(this.getIdItemType() == ((ItemType) o).getIdItemType())
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
			json.put(JSON_IDITEMTYPE, this.getIdItemType());
			json.put(JSON_NAME, this.getName());
			json.put(JSON_DESCRIPTION, this.getDescription());
			json.put(JSON_LEAF, this.isLeaf());
			json.put(JSON_IDPARENT, this.getParent() != null ? this.getParent().getIdItemType() : -1);
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
}
