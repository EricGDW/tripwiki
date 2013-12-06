package com.itucity.tripwiki.mybatis.mappers;

import java.util.List;

import com.itucity.tripwiki.mybatis.UserEntity;

public interface UserDao {
	public UserEntity getUser(String userID);  
    public List<UserEntity> getAllUser();  
    public int insertUser(UserEntity user);  
    public int updateUser(UserEntity user);  
    public int deleteUser(String userID);  
}
