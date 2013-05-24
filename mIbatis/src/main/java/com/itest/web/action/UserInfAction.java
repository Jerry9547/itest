package com.itest.web.action;

import net.sf.json.JSONObject;

import com.itest.entity.UserInf;
import com.itest.util.JsonUtil;

public class UserInfAction extends BaseAction
{

	private static final long serialVersionUID = -217311559922456071L;
	
	private Integer ud;
	
	public Integer getUd()
	{
		return ud;
	}

	public void setUd(Integer ud)
	{
		this.ud = ud;
	}

	public String getUserById(){
		try
		{
			if (ud != null && ud > 1)
			{
				UserInf user = userInfService.findByUid(ud);
				if (user == null)
				{
					System.out.println("user is null");
					this.writeJson("user is null", true);
				}
				JSONObject js = new JSONObject();
				js.put("user", user);//JsonUtil.bean2json(user)
				this.writeCorrectJson(js.toString(), true);
			}else{
				System.out.println("param error");
				this.writeJson("request fail , plase check you request param !", true);
			}
		} catch (Exception e)
		{
			e.printStackTrace();
			this.writeJson("Service Exception", true);
		}
		return NONE;
	}

}
