package com.space.umad.entity.game.ship;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "spaceumad_shiptype")
public class ShipType
{
	// Define
	public static final String JSON_IDSHIPTYPE = "idShipType";
	public static final String JSON_NAME = "name";
	public static final String JSON_DESCRIPTION = "description";
	
	public static final String CONFIG_IDSHIPTYPE = "idShipType";
	public static final String CONFIG_NAME = "name";
	public static final String CONFIG_DESCRIPTION = "description";
	
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdShipType;
	
	private String mName;
	private String mDescription;
		
	
	// Constructor
	public ShipType()
	{
		this.mIdShipType = -1;
		this.mName = null;
		this.mDescription = null;
	}
	
	
	// Getters - Setters
	public int getIdShipType()
	{
		return mIdShipType;
	}

	public void setIdShipType(int mIdShipType) 
	{
		this.mIdShipType = mIdShipType;
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
	
	
	// Methods
}
