package com.space.umad.checker;

import java.util.ArrayList;
import java.util.regex.Pattern;


public abstract class Checker<T>
{
	// Attributs
	protected ArrayList<String> errors;
	

	// Constructor
	public Checker()
	{
		this.errors = new ArrayList<String>();
	}
	

	// Getters - Setters
	public int getErrorsCount()
	{
		return this.errors.size();
	}
	
	public ArrayList<String> getErrors()
	{
		return this.errors;
	}
	
	public boolean hasError()
	{
		return this.errors.size() != 0;
	}
	

	// Methods
	public void addError(String error)
	{
		this.errors.add(error);
	}
	
	public void addErrors(ArrayList<String> errors)
	{
		for (String error : errors) 
		{
			this.errors.add(error);
		}
	}
	
	public void removeError(String error)
	{
		this.errors.remove(error);
	}
	
	public void removeError(int index)
	{
		this.errors.remove(index);
	}
	
	public void removeAllErrors()
	{
		this.errors.clear();
	}
	
	public String buildHtmlErrorString()
	{
		String errorHtmlMessage = "";
		
		for (String error : this.errors) 
		{
			errorHtmlMessage += "<li>"+error+"</li>";
		}
		
		return "<p><strong>An error has occurred</strong>. Change this and try again.</p><ul>"+errorHtmlMessage+"</ul>";
	}
	
	public String buildHtmlChildrenErrorString()
	{
		String errorHtmlMessage = "";
		
		for (String children : this.errors) 
		{
			errorHtmlMessage += "<li>"+children+"</li>";
		}
		
		return "<p>This object has childrens. Remove them before delete it.</p><ul>"+errorHtmlMessage+"</ul>";
	}
	
	public String getSuccessMessage(SuccessType type)
	{
		switch (type) 
		{
		case ADD:
			return "The Object has been successfully added into database";

		case UPDATE:
			return "The Object has been successfully updated into database";
		
		case DELETE:
			return "The Object has been successfully deleted from database";
		
		default:
			return "Success";
		}
	}
	

	// Checker 
	protected boolean checkStringLenghtWithErrorMessage(String string, int minLenght, int maxLenght, String tooShortError, String tooLongError)
	{
		if(string.length() < minLenght)						
		{
			this.addError(tooShortError);
			return false;
		}
    	else if(string.length() > maxLenght)
    	{
    		this.addError(tooLongError);	
			return false;
		}
		
		return true;
	}
	
	protected boolean checkStringLenght(String string, int minLenght, int maxLenght, String fieldName)
	{
		if(string.length() < minLenght)						
		{
			this.addError(fieldName+" field is too short ("+minLenght+" characters minimum)");
			return false;
		}
    	else if(string.length() > maxLenght)
    	{
    		this.addError(fieldName+" field is too long ("+maxLenght+" characters maximum)");	
			return false;
		}
		
		return true;
	}
	
	protected boolean checkStringPatternWithErrorMessage(String string, String regex, String invalidPatternError)
	{
		if(!Pattern.compile(regex).matcher(string).matches())	
		{
			this.addError(invalidPatternError);
			return false;
		}
		
		return true;
	}
	
	protected boolean checkStringPattern(String string, String regex, String fieldName)
	{
		if(!Pattern.compile(regex).matcher(string).matches())	
		{
			this.addError(fieldName+" is invalid");
			return false;
		}
		
		return true;
	}
	
	protected boolean checkNumberRangeWithErrorMessage(int number, int min, int max, String tooSmallError, String tooBigError)
	{
		if(number < min)						
		{
			this.addError(tooSmallError);
			return false;
		}
    	else if(number > max)
    	{
    		this.addError(tooBigError);	
			return false;
		}
		
		return true;
	}
	
	protected boolean checkNumberRange(int number, int min, int max, String fieldName)
	{
		if(number < min)						
		{
			this.addError(fieldName+" field is too small ("+min+" minimum)");
			return false;
		}
    	else if(number > max)
    	{
    		this.addError(fieldName+" field is too big ("+max+" maximum)");	
			return false;
		}

		return true;
	}
	
	protected boolean checkNumberRangeWithErrorMessage(float number, float min, float max, String tooSmallError, String tooBigError)
	{
		if(number < min)						
		{
			this.addError(tooSmallError);
			return false;
		}
    	else if(number > max)
    	{
    		this.addError(tooBigError);	
			return false;
		}
		
		return true;
	}
	
	protected boolean checkNumberRange(float number, float min, float max, String fieldName)
	{
		if(number < min)						
		{
			this.addError(fieldName+" field is too small ("+min+" minimum)");
			return false;
		}
    	else if(number > max)
    	{
    		this.addError(fieldName+" field is too big ("+max+" maximum)");	
			return false;
		}
		
		return true;
	}
	
	protected boolean checkObjectHasChildren(int childNumber, String childName)
	{
		if(childNumber == 0)
		{
			return false;
		}
		else
		{
			this.addError(childName+" - "+childNumber+" childs");
			return true;
		}
	}
	
	// Abstract
	abstract boolean isValid(T object);
	abstract boolean hasChildren(T object);
	
	// Enum
	public enum SuccessType
	{
		ADD,
		UPDATE,
		DELETE
	}
}