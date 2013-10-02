package com.space.umad.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.ship.CharacterShip;
import com.space.umad.entity.game.weapon.Weapon;
import com.space.umad.tools.Constants;

@Path("/charactership/weapon")
public class CharacterShipWeaponResource 
{
	@POST 
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	// /SpaceUMad/resources/charactership/weapon/update
	public String update(String string)
	{
		try 
		{
			// Deserialize
			CharacterShip characterShip = new CharacterShip(new JSONObject(string));
			
			// Remove old refs
			CharacterShip oldCharacterShip = DaoFactory.getCharacterShipDao().findById(characterShip.getIdCharacterShip());
			for(Weapon currentWeapon : oldCharacterShip.getWeapons())
			{
				DaoFactory.getWeaponDao().remove(currentWeapon.getIdWeapon());
			}
			
			// Add new refs
			for(Weapon currentWeapon : characterShip.getWeapons())
			{
				DaoFactory.getWeaponDao().add(currentWeapon);
			}

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
