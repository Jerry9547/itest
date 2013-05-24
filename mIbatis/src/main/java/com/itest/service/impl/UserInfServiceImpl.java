package com.itest.service.impl;

import com.itest.dao.UserInfDAO;
import com.itest.entity.UserInf;
import com.itest.service.UserInfService;

public class UserInfServiceImpl implements UserInfService
{
	private UserInfDAO userInfDao;

	
	public UserInfDAO getUserInfDao()
	{
		return userInfDao;
	}

	public void setUserInfDao(UserInfDAO userInfDao)
	{
		this.userInfDao = userInfDao;
	}

	public UserInf findByUid(Integer uuid)
	{
		try
		{
			return userInfDao.selectByPrimaryKey(uuid);
		} catch (RuntimeException re)
		{
			throw re;
		}
	}

}
