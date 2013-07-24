package com.space.umad.dao.jpa;

import com.space.umad.dao.PatchNoteDao;
import com.space.umad.entity.PatchNote;

public class JpaPatchNoteDao extends AbstractJpaDao<PatchNote> implements PatchNoteDao
{
	public JpaPatchNoteDao() 
	{
		super(PatchNote.class);
	}
}
