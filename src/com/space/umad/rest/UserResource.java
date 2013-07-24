package com.space.umad.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.User;
import com.space.umad.entity.game.character.Character;
import com.space.umad.tools.UserTools;


@Path("/user")
public class UserResource
{
	@POST 
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	// /SpaceUMad/resources/user/login
	// {username : "ikg", password : "cramik"}
	public String authenticate(String string)
	{
		try 
		{
			// Get Param
			JSONObject json = new JSONObject(string);
			String username = json.optString("username", "");
			String password = json.optString("password", "");
			
			// Authenticate
			User user = UserTools.findUserByUsernameAndPassword(DaoFactory.getUserDao().findAll(), username, password);
			JSONObject response = new JSONObject();
			if (user != null) 
			{
				
				JSONObject jsonUser = user.toJson();
				JSONArray characters = new JSONArray();
				if(user != null && user.getCharacters() != null)
				{
					int index = 0;
					for (Character current : user.getCharacters())
					{
						characters.put(index, current.toJson());
						index++;
					}
				}
				jsonUser.put("characters", characters);
				jsonUser.put("charactersCount", user.getCharacters().size());
				
				response.put("authenticated", "true");
				response.put("user", jsonUser);
			}
			else
			{
				response.put("authenticated", "false");
			}
			
			return response.toString();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			throw new WebApplicationException(e, 403);
		}
	}
}
