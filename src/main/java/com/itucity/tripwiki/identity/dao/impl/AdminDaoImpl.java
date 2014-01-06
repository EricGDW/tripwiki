package com.itucity.tripwiki.identity.dao.impl;

import org.springframework.stereotype.Repository;

import com.itucity.tripwiki.base.impl.BaseDaoImpl;
import com.itucity.tripwiki.identity.dao.AdminDao;
import com.itucity.tripwiki.identity.model.Admin;

@Repository("adminDao")
public class AdminDaoImpl extends BaseDaoImpl<Admin> implements AdminDao{

	@Override
	public Admin getAdminByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
