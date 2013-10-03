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
import com.space.umad.tools.Constants;

@Path("/charactership")
public class CharacterShipResource 
{
	// Define
	public static final String RESPONSEKEY_CHARACTERSHIP = "charactership";
		
	
	// Methods
	@POST 
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	// /SpaceUMad/resources/charactership/create
	public String create(String string)
	{
		try 
		{
			// Add
			CharacterShip characterShip = new CharacterShip(new JSONObject(string));
			DaoFactory.getCharacterShipDao().add(characterShip);
		
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
	
	
	@POST 
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	// /SpaceUMad/resources/charactership/update
	public String update(String string)
	{
		try 
		{
			// Update
			CharacterShip characterShip = new CharacterShip(new JSONObject(string));
			DaoFactory.getCharacterShipDao().update(characterShip);
			characterShip = DaoFactory.getCharacterShipDao().findById(characterShip.getIdCharacterShip());			
		
			// Reponse
			JSONObject response = new JSONObject();
			response.put(Constants.RESULT_KEY, Constants.RESULT_OK);
			response.put(RESPONSEKEY_CHARACTERSHIP, characterShip.toJson());
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
	
	@POST 
	@Path("/remove")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	// /SpaceUMad/resources/charactership/remove
	public String remove(String string)
	{
		try 
		{
			// Remove
			CharacterShip characterShip = new CharacterShip(new JSONObject(string));
			DaoFactory.getCharacterShipDao().remove(characterShip.getIdCharacterShip());
		
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
