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
	public static final String JSON_BUYABLE = "buyable";
	public static final String JSON_STOCKMINIMUMMIN = "stockminimum_min";
	public static final String JSON_STOCKMINIMUMMAX = "stockminimum_max";
	public static final String JSON_STOCKMAXIMUMMIN = "stockmaximum_min";
	public static final String JSON_STOCKMAXIMUMMAX = "stockmaximum_max";
	public static final String JSON_PRODUCTIONMIN = "production_min";
	public static final String JSON_PRODUCTIONMAX = "production_max";
	public static final String JSON_CONSUMPTIONMIN = "consumption_min";
	public static final String JSON_CONSUMPTIONMAX = "consumption_max";
	
	public static final String CONFIG_IDITEM = "id";
	public static final String CONFIG_NAME = "name";
	public static final String CONFIG_DESCRIPTION = "description";
	public static final String CONFIG_PRICE = "price";
	public static final String CONFIG_STACKMAX = "stackmax";
	public static final String CONFIG_SPRITEID = "sprite";
	public static final String CONFIG_ITEMTYPE = "itemtype";
	public static final String CONFIG_ITEMTIER = "itemtier";
	public static final String CONFIG_BUYABLE = "buyable";
	public static final String CONFIG_STOCKMINIMUMMIN = "stockminimum_min";
	public static final String CONFIG_STOCKMINIMUMMAX = "stockminimum_max";
	public static final String CONFIG_STOCKMAXIMUMMIN = "stockmaximum_min";
	public static final String CONFIG_STOCKMAXIMUMMAX = "stockmaximum_max";
	public static final String CONFIG_PRODUCTIONMIN = "production_min";
	public static final String CONFIG_PRODUCTIONMAX = "production_max";
	public static final String CONFIG_CONSUMPTIONMIN = "consumption_min";
	public static final String CONFIG_CONSUMPTIONMAX = "consumption_max";
	
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int mIdItem;
	
	private String mName;
	private String mDescription;
	private float mPrice;
	private int mStackMax;
	private String mSpriteId;
	private boolean mBuyable;
	private long mStockMinimumMin;
	private long mStockMinimumMax;
	private long mStockMaximumMin;
	private long mStockMaximumMax;
	private float mProductionMin;
	private float mProductionMax;
	private float mConsumptionMin;
	private float mConsumptionMax;
	
	
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
		this.mBuyable = true;
		this.mStockMinimumMin = 0;
		this.mStockMinimumMax = 0;
		this.mStockMaximumMin = 0;
		this.mStockMaximumMax = 0;
		this.mProductionMin = 0;
		this.mProductionMax = 0;
		this.mConsumptionMin = 0;
		this.mConsumptionMax = 0;
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
		this.setBuyable(json.optBoolean(JSON_BUYABLE, true));
		this.setStockMinimumMin(json.optLong(JSON_STOCKMINIMUMMIN, 0));
		this.setStockMinimumMax(json.optLong(CONFIG_STOCKMINIMUMMAX, 0));
		this.setStockMaximumMin(json.optLong(JSON_STOCKMAXIMUMMIN, 0));
		this.setStockMaximumMax(json.optLong(JSON_STOCKMAXIMUMMAX, 0));
		this.setProductionMin((float)json.optDouble(JSON_PRODUCTIONMIN, 0));
		this.setProductionMax((float)json.optDouble(JSON_PRODUCTIONMAX, 0));
		this.setConsumptionMin((float)json.optDouble(CONFIG_CONSUMPTIONMIN, 0));
		this.setConsumptionMax((float)json.optDouble(CONFIG_CONSUMPTIONMAX, 0));
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
	
	public boolean isBuyable() 
	{
		return mBuyable;
	}

	public void setBuyable(boolean mBuyable)
	{
		this.mBuyable = mBuyable;
	}
	
	public long getStockMinimumMin()
	{
		return mStockMinimumMin;
	}

	public void setStockMinimumMin(long mStockMinimumMin) 
	{
		this.mStockMinimumMin = mStockMinimumMin;
	}

	public long getStockMinimumMax()
	{
		return mStockMinimumMax;
	}

	public void setStockMinimumMax(long mStockMinimumMax) 
	{
		this.mStockMinimumMax = mStockMinimumMax;
	}

	public long getStockMaximumMin()
	{
		return mStockMaximumMin;
	}

	public void setStockMaximumMin(long mStockMaximumMin) 
	{
		this.mStockMaximumMin = mStockMaximumMin;
	}

	public long getStockMaximumMax()
	{
		return mStockMaximumMax;
	}

	public void setStockMaximumMax(long mStockMaximumMax) 
	{
		this.mStockMaximumMax = mStockMaximumMax;
	}
	
	public float getProductionMin() 
	{
		return mProductionMin;
	}

	public void setProductionMin(float mProductionMin) 
	{
		this.mProductionMin = mProductionMin;
	}

	public float getProductionMax() 
	{
		return mProductionMax;
	}

	public void setProductionMax(float mProductionMax) 
	{
		this.mProductionMax = mProductionMax;
	}

	public float getConsumptionMin() 
	{
		return mConsumptionMin;
	}

	public void setConsumptionMin(float mConsumptionMin) 
	{
		this.mConsumptionMin = mConsumptionMin;
	}

	public float getConsumptionMax() 
	{
		return mConsumptionMax;
	}

	public void setConsumptionMax(float mConsumptionMax)
	{
		this.mConsumptionMax = mConsumptionMax;
	}
	
	public void setVolume(float volume)
	{
		int stackMax = (int)(10.f / volume);
		if(stackMax < 1)
			stackMax = 1;
		
		this.setStackMax(stackMax);
		this.setStockMinimumMin(this.getStackMax() * 5);
		this.setStockMinimumMax(this.getStackMax() * 10);
		this.setStockMaximumMin((long)(this.getStockMinimumMax() * 1.1));
		this.setStockMaximumMax((long)(this.getStockMinimumMax() * 2));
		this.setProductionMin(0);
		this.setProductionMax(this.getStockMinimumMin());
		this.setConsumptionMin(0);
		this.setConsumptionMax(this.getStockMinimumMin());
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
	
	public JSONObject toJsonItem()
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
			json.put(JSON_BUYABLE, this.isBuyable());
			json.put(JSON_STOCKMINIMUMMIN, this.getStockMinimumMin());
			json.put(JSON_STOCKMINIMUMMAX, this.getStockMinimumMax());
			json.put(JSON_STOCKMAXIMUMMIN, this.getStockMaximumMin());
			json.put(JSON_STOCKMAXIMUMMAX, this.getStockMaximumMax());
			json.put(JSON_PRODUCTIONMIN, this.getProductionMin());
			json.put(JSON_PRODUCTIONMAX, this.getProductionMax());
			json.put(JSON_CONSUMPTIONMIN, this.getConsumptionMin());
			json.put(JSON_CONSUMPTIONMAX, this.getConsumptionMax());
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
	
	public String toConfigItem()
	{
		String config = "";
		config += CONFIG_IDITEM + " = " + this.getIdItem() + "\n";
		config += CONFIG_NAME + " = " + this.getName() + "\n";
		config += CONFIG_DESCRIPTION + " = " + this.getDescription() + "\n";
		config += CONFIG_PRICE + " = " + this.getPrice() + "\n";
		config += CONFIG_STACKMAX + " = " + this.getStackMax() + "\n";
		config += CONFIG_SPRITEID + " = " + this.getSpriteId() + "\n";
		config += CONFIG_ITEMTYPE + " = " + this.getItemType().getIdItemType() + "\n";
		config += CONFIG_ITEMTIER + " = " + this.getItemTier().getIdItemTier() + "\n";
		config += CONFIG_BUYABLE + " = " + this.isBuyable() + "\n";
		config += CONFIG_STOCKMINIMUMMIN + " = " + this.getStockMinimumMin() + "\n";
		config += CONFIG_STOCKMINIMUMMAX + " = " + this.getStockMinimumMax() + "\n";
		config += CONFIG_STOCKMAXIMUMMIN + " = " + this.getStockMaximumMin() + "\n";
		config += CONFIG_STOCKMAXIMUMMAX + " = " + this.getStockMaximumMax() + "\n";
		config += CONFIG_PRODUCTIONMIN + " = " + this.getProductionMin() + "\n";
		config += CONFIG_PRODUCTIONMAX + " = " + this.getProductionMax() + "\n";
		config += CONFIG_CONSUMPTIONMIN + " = " + this.getConsumptionMin() + "\n";
		config += CONFIG_CONSUMPTIONMAX + " = " + this.getConsumptionMax();
		return config;
	}
}
