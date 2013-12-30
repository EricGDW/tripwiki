package com.itucity.tripwiki.identity.dao;


import com.itucity.tripwiki.base.BaseDao;
import com.itucity.tripwiki.identity.model.Admin;


public interface AdminDao extends BaseDao<Admin>{
	
	public Admin getAdminByName(String name);   
}
