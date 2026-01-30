package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entity.Menus;
import com.example.demo.Repositary.MenuRepositary;

@Service
public class MenuServiceImpl implements MenuService{

	@Autowired
	MenuRepositary menuRepositary;
	
	@Override
	public String saveMenu(Menus menu) {
		// TODO Auto-generated method stub
		menuRepositary.save(menu);
		return MessageConstant.MENU_ADDED_IN_DATABASE;
	}

	@Override
	public List<Menus> getAllMenu()
	{
		return menuRepositary.findAll();
	}

	@Override
	public Menus getMenuById(int id) {
		// TODO Auto-generated method stub
		return menuRepositary.findById(id).get();
	}

	@Override
	public void deleteMenuById(int id) {
		// TODO Auto-generated method stub
		menuRepositary.deleteById(id);
	}

	@Override
	public void deleteAllMenu() {
		// TODO Auto-generated method stub
		menuRepositary.deleteAll();
	}

	@Override
	public List<Menus> getAllMenus() {
		// TODO Auto-generated method stub
		return menuRepositary.findAll();
	}


}
