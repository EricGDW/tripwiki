package com.itucity.tripwiki.identity.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itucity.tripwiki.identity.mapper.PrivilegeDao;
import com.itucity.tripwiki.identity.model.Privilege;

@Transactional
@Service
public class PrivilegeService {

	@Resource  
    private PrivilegeDao privilegeDao;  
      
    public PrivilegeDao getPrivilegeDao() {  
        return privilegeDao;  
    }  
      
    public void setPrivilegeDao(PrivilegeDao privilegeDao) {  
        this.privilegeDao = privilegeDao;  
    }  
  
    public Privilege getPrivilege(Integer privilegeId) {  
        return privilegeDao.getPrivilege(privilegeId);  
    }  
  
    public List<Privilege> getAllPrivilege() {  
        return privilegeDao.getAllPrivilege();  
    }  
  
    //表明该方法需要事务  
    @Transactional  
    public int insertPrivilege(Privilege privilege) {  
        return privilegeDao.insertPrivilege(privilege);  
    }  
  
    @Transactional  
    public int updatePrivilege(Privilege privilege) {  
        // TODO Auto-generated method stub  
    	return privilegeDao.updatePrivilege(privilege);

    }  
  
    @Transactional  
    public int deletePrivilege(Integer privilegeId) {  
        // TODO Auto-generated method stub  
        return privilegeDao.deletePrivilege(privilegeId);  
    }  
    
}
