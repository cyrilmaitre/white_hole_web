package com.space.umad.dao.jpa;

import com.space.umad.dao.PatchNoteFeatureDao;
import com.space.umad.entity.PatchNoteFeature;

public class JpaPatchNoteFeatureDao extends AbstractJpaDao<PatchNoteFeature> implements PatchNoteFeatureDao
{
	public JpaPatchNoteFeatureDao()
	{
		super(PatchNoteFeature.class);
	}
}
