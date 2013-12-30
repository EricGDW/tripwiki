package com.itucity.tripwiki.identity.dao;

import java.util.List;

import com.itucity.tripwiki.identity.model.Menu;

public interface MenuDao {
	
	public Menu getMenu(Integer menu);  
	
    public List<Menu> getAllMenu();  
    
    public int insertMenu(Menu menu);  
    
    public int updateMenu(Menu menu); 
    
    public int deleteMenu(Integer id);
    
}
