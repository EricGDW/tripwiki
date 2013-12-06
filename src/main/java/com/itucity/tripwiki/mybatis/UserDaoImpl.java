package com.itucity.tripwiki.mybatis;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.itucity.tripwiki.mybatis.mappers.UserDao;

@Repository 
public class UserDaoImpl implements UserDao{

	@Resource
	private SqlSessionTemplate  sqlSessionTemplate;
	
	public UserDaoImpl() {

	}
	
	public SqlSessionTemplate getSessionFactory() {
		return sqlSessionTemplate;
	}
	 
	@Resource
	public void setSessionFactory(SqlSessionTemplate sessionFactory) {
		 this.sqlSessionTemplate = sessionFactory;
	}
	
	@Override
	public UserEntity getUser(String userID) {
		// TODO Auto-generated method stub
		 return sqlSessionTemplate.selectOne("com.itucity.tripwiki.mybatis.IUserDao.getUser", userID);
	}

	@Override
	public List<UserEntity> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertUser(UserEntity user) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.insert("com.itucity.tripwiki.mybatis.IUserDao.insertUser", user);
		return 0;
	}

	@Override
	public int updateUser(UserEntity user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(String userID) {
		// TODO Auto-generated method stub
		return 0;
	}

}
