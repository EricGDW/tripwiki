package com.itucity.tripwiki.identity.service;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itucity.tripwiki.identity.dao.ResourceDao;
import com.itucity.tripwiki.identity.model.Resource;

@Transactional
@Service
public class ResourceService {

	@Autowired  
    private ResourceDao resourceDao;  
      
    public ResourceDao getResourceDao() {  
        return resourceDao;  
    }  
      
    public void setResourceDao(ResourceDao resourceDao) {  
        this.resourceDao = resourceDao;  
    }  
  
    public Resource getResource(Integer resourceId) {  
        return resourceDao.getResource(resourceId);  
    }  
  
    public List<Resource> getAllResource() {  
        return resourceDao.getAllResource();  
    }  
  
    //表明该方法需要事务  
    @Transactional  
    public int insertResource(Resource resource) {  
        return resourceDao.insertResource(resource);  
    }  
  
    @Transactional  
    public int updateResource(Resource resource) {  
        // TODO Auto-generated method stub  
    	return resourceDao.updateResource(resource);

    }  
  
    @Transactional  
    public int deleteResource(Integer resourceId) {  
        // TODO Auto-generated method stub  
        return resourceDao.deleteResource(resourceId);  
    }  
    
}
