package com.itest.dao.impl;

import java.io.Reader;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.itest.dao.UserInfDAO;
import com.itest.entity.UserInf;
import com.itest.entity.UserInfExample;

public class UserInfDAOImpl extends BaseDAO implements UserInfDAO {


    public void insert(UserInf record) {
        this.getSqlMapClientTemplate().insert("t_user_info.abatorgenerated_insert", record);
    }

    public int updateByPrimaryKey(UserInf record) {
        int rows = this.getSqlMapClientTemplate().update("t_user_info.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    public int updateByPrimaryKeySelective(UserInf record) {
        int rows = this.getSqlMapClientTemplate().update("t_user_info.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    public List selectByExample(UserInfExample example) {
        List list = this.getSqlMapClientTemplate().queryForList("t_user_info.abatorgenerated_selectByExample", example);
        return list;
    }

    public UserInf selectByPrimaryKey(Integer uuid) {
       try
		{
			 UserInf record = (UserInf)this.getSqlMapClientTemplate().queryForObject("t_user_info.abatorgenerated_selectByPrimaryKey", uuid);
			 return record;
		} catch (Exception e)
		{
			throw new RuntimeException(e);
		}
    }

    public int deleteByExample(UserInfExample example) {
        int rows = this.getSqlMapClientTemplate().delete("t_user_info.abatorgenerated_deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(Integer uuid) {
        UserInf key = new UserInf();
        key.setUuid(uuid);
        int rows = this.getSqlMapClientTemplate().delete("t_user_info.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    public int countByExample(UserInfExample example) {
        Integer count = (Integer) this.getSqlMapClientTemplate().queryForObject("t_user_info.abatorgenerated_countByExample", example);
        return count.intValue();
    }

    public int updateByExampleSelective(UserInf record, UserInfExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("t_user_info.abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(UserInf record, UserInfExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = this.getSqlMapClientTemplate().update("t_user_info.abatorgenerated_updateByExample", parms);
        return rows;
    }

    private static class UpdateByExampleParms extends UserInfExample {
        private Object record;

        public UpdateByExampleParms(Object record, UserInfExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
    
    public static void main(String[] args)
	{
		try
		{
			Reader reader = Resources.getResourceAsReader("conf/sqlmap-config.xml");
			SqlMapClient sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
//			String _user=(String)sqlMap.queryForObject("t_user_info.getAccount", Integer.valueOf(1132002002));
			UserInf _user=(UserInf)sqlMap.queryForObject("t_user_info.abatorgenerated_selectByPrimaryKey", Integer.valueOf(1132002002));
//			Reader reader = Resources.getResourceAsReader("conf/dao.xml");
//			DaoManager _dManager=DaoManagerBuilder.buildDaoManager(reader, null);
//			UserInfDAO userDao = (UserInfDAO) _dManager.getDao(UserInfDAO.class);
//	        UserInf _user=userDao.selectByPrimaryKey(Integer.valueOf(1132002001));
			if (_user != null)
			{
				System.out.println("user====>" + _user.getAccount());
			} else
			{
				System.out.println("user is null");
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}