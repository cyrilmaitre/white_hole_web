package com.space.umad.entity;

import java.util.Calendar;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.space.umad.entity.game.character.Character;


@Entity
@Table(name = "spaceumad_user")
public class User implements Comparable<User>
{
	// Define
	private static final String JSON_IDUSER = "idUser";
	private static final String JSON_USERNAME = "username";
	private static final String JSON_EMAIL = "email";
	private static final String JSON_REGISTERDATE = "registerDate";
	private static final String JSON_ADMIN = "admin";
	
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdUser;
		
	private String mUsername;
	private String mPassword;
	private String mEmail;
	private Calendar mRegisterDate;
	private boolean mAdmin;
	
	@OneToMany(mappedBy = "mUser")
	@LazyCollection(LazyCollectionOption.FALSE)
    private Collection<Character> mCharacters;
	
	
	// Constructor
	public User()
	{
		this.mIdUser = -1;
		this.mUsername = null;
		this.mPassword = null;
		this.mEmail = null;
		this.mRegisterDate = Calendar.getInstance();
		this.mAdmin = false;
	}
	
	public User(int idUser, String username, String password, String email, Calendar registerDate, boolean isAdmin) 
	{
		this.mIdUser = idUser;
		this.mUsername = username;
		this.mPassword = password;
		this.mEmail = email;
		this.mRegisterDate = registerDate;
		this.mAdmin = isAdmin;
	}
	
	public User(String username, String password, String email, Calendar registerDate, boolean isAdmin) 
	{
		this.mUsername = username;
		this.mPassword = password;
		this.mEmail = email;
		this.mRegisterDate = registerDate;
		this.mAdmin = isAdmin;
	}
	
	public User(JSONObject json)
	{
		Calendar registerDate = Calendar.getInstance();
		registerDate.setTimeInMillis(json.optLong(JSON_REGISTERDATE, 0));
		
		this.setIdUser(json.optInt(JSON_IDUSER, -1));
		this.setUsername(json.optString(JSON_USERNAME, ""));
		this.setEmail(json.optString(JSON_EMAIL, ""));
		this.setRegisterDate(registerDate);
		this.setAdmin(json.optBoolean(JSON_ADMIN, false));
	}

	
	// Getters - Setters
	public int getIdUser() 
	{
		return mIdUser;
	}

	public void setIdUser(int idUser) 
	{
		this.mIdUser = idUser;
	}

	public String getUsername() 
	{
		return mUsername;
	}

	public void setUsername(String username) 
	{
		this.mUsername = username;
	}

	public String getPassword() 
	{
		return mPassword;
	}

	public void setPassword(String password) 
	{
		this.mPassword = password;
	}

	public String getEmail() 
	{
		return mEmail;
	}

	public void setEmail(String email) 
	{
		this.mEmail = email;
	}

	public Calendar getRegisterDate() 
	{
		return mRegisterDate;
	}

	public void setRegisterDate(Calendar registerDate) 
	{
		this.mRegisterDate = registerDate;
	}

	public boolean isAdmin() 
	{
		return mAdmin;
	}

	public void setAdmin(boolean isAdmin) 
	{
		this.mAdmin = isAdmin;
	}
	
	public Collection<Character> getCharacters()
	{
		return mCharacters;
	}

	public void setCharacters(Collection<Character> mCharacters) 
	{
		this.mCharacters = mCharacters;
	}
	

	// Utils
	@Override
	public int compareTo(User o) 
	{
		return 0;
	}

	@Override
	public boolean equals(Object o) 
	{
		if(o instanceof User)
		{
			if(this.getUsername().equals(((User) o).getUsername()))
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public String toString() 
	{
		return this.getUsername();
	}
	
	public JSONObject toJson()
	{
		JSONObject json = new JSONObject();
		
		try
		{
			json.put(JSON_IDUSER, this.getIdUser());
			json.put(JSON_USERNAME, this.getUsername());
			json.put(JSON_EMAIL, this.getEmail());
			json.put(JSON_REGISTERDATE, this.getRegisterDate().getTimeInMillis());
			json.put(JSON_ADMIN, this.isAdmin());
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
}
