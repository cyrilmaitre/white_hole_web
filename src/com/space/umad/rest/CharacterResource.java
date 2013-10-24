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
import com.space.umad.entity.game.character.CharacterBank;
import com.space.umad.entity.game.character.CharacterSkill;
import com.space.umad.entity.game.ship.CharacterShip;
import com.space.umad.entity.game.ship.ShipModel;
import com.space.umad.tools.Constants;


@Path("/character")
public class CharacterResource
{
	// Define	
	private static final int BASE_HANGARSPACE = 5;
	private static final int BASE_CREDIT = 5000;
	private static final int BASE_SHIPMODEL = 7;
	private static final int BASE_SHIPWEAPON_COUNT = 2;
	private static final int BASE_SHIPWEAPON_MODEL = 10;
	private static final int BASE_SHIPWEAPON_AMMOMODEL = 1;
	private static final int BASE_SHIPWEAPON_AMMOCOUNT = 100;
	private static final String RESPONSEJSON_CHARACTER = "character";
	
	
	// Methods
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
			newCharacter.setHangarSpace(BASE_HANGARSPACE);
			newCharacter.setCredit(BASE_CREDIT);
			newCharacter = DaoFactory.getCharacterDao().add(newCharacter);
			boolean characterCreated = newCharacter.getIdCharacter() != -1;
			
			JSONObject response = new JSONObject();
			if(characterCreated)
			{
				// Create character skills
				for (CharacterSkill current : newCharacter.getCharacterSkills()) 
				{
					current.setCharacter(newCharacter);
					DaoFactory.getCharacterSkillDao().add(current);
				}
				
				// Create character banks
				CharacterBank bankOne = new CharacterBank();
				bankOne.setCharacter(newCharacter);
				bankOne.setNumber(1);
				bankOne.setUnlock(true);
				DaoFactory.getCharacterBankDao().add(bankOne);
				
				for(int i = 2; i < 6; i++)
				{
					CharacterBank currentBank = new CharacterBank();
					currentBank.setCharacter(newCharacter);
					currentBank.setNumber(i);
					currentBank.setUnlock(false);
					DaoFactory.getCharacterBankDao().add(currentBank);
				}
				
				// Create character ship
				CharacterShip newShip = new CharacterShip();
				newShip.setName("My ship");
				newShip.setLevel(0);
				newShip.setExperience(0);
				newShip.setSkillPoints(0);
				newShip.setPiloted(true);
				newShip.setCharacter(newCharacter);
				newShip.setShipModel((ShipModel) DaoFactory.getItemDao().findById(BASE_SHIPMODEL));
				newShip = DaoFactory.getCharacterShipDao().add(newShip);
				
				// Create weapon ship
				/*
				 * Create JSON Weapons here
				 */

				// Return
				Character returnCharacter = DaoFactory.getCharacterDao().findById(newCharacter.getIdCharacter());
				response.put("created", "true");
				response.put(RESPONSEJSON_CHARACTER, returnCharacter.toJson());
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
