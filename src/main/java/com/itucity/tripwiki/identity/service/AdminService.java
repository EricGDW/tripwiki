package com.itucity.tripwiki.identity.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itucity.tripwiki.identity.dao.AdminDao;
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
  
    public Admin getAdmin(Integer adminId) {  
        return adminDao.query(adminId);  
    }  
  
    public List<Admin> getAllAdmin() {  
        return adminDao.queryAll();  
    }  
  
    //表明该方法需要事务  
    @Transactional  
    public int insertAdmin(Admin admin) {  
        return adminDao.save(admin);  
    }  
  
    @Transactional  
    public int updateAdmin(Admin admin) {  
        // TODO Auto-generated method stub  
    	return adminDao.update(admin);

    }  
  
    @Transactional  
    public int deleteAdmin(Integer adminId) {  
        // TODO Auto-generated method stub  
        return adminDao.delete(adminId);  
    }  
}
