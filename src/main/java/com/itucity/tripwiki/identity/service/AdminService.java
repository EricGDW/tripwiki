package com.itucity.tripwiki.identity.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itucity.tripwiki.identity.mapper.AdminDao;
import com.itucity.tripwiki.identity.model.Admin;


@Transactional
@Service
public class AdminService {

	@Resource  
    private AdminDao adminDao;  
      
    public AdminDao getAdminDao() {  
        return adminDao;  
    }  
      
    public void setAdminDao(AdminDao adminDao) {  
        this.adminDao = adminDao;  
    }  
  
    public Admin getAdmin(String adminId) {  
        return adminDao.getAdmin(adminId);  
    }  
  
    public List<Admin> getAllAdmin() {  
        return adminDao.getAllAdmin();  
    }  
  
    //表明该方法需要事务  
    @Transactional  
    public int insertAdmin(Admin admin) {  
        return adminDao.insertAdmin(admin);  
    }  
  
    @Transactional  
    public int updateAdmin(Admin admin) {  
        // TODO Auto-generated method stub  
    	return adminDao.updateAdmin(admin);

    }  
  
    @Transactional  
    public int deleteAdmin(String adminId) {  
        // TODO Auto-generated method stub  
        return adminDao.deleteAdmin(adminId);  
    }  
}
