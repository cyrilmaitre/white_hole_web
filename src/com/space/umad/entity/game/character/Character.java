package com.space.umad.entity.game.character;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.space.umad.dao.DaoFactory;
import com.space.umad.entity.User;
import com.space.umad.entity.game.ship.CharacterShip;


@Entity
@Table(name = "spaceumad_character")
public class Character implements Comparable<Character> 
{
	// Define
	public static final String JSON_IDCHARACTER = "idCharacter";
	private static final String JSON_NAME = "name";
	private static final String JSON_AVATARID = "avatarId";
	public static final String JSON_SKILLPOINTS = "skillPoints";
	public static final String JSON_LEVEL = "level";
	public static final String JSON_EXPERIENCE = "experience";
	public static final String JSON_CREDIT = "credit";
	private static final String JSON_DATECREATION = "dateCreation";
	private static final String JSON_TIMEPLAYED = "timePlayed";
	private static final String JSON_ALIVE = "alive";
	private static final String JSON_IDRACE = "idRace";
	private static final String JSON_IDJOB = "idJob";
	private static final String JSON_IDUSER = "idUser";
	private static final String JSON_CHARACTERSKILLS = "skills";
	private static final String JSON_CHARACTERBANKS = "banks";
	private static final String JSON_CHARACTERSHIP = "ships";
	private static final String JSON_CHARACTERSHIPCOUNT = "shipsCount";
	
	
	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdCharacter;
	
	private String mName;
	private String mAvatarId;
	private int mSkillPoints;
	private int mLevel;
	private int mExperience;
	private long mCredit;
	private Calendar mDateCreation;
	private long mTimePlayed;
	private boolean mAlive;
	
	@ManyToOne
    @JoinColumn(name="mIdRace")
    private Race mRace;
	
	@ManyToOne
    @JoinColumn(name="mIdJob")
    private Job mJob;
	
	@ManyToOne
    @JoinColumn(name="mIdUser")
    private User mUser;
	
	@OneToMany(mappedBy = "mCharacter")
	@LazyCollection(LazyCollectionOption.FALSE)
    private Collection<CharacterSkill> mCharacterSkills;
	
	@OneToMany(mappedBy = "mCharacter")
	@LazyCollection(LazyCollectionOption.FALSE)
    private Collection<CharacterBank> mCharacterBanks;
	
	@OneToMany(mappedBy = "mCharacter")
	@LazyCollection(LazyCollectionOption.FALSE)
    private Collection<CharacterShip> mCharacterShip;
	
	
	// Constructor
	public Character() 
	{
		this.mIdCharacter = -1;
		this.mName = null;
		this.mAvatarId = null;
		this.mSkillPoints = 0;
		this.mLevel = 0;
		this.mExperience = 0;
		this.mCredit = 0;
		this.mDateCreation = Calendar.getInstance();
		this.mTimePlayed = 0;
		this.mAlive = true;
		this.mRace = null;
		this.mJob = null;
		this.mUser = null;
	}
	
	public Character(JSONObject json) 
	{
		Calendar dateCreation = Calendar.getInstance();
		dateCreation.setTimeInMillis(json.optLong(JSON_DATECREATION, 0));
		
		this.setIdCharacter(json.optInt(JSON_IDCHARACTER, 0));
		this.setName(json.optString(JSON_NAME, ""));
		this.setAvatarId(json.optString(JSON_AVATARID, ""));
		this.setSkillPoints(json.optInt(JSON_SKILLPOINTS, 0));
		this.setLevel(json.optInt(JSON_LEVEL, 0));
		this.setExperience(json.optInt(JSON_EXPERIENCE, 0));
		this.setCredit(json.optLong(JSON_CREDIT, 0));
		this.setDateCreation(dateCreation);
		this.setTimePlayed(json.optLong(JSON_TIMEPLAYED, 0));
		this.setAlive(json.optBoolean(JSON_ALIVE, true));
		this.setRace(DaoFactory.getRaceDao().findById(json.optInt(JSON_IDRACE, -1)));
		this.setJob(DaoFactory.getJobDao().findById(json.optInt(JSON_IDJOB, -1)));
		this.setUser(DaoFactory.getUserDao().findById(json.optInt(JSON_IDUSER, -1)));
		this.setCharacterSkills(json.optJSONArray(JSON_CHARACTERSKILLS));
		this.setCharacterBanks(json.optJSONArray(JSON_CHARACTERBANKS));
		this.setCharacterShip(json.optJSONArray(JSON_CHARACTERSHIP));
	}
	
	
	// Getters - Setters
	public int getIdCharacter() 
	{
		return mIdCharacter;
	}

	public void setIdCharacter(int idCharacter) 
	{
		this.mIdCharacter = idCharacter;
	}

	public String getName() 
	{
		return mName;
	}

	public void setName(String mName)
	{
		this.mName = mName;
	}

	public String getAvatarId()
	{
		return mAvatarId;
	}

	public void setAvatarId(String mAvatarId) 
	{
		this.mAvatarId = mAvatarId;
	}

	public int getSkillPoints() 
	{
		return mSkillPoints;
	}

	public void setSkillPoints(int mSkillPoints) 
	{
		this.mSkillPoints = mSkillPoints;
	}

	public int getLevel() 
	{
		return mLevel;
	}

	public void setLevel(int mLevel) 
	{
		this.mLevel = mLevel;
	}

