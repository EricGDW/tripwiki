package com.itucity.tripwiki.base.impl;


import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.itucity.tripwiki.base.BaseDao;
import com.itucity.tripwiki.base.BaseModel;


/**
 * 集合持久层的公用的增，删，改，查类
 * <T> 表示传入实体类
 * @author tango
 * 2013-12-30
 * @version 1.0v
 * @param <T>
 */
public class BaseDaoImpl<T extends BaseModel> extends SqlSessionDaoSupport 
					implements BaseDao<T> {
	/**
	 * 
	 * 获取传过来的泛型类名字
	 * @return
	 */
	public String getClassName(){
		//在父类中得到子类声明的父类的泛型信息  
		ParameterizedType pt = (ParameterizedType) this.getClass().
														getGenericSuperclass();
		Class<T> clazz = (Class) pt.getActualTypeArguments()[0];
		return clazz.getSimpleName().toString().toLowerCase();
	}
	
	
	public int save(T t) {
		return getSqlSession().insert(this.getClassName()+".add", t);
	}
	
	public int delete(Integer id) {
		return getSqlSession().delete(this.getClassName()+".delete", id);
	}

	public int update(T t) {
		return getSqlSession().update(this.getClassName()+".update", t);
	}
	
	public T query(Integer id) {
		return (T) getSqlSession().selectOne(this.getClassName()+".query", id);
	}
	public List<T> queryAll() {
		return getSqlSession().selectList(this.getClassName()+".queryAll");
	}
}

