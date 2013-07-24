package com.space.umad.entity;

import java.util.Calendar;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
@Table(name = "spaceumad_patchnote")
public class PatchNote
{	
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdPatchNote;
	
	private Calendar mDate;
	private String mComment;
	private String mRelease;
	private String mDownloadPath;
	private boolean mActive;
	
	@OneToMany(mappedBy = "mPatchNote")
	@LazyCollection(LazyCollectionOption.FALSE)
    private Collection<PatchNoteFeature> mPatchNoteFeatures;

	
	// Constructor
	public PatchNote(Calendar mDate, String mComment, String mRelease, String mDownloadPath)
	{
		super();
		this.mDate = mDate;
		this.mComment = mComment;
		this.mRelease = mRelease;
		this.mDownloadPath = mDownloadPath;
		this.mActive = false;
	}

	public PatchNote(int mIdPatchNote, Calendar mDate, String mComment, String mRelease, String mDownloadPath) 
	{
		super();
		this.mIdPatchNote = mIdPatchNote;
		this.mDate = mDate;
		this.mComment = mComment;
		this.mRelease = mRelease;
		this.mDownloadPath = mDownloadPath;
		this.mActive = false;
	}
	
	
	// Getters - Setters
	public int getIdPatchNote() 
	{
		return mIdPatchNote;
	}

	public void setIdPatchNote(int mIdPatchNote) 
	{
		this.mIdPatchNote = mIdPatchNote;
	}

	public Calendar getDate() 
	{
		return mDate;
	}

	public void setDate(Calendar mDate) 
	{
		this.mDate = mDate;
	}

	public String getComment() 
	{
		return mComment;
	}

	public void setComment(String mComment) 
	{
		this.mComment = mComment;
	}

	public String getRelease() 
	{
		return mRelease;
	}

	public void setRelease(String mRelease) 
	{
		this.mRelease = mRelease;
	}

	public String getDownloadPath()
	{
		return mDownloadPath;
	}

	public void setDownloadPath(String mDownloadPath) 
	{
		this.mDownloadPath = mDownloadPath;
	}
	
	public boolean isActive()
	{
		return mActive;
	}

	public void setActive(boolean mActive)
	{
		this.mActive = mActive;
	}

	public Collection<PatchNoteFeature> getPatchNoteFeatures() 
	{
		return mPatchNoteFeatures;
	}

	public void setPatchNoteFeatures(Collection<PatchNoteFeature> mPatchNoteFeatures) 
	{
		this.mPatchNoteFeatures = mPatchNoteFeatures;
	}
	
	
	// Tools
	@Override
	public boolean equals(Object o) 
	{
		if(o instanceof PatchNote)
		{
			if(this.getIdPatchNote() == ((PatchNote) o).getIdPatchNote())
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public String toString() 
	{
		return super.toString();
	}
}
