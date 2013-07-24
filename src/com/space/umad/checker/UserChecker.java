package com.space.umad.checker;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.User;
import com.space.umad.tools.UserTools;

public class UserChecker extends Checker<User>
{
	// Define 
	private static final int USER_USERNAME_MIN_L = 1;
	private static final int USER_USERNAME_MAX_L = 14;
	private static final int USER_PASSWORD_MIN_L = 1;
	private static final int USER_PASSWORD_MAX_L = 24;
	private static final String USER_EMAIL_REGEX = "^([a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4})$";
	
	// Check Methods
	private boolean checkUsername(User object)
	{
		return this.checkStringLenght(	object.getUsername(), 
										USER_USERNAME_MIN_L, 
										USER_USERNAME_MAX_L, 
										"Username");
	}
	
	private boolean checkUsernameUnique(User object)
	{
		if(UserTools.findUserByUsername(DaoFactory.getUserDao().findAll(), object.getUsername()) == null)
		{
			return true;
		}
		else
		{
			this.addError("This Username is already used");
			return false;
		}
	}
	
	private boolean checkEmailUnique(User object)
	{
		if(UserTools.findUserByEmail(DaoFactory.getUserDao().findAll(), object.getEmail()) == null)
		{
			return true;
		}
		else
		{
			this.addError("This Email is already used");
			return false;
		}
	}
	
	private boolean checkPassword(User object)
	{
		return this.checkStringLenght(	object.getPassword(), 
										USER_PASSWORD_MIN_L, 
										USER_PASSWORD_MAX_L, 
										"Password");
	}
	
	private boolean checkEmail(User object)
	{
		return this.checkStringPattern(	object.getEmail(), 
										USER_EMAIL_REGEX, 
										"Email");
	}
	
	// Override
	@Override
	public boolean isValid(User object) 
	{
		boolean isUsernameValid = checkUsername(object);
		boolean isUsernameUnique = checkUsernameUnique(object);
		boolean isPasswordValid = checkPassword(object);
		boolean isEmailValid = checkEmail(object);
		boolean isEmailUnique = checkEmailUnique(object);
		
		return 	isUsernameValid &&
				isUsernameUnique &&
				isPasswordValid &&
				isEmailValid &&
				isEmailUnique;
	}

	@Override
	public boolean hasChildren(User object) 
	{
		return false;
	}

	@Override
	public String getSuccessMessage(SuccessType type)
	{
		switch (type) 
		{
		case ADD:
			return "You account has been successfully added!";
			
		default:
			return "Success";
		}
	}
}
