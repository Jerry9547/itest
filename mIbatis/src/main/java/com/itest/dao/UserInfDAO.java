package com.itest.dao;

import com.itest.entity.UserInf;
import com.itest.entity.UserInfExample;
import java.util.List;

public interface UserInfDAO {
	
    void insert(UserInf record);

    int updateByPrimaryKey(UserInf record);

    int updateByPrimaryKeySelective(UserInf record);

    List selectByExample(UserInfExample example);

    UserInf selectByPrimaryKey(Integer uuid);

    int deleteByExample(UserInfExample example);

    int deleteByPrimaryKey(Integer uuid);

    int countByExample(UserInfExample example);

    int updateByExampleSelective(UserInf record, UserInfExample example);

    int updateByExample(UserInf record, UserInfExample example);
    
}