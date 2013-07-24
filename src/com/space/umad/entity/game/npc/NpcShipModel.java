package com.space.umad.entity.game.npc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jettison.json.JSONObject;

import com.space.umad.entity.game.ship.ShipModel;


@Entity
@Table(name = "spaceumad_npcshipmodel")
public class NpcShipModel 
{
	// Define
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdNpcShipModel;
	
	private String mName;
	private int mLevelMin;
	private int mLevelMax;
	private int mCharacterLevelMin;
	private int mCharacterLevelMax;
	private long mLootCreditMin;
	private long mLootCreditMax;
	private long mLootExprerience;
	
	@ManyToOne
    @JoinColumn(name="mIdNpcType")
    private NpcType mNpcType;
	
	@ManyToOne
    @JoinColumn(name="mIdShipModel")
    private ShipModel mShipModel;
	
	
	// Constructor
	public NpcShipModel()
	{
		
	}
	
	public NpcShipModel(JSONObject json)
	{
		
	}
	
	
	// Getters - Setters
	public int getIdNpcShipModel() 
	{
		return mIdNpcShipModel;
	}

	public void setIdNpcShipModel(int mIdNpcShipModel)
	{
		this.mIdNpcShipModel = mIdNpcShipModel;
	}

	public String getName()
	{
		return mName;
	}

	public void setName(String mName) 
	{
		this.mName = mName;
	}

	public int getLevelMin() 
	{
		return mLevelMin;
	}

	public void setLevelMin(int mLevelMin) 
	{
		this.mLevelMin = mLevelMin;
	}

	public int getLevelMax() 
	{
		return mLevelMax;
	}

	public void setLevelMax(int mLevelMax)
	{
		this.mLevelMax = mLevelMax;
	}

	public int getCharacterLevelMin()
	{
		return mCharacterLevelMin;
	}

	public void setCharacterLevelMin(int mCharacterLevelMin) 
	{
		this.mCharacterLevelMin = mCharacterLevelMin;
	}

	public int getCharacterLevelMax() 
	{
		return mCharacterLevelMax;
	}

	public void setCharacterLevelMax(int mCharacterLevelMax)
	{
		this.mCharacterLevelMax = mCharacterLevelMax;
	}

	public long getLootCreditMin() 
	{
		return mLootCreditMin;
	}

	public void setLootCreditMin(long mLootCreditMin)
	{
		this.mLootCreditMin = mLootCreditMin;
	}

	public long getLootCreditMax() 
	{
		return mLootCreditMax;
	}

	public void setLootCreditMax(long mLootCreditMax)
	{
		this.mLootCreditMax = mLootCreditMax;
	}

	public long getLootExprerience() 
	{
		return mLootExprerience;
	}

	public void setLootExprerience(long mLootExprerience) 
	{
		this.mLootExprerience = mLootExprerience;
	}

	public NpcType getNpcType() 
	{
		return mNpcType;
	}

	public void setNpcType(NpcType mNpcType) 
	{
		this.mNpcType = mNpcType;
	}

	public ShipModel getShipModel() 
	{
		return mShipModel;
	}

	public void setShipModel(ShipModel mShipModel) 
	{
		this.mShipModel = mShipModel;
	}
	
	
	// Methods
}
