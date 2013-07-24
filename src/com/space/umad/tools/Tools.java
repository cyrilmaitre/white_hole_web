package com.space.umad.tools;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.digest.DigestUtils;

import com.space.umad.entity.User;

public class Tools 
{
	// Check if user logged on
	public static boolean isLoggedOn(HttpServletRequest request)
	{
		return request.getSession(true).getAttribute("login") != null;
	}
	
	// Check if user is admin
	public static boolean isAdmin(HttpServletRequest request)
	{
		User user = (User) request.getSession(true).getAttribute("login");
		if (user == null) 
		{
			return false;
		} else 
		{
			return user.isAdmin();
		}
	}
	
	// Get hash sha1 of String
	public static String sha1(String password)
    {
        return DigestUtils.shaHex(password);
    }
}
