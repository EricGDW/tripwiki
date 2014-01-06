package com.itucity.tripwiki.base;

import java.util.List;


public interface BaseDao<T extends BaseModel> {

	abstract int save(T t);
	
	abstract int delete(Integer id); 
	
	abstract int update(T t);
	
	abstract T query(Integer id);
	
	abstract List<T> queryAll();
}
