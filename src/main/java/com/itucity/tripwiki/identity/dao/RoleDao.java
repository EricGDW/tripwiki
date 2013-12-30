package com.itucity.tripwiki.identity.dao;

import java.util.List;

import com.itucity.tripwiki.identity.model.Role;


public interface RoleDao {
	
	public Role getRole(Integer role);  
	
    public List<Role> getAllRole();  
    
    public int insertRole(Role role);  
    
    public int updateRole(Role role); 
    
    public int deleteRole(Integer id); 

}
