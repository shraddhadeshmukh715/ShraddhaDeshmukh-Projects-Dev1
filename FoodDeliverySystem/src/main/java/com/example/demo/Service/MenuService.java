package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Menus;

public interface MenuService {

	String saveMenu(Menus menus);
	
	List<Menus> getAllMenu();
	
	Menus getMenuById(int id);
	
	void deleteMenuById(int id);
	
	void deleteAllMenu();

	List<Menus> getAllMenus();
}
