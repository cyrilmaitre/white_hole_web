package com.space.umad.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "spaceumad_patchnotefeature")
public class PatchNoteFeature 
{
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mIdPatchNoteFeature;
	
	private String mContent;
	
	@ManyToOne
    @JoinColumn(name="mIdPatchNote")
    private PatchNote mPatchNote;


	// Constructor
	public PatchNoteFeature(String mContent, PatchNote mPatchNote) 
	{
		super();
		this.mContent = mContent;
		this.mPatchNote = mPatchNote;
	}

	public PatchNoteFeature(int mIdPatchNoteFeature, String mContent, PatchNote mPatchNote)
	{
		super();
		this.mIdPatchNoteFeature = mIdPatchNoteFeature;
		this.mContent = mContent;
		this.mPatchNote = mPatchNote;
	}
	
	
	// Getters - Setters
	public int getIdPatchNoteFeature() 
	{
		return mIdPatchNoteFeature;
	}

	public void setIdPatchNoteFeature(int mIdPatchNoteFeature) 
	{
		this.mIdPatchNoteFeature = mIdPatchNoteFeature;
	}

	public String getContent() 
	{
		
		return mContent;
	}

	public void setContent(String mContent) 
	{
		this.mContent = mContent;
	}

	public PatchNote getPatchNote()
	{
		return mPatchNote;
	}

	public void setPatchNote(PatchNote mPatchNote)
	{
		this.mPatchNote = mPatchNote;
	}

	
	// Tools
	@Override
	public boolean equals(Object o) 
	{
		if(o instanceof PatchNoteFeature)
		{
			if(this.getIdPatchNoteFeature() == ((PatchNoteFeature) o).getIdPatchNoteFeature())
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
