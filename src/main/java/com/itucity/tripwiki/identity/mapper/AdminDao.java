package com.itucity.tripwiki.identity.mapper;

import java.util.List;

import com.itucity.tripwiki.identity.model.Admin;


public interface AdminDao {
	
	public Admin getAdmin(String id);  
	
    public List<Admin> getAllAdmin();  
    
    public int insertAdmin(Admin admin);  
    
    public int updateAdmin(Admin admin); 
    
    public int deleteAdmin(String id); 
}
