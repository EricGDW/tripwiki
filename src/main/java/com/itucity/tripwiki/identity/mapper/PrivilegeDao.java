package com.itucity.tripwiki.identity.mapper;

import java.util.List;

import com.itucity.tripwiki.identity.model.Privilege;


public interface PrivilegeDao {
	
	public Privilege getPrivilege(Integer privilege);  
	
    public List<Privilege> getAllPrivilege();  
    
    public int insertPrivilege(Privilege privilege);  
    
    public int updatePrivilege(Privilege privilege); 
    
    public int deletePrivilege(Integer id);
}