	public int getExperience() 
	{
		return mExperience;
	}

	public void setExperience(int mExperience) 
	{
		this.mExperience = mExperience;
	}
	
	public long getCredit() 
	{
		return mCredit;
	}

	public void setCredit(long mCredit) 
	{
		this.mCredit = mCredit;
	}

	public Calendar getDateCreation()
	{
		return mDateCreation;
	}

	public void setDateCreation(Calendar mDateCreation) 
	{
		this.mDateCreation = mDateCreation;
	}

	public long getTimePlayed()
	{
		return mTimePlayed;
	}

	public void setTimePlayed(long mTimePlayed) 
	{
		this.mTimePlayed = mTimePlayed;
	}

	public boolean isAlive() 
	{
		return mAlive;
	}

	public void setAlive(boolean mAlive) 
	{
		this.mAlive = mAlive;
	}

	public Race getRace() 
	{
		return mRace;
	}

	public void setRace(Race mRace)
	{
		this.mRace = mRace;
	}

	public Job getJob() 
	{
		return mJob;
	}

	public void setJob(Job mJob) 
	{
		this.mJob = mJob;
	}

	public User getUser()
	{
		return mUser;
	}

	public void setUser(User mUser) 
	{
		this.mUser = mUser;
	}

	public Collection<CharacterSkill> getCharacterSkills() 
	{
		return mCharacterSkills;
	}

	public void setCharacterSkills(Collection<CharacterSkill> mCharacterSkills) 
	{
		this.mCharacterSkills = mCharacterSkills;
	}
	
	public void setCharacterSkills(JSONArray json) 
	{
		if(this.mCharacterSkills == null)
			this.mCharacterSkills = new ArrayList<CharacterSkill>();
		
		if(json != null)
		{
			for(int i = 0; i < json.length(); i++)
			{
				this.mCharacterSkills.add(new CharacterSkill(json.optJSONObject(i)));
			}
		}
	}
	
	public Collection<CharacterShip> getCharacterShip() 
	{
		return mCharacterShip;
	}

	public void setCharacterShip(Collection<CharacterShip> mCharacterShip)
	{
		this.mCharacterShip = mCharacterShip;
	}
	
	public void setCharacterShip(JSONArray json)
	{
		if(this.mCharacterShip == null)
			this.mCharacterShip = new ArrayList<CharacterShip>();
		
		if(json != null)
		{
			for(int i = 0; i < json.length(); i++)
			{
				this.mCharacterShip.add(new CharacterShip(json.optJSONObject(i)));
			}
		}
	}	

	public Collection<CharacterBank> getCharacterBanks()
	{
		return mCharacterBanks;
	}

	public void setCharacterBanks(Collection<CharacterBank> mCharacterBanks) 
	{
		this.mCharacterBanks = mCharacterBanks;
	}
	
	public void setCharacterBanks(JSONArray json)
	{
		if(this.mCharacterBanks == null)
			this.mCharacterBanks = new ArrayList<CharacterBank>();
		
		if(json != null)
		{
			for(int i = 0; i < json.length(); i++)
			{
				this.mCharacterBanks.add(new CharacterBank(json.optJSONObject(i)));
			}
		}
	}
	

	// Utils
	@Override
	public int compareTo(Character o) 
	{
		return 0;
	}

	@Override
	public boolean equals(Object o) 
	{
		if(o instanceof Character)
		{
			if(this.getIdCharacter() == ((Character) o).getIdCharacter())
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public String toString() 
	{
		return this.getName();
	}
	
	public JSONObject toJson()
	{
		JSONObject json = new JSONObject();
		
		try
		{
			json.put(JSON_IDCHARACTER, this.getIdCharacter());
			json.put(JSON_NAME, this.getName());
			json.put(JSON_AVATARID, this.getAvatarId());
			json.put(JSON_SKILLPOINTS, this.getSkillPoints());
			json.put(JSON_LEVEL, this.getLevel());
			json.put(JSON_CREDIT, this.getCredit());
			json.put(JSON_EXPERIENCE, this.getExperience());
			json.put(JSON_TIMEPLAYED, this.getTimePlayed());
			json.put(JSON_ALIVE, this.isAlive());
			json.put(JSON_IDRACE, this.getRace() != null ? this.getRace().getIdRace() : -1);
			json.put(JSON_IDJOB, this.getJob() != null ? this.getJob().getIdJob() : -1);
			json.put(JSON_IDUSER, this.getUser() != null ? this.getUser().getIdUser() : -1);
			
			JSONArray skills = new JSONArray();
			int index = 0;
			for (CharacterSkill currentSkill : this.getCharacterSkills()) 
			{
				skills.put(index, currentSkill.toJson());
				index++;
			}
			json.put(JSON_CHARACTERSKILLS, skills);
			
			JSONArray banks = new JSONArray();
			index = 0;
			for (CharacterBank currentBank : this.getCharacterBanks())
			{
				banks.put(index, currentBank.toJson());
				index++;
			}
			json.put(JSON_CHARACTERBANKS, banks);
			
			JSONArray ships = new JSONArray();
			index = 0;
			for (CharacterShip currentShip : this.getCharacterShip()) 
			{
				ships.put(index, currentShip.toJson());
				index++;
			}
			json.put(JSON_CHARACTERSHIP, ships);
			json.put(JSON_CHARACTERSHIPCOUNT, this.getCharacterShip().size());
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		return json;
	}
}
