package com.space.umad.tools;

import java.util.List;

import com.space.umad.entity.User;

public class UserTools 
{
	public static User findUserByUsername(List<User> users, String username)
	{
		for (User user : users) 
		{
			if(user.getUsername().equals(username))
				return user;
		}
		return null;
	}
	
	public static User findUserByUsernameAndPassword(List<User> users, String username, String password)
	{
		for (User user : users) 
		{
			if(user.getUsername().equals(username) && user.getPassword().equals(password))
				return user;
		}
		return null;
	}
	
	public static User findUserByEmail(List<User> users, String email)
	{
		for (User user : users) 
		{
			if(user.getEmail().equals(email))
				return user;
		}
		return null;
	}
}
