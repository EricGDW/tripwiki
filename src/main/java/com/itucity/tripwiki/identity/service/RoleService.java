package com.itucity.tripwiki.identity.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itucity.tripwiki.identity.dao.RoleDao;
import com.itucity.tripwiki.identity.model.Role;

@Transactional
@Service
public class RoleService {

	@Resource  
    private RoleDao roleDao;  
      
    public RoleDao getRoleDao() {  
        return roleDao;  
    }  
      
    public void setRoleDao(RoleDao roleDao) {  
        this.roleDao = roleDao;  
    }  
  
    public Role getRole(Integer roleId) {  
        return roleDao.getRole(roleId);  
    }  
  
    public List<Role> getAllRole() {  
        return roleDao.getAllRole();  
    }  
  
    //表明该方法需要事务  
    @Transactional  
    public int insertRole(Role role) {  
        return roleDao.insertRole(role);  
    }  
  
    @Transactional  
    public int updateRole(Role role) {  
        // TODO Auto-generated method stub  
    	return roleDao.updateRole(role);

    }  
  
    @Transactional  
    public int deleteRole(Integer roleId) {  
        // TODO Auto-generated method stub  
        return roleDao.deleteRole(roleId);  
    }  
    
}
