package com.space.umad.entity.game.ship;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.space.umad.entity.game.Item;

@Entity
@Table(name = "spaceumad_shipmodel")
public class ShipModel extends Item
{
	// Define
	
	
	// Attributs
	@ManyToOne
    @JoinColumn(name="mIdShipType")
    private ShipType mShipType;
	
	
	// Constructor
	public ShipModel()
	{
		this.mShipType = null;
	}

	
	// Getters - Setters
	public ShipType getShipType() 
	{
		return mShipType;
	}

	public void setShipType(ShipType mShipType)
	{
		this.mShipType = mShipType;
	}
	
	
	// Methods
}
