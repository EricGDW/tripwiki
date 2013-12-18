package com.itucity.tripwiki.identity.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itucity.tripwiki.identity.mapper.MenuDao;
import com.itucity.tripwiki.identity.model.Menu;


@Transactional
@Service
public class MenuService {

	@Resource  
    private MenuDao menuDao;  
      
    public MenuDao getMenuDao() {  
        return menuDao;  
    }  
      
    public void setMenuDao(MenuDao menuDao) {  
        this.menuDao = menuDao;  
    }  
  
    public Menu getMenu(Integer menuId) {  
        return menuDao.getMenu(menuId);  
    }  
  
    public List<Menu> getAllMenu() {  
        return menuDao.getAllMenu();  
    }  
  
    //表明该方法需要事务  
    @Transactional  
    public int insertMenu(Menu menu) {  
        return menuDao.insertMenu(menu);  
    }  
  
    @Transactional  
    public int updateMenu(Menu menu) {  
        // TODO Auto-generated method stub  
    	return menuDao.updateMenu(menu);

    }  
  
    @Transactional  
    public int deleteMenu(Integer menuId) {  
        // TODO Auto-generated method stub  
        return menuDao.deleteMenu(menuId);  
    }  
}
