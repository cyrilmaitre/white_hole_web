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
	public static final String JSON_ICON = "icon";
	public static final String JSON_IDPARENT = "idParent";
	
	public static final String CONFIG_IDITEMTYPE = "id";
	public static final String CONFIG_NAME = "name";
	public static final String CONFIG_DESCRIPTION = "description";
	public static final String CONFIG_ICON = "icon";
	public static final String CONFIG_IDPARENT = "itemtype_parent";
	
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdItemType;
	
	private String mName;
	private String mDescription;
	private String mIcon;
	
	@ManyToOne
    @JoinColumn
    private ItemType mParent;
	
	
	// Constructor
	public ItemType()
	{
		this.mIdItemType = -1;
		this.mName = "";
		this.mDescription = "";
		this.mIcon = "0-0";
		this.mParent = null;
	}
	
	public ItemType(JSONObject json)
	{
		this.setIdItemType(json.optInt(JSON_IDITEMTYPE, -1));
		this.setName(json.optString(JSON_NAME, ""));
		this.setDescription(json.optString(JSON_DESCRIPTION, ""));
		this.setIcon(json.optString(JSON_ICON, "0-0"));
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

	public String getIcon() 
	{
		return mIcon;
	}

	public void setIcon(String mIcon)
	{
		this.mIcon = mIcon;
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
			json.put(JSON_ICON, this.getIcon());
			json.put(JSON_IDPARENT, this.getParent() != null ? this.getParent().getIdItemType() : -1);
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
	
	public String toConfig()
	{
		String config = "";
		config += CONFIG_IDITEMTYPE + " = " + this.getIdItemType() + "\n";
		config += CONFIG_NAME + " = " + this.getName() + "\n";
		config += CONFIG_DESCRIPTION + " = " + this.getDescription() + "\n";
		config += CONFIG_ICON + " = " + this.getIcon() + "\n";
		config += CONFIG_IDPARENT + " = " + (this.getParent() != null ? this.getParent().getIdItemType() : "NULL");
		return config;
	}
}
