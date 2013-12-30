package com.itucity.tripwiki.identity.dao;

import java.util.List;

import com.itucity.tripwiki.identity.model.Resource;


public interface ResourceDao {
	
	public Resource getResource(Integer resource);  
	
    public List<Resource> getAllResource();  
    
    public int insertResource(Resource resource);  
    
    public int updateResource(Resource resource); 
    
    public int deleteResource(Integer id);
}
