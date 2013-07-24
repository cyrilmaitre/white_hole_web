package com.space.umad.entity.game.weapon;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.space.umad.entity.game.Item;


@Entity
@Table(name = "spaceumad_weaponmodel")
public class WeaponModel extends Item
{
	// Define
	
	// Attributs	
	@ManyToOne
    @JoinColumn(name="mIdWeaponType")
    private WeaponType mWeaponType;
	
	
	// Constructor
	public WeaponModel()
	{
		this.mWeaponType = null;
	}
	
	
	// Getters - Setters
	public WeaponType getWeaponType() 
	{
		return mWeaponType;
	}

	public void setWeaponType(WeaponType mWeaponType) 
	{
		this.mWeaponType = mWeaponType;
	}
	
	
	// Methods
}
