package com.space.umad.dao.jpa;

import com.space.umad.dao.UserDao;
import com.space.umad.entity.User;

public class JpaUserDao extends AbstractJpaDao<User> implements UserDao
{
	public JpaUserDao() 
	{
		super(User.class);
	}
}
