package com.itucity.tripwiki.mybatis;

import junit.framework.Assert;

import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itucity.tripwiki.mybatis.UserEntity;
import com.itucity.tripwiki.mybatis.UserService;

@RunWith(SpringJUnit4ClassRunner.class)  
//因为我们没有启动web工程，所以无法通过web.xml执行执行applicationContext.xml文件了，所以在这里要显示的声明执行。  
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })  
@PropertySource("classpath:db.properties")
public class UserServiceTest extends AbstractJUnit4SpringContextTests{
	@Autowired  
	UserService userService;  
	
	@Test  
    public void insertUserTest(){  
        //ApplicationContext ct =new ClassPathXmlApplicationContext("applicationContext.xml");  
        //UserService userService = (UserService)ct.getBean("userService");  
        try{  
            UserEntity user = new UserEntity();  
            user.setUserID("1");  
            user.setUserPWD("1");  
            user.setUserName("asd");  
            user.setUserBirthday("20120228");  
            user.setUserSalary("15000.26");  
              
            userService.insertUser(user);  
        }catch(Exception e){  
            e.printStackTrace();  
        } 
          
    }  
	
	@Test
	public void getUserTest(){
		UserEntity user = userService.getUser("21");
		Assert.assertEquals("20120228", user.getUserBirthday());
		System.out.println(user.getUserSalary());
	}
}
