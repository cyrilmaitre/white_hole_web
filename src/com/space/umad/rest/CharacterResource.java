package com.space.umad.rest;

import java.util.Calendar;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.character.Character;
import com.space.umad.entity.game.character.CharacterSkill;
import com.space.umad.entity.game.ship.CharacterShip;
import com.space.umad.entity.game.ship.ShipModel;
import com.space.umad.entity.game.weapon.AmmoModel;
import com.space.umad.entity.game.weapon.Weapon;
import com.space.umad.entity.game.weapon.WeaponModel;
import com.space.umad.tools.Constants;


@Path("/character")
public class CharacterResource
{
	@POST 
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	// /SpaceUMad/resources/character/create
	// Get Character
	public String create(String string)
	{
		try 
		{
			Character newCharacter = new Character(new JSONObject(string));
			newCharacter.setDateCreation(Calendar.getInstance());
			newCharacter = DaoFactory.getCharacterDao().add(newCharacter);
			boolean characterCreated = newCharacter.getIdCharacter() != -1;
			
			JSONObject response = new JSONObject();
			if(characterCreated)
			{
				// Create character skils
				for (CharacterSkill current : newCharacter.getCharacterSkills()) 
				{
					current.setCharacter(newCharacter);
					DaoFactory.getCharacterSkillDao().add(current);
				}
				
				// Create character ship
				CharacterShip newShip = new CharacterShip();
				newShip.setLevel(0);
				newShip.setExperience(0);
				newShip.setPiloted(true);
				newShip.setCharacter(newCharacter);
				newShip.setShipModel((ShipModel) DaoFactory.getItemDao().findById(7));
				newShip = DaoFactory.getCharacterShipDao().add(newShip);
				
				// Create weapon ship
				Weapon basicWeapon = new Weapon();
				basicWeapon.setActif(true);
				basicWeapon.setAmmo((AmmoModel) DaoFactory.getItemDao().findById(1));
				basicWeapon.setAmmoCount(50);
				basicWeapon.setWeaponModel((WeaponModel) DaoFactory.getItemDao().findById(10));
				basicWeapon.setCharacterShip(newShip);
				for(int i = 0; i < 2; i++)
				{
					basicWeapon.setIdWeapon(-1);
					DaoFactory.getWeaponDao().add(basicWeapon);
				}
				
				response.put("created", "true");
			}
			else
			{
				response.put("created", "false");
			}
			
			return response.toString();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			throw new WebApplicationException(e, 403);
		}
	}
	
	
	@POST 
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	// /SpaceUMad/resources/character/update
	// Get character
	public String update(String string)
	{
		try 
		{
			// Update
			Character character = new Character(new JSONObject(string));
			DaoFactory.getCharacterDao().update(character);
		
			// Reponse
			JSONObject response = new JSONObject();
			response.put(Constants.RESULT_KEY, Constants.RESULT_OK);
			return response.toString();
		}
		catch(JSONException e)
		{
			try 
			{
				// Reponse
				JSONObject response = new JSONObject();
				response.put(Constants.RESULT_KEY, Constants.RESULT_FAILJSON);
				return response.toString();
			} 
			catch (JSONException e1)  {throw new WebApplicationException(e, 403);}
		}
		catch (Exception e)
		{			
			e.printStackTrace();
			throw new WebApplicationException(e, 403);
		}
	}
}
