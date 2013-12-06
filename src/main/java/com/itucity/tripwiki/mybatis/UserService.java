package com.itucity.tripwiki.mybatis;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itucity.tripwiki.mybatis.mappers.UserDao;

//表明该文件需要事务  
@Transactional  
//表明该文件是一个Service  
@Service
public class UserService {
	// 这个属性由Spring帮我们注入。也就是说我们无需写IUserDao userDao = new IUserDao();,Spring会帮我们new一个的  
    // MyBatis帮我们管理xml与类的映射及Dao，所以我们直接用@Resource进行注入就可以了  
	@Resource  
    private UserDao userDao;  
      
    public UserDao getUserDao() {  
        return userDao;  
    }  
      
    public void setUserDao(UserDao userDao) {  
        this.userDao = userDao;  
    }  
  
    public UserEntity getUser(String userID) {  
        return userDao.getUser(userID);  
    }  
  
    public List<UserEntity> getAllUser() {  
        return userDao.getAllUser();  
    }  
  
    //表明该方法需要事务  
    @Transactional  
    public int insertUser(UserEntity user) {  
        return userDao.insertUser(user);  
    }  
  
    @Transactional  
    public int updateUser(UserEntity user) {  
        // TODO Auto-generated method stub  
    	return userDao.updateUser(user);

    }  
  
    @Transactional  
    public int deleteUser(String userID) {  
        // TODO Auto-generated method stub  
        return userDao.deleteUser(userID);  
    }  
}
