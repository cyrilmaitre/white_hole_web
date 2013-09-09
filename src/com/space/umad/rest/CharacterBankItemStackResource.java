package com.space.umad.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONObject;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.game.character.CharacterBank;
import com.space.umad.entity.game.character.CharacterBankItemStack;
import com.space.umad.tools.Constants;

@Path("/itemstack/characterbank")
public class CharacterBankItemStackResource
{
	@POST 
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	// /SpaceUMad/resources/itemstack/characterbank/update
	// Get CharacterBankItemStack
	public String update(String string)
	{
		try 
		{
			// Get Param
			JSONObject json = new JSONObject(string);
			CharacterBankItemStack newItemStack = new CharacterBankItemStack(json);
			CharacterBank ship = newItemStack.getCharacterBank();
			CharacterBankItemStack oldItemStack = ship.getItemStack(newItemStack.getPosition());
			
			// Add or Update ItemStack
			if(newItemStack.getItemStack() != null)
			{
				if(newItemStack.getItemStack().getIdItemStack() == -1)
					newItemStack.setItemStack(DaoFactory.getItemStackDao().add(newItemStack.getItemStack()));
				else
					DaoFactory.getItemStackDao().update(newItemStack.getItemStack());	
			}
			
			// Add or Update CBItemStack
			if(oldItemStack == null)
			{				
				newItemStack.setIdCharacterBankItemStack(-1);
				DaoFactory.getCharacterBankItemStackDao().add(newItemStack);
			}
			else
			{
				newItemStack.setIdCharacterBankItemStack(oldItemStack.getIdCharacterBankItemStack());
				DaoFactory.getCharacterBankItemStackDao().update(newItemStack);
			}	
			
			// Reponse
			JSONObject response = new JSONObject();
			response.put(Constants.RESULT_KEY, Constants.RESULT_OK);
			return response.toString();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			throw new WebApplicationException(e, 403);
		}
	}

}
