package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entity.Menus;
import com.example.demo.Service.MenuService;

@RestController
@RequestMapping("menu")
public class MenuController {

	@Autowired
	MenuService menuService;
	
	@PostMapping("/add")
	String addMenu(@RequestBody Menus menus)
	{
		menuService.saveMenu(menus);
		return MessageConstant.MENU_ADDED_IN_DATABASE;
	}
	
	@GetMapping("/get/{id}")
	Menus getById(@PathVariable int id)
	{
		return menuService.getMenuById(id);
	}
	
	@GetMapping("/get")
	List<Menus> getAll()
	{
		return menuService.getAllMenu();
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(@PathVariable int id)
	{
		return MessageConstant.MENU_DELETED_FROM_DATABASE;
	}
	
	@DeleteMapping("/delete")
	String deleteAll()
	{
		return MessageConstant.ALL_MENUS_DELETED_FROM_DATABASE;
	}
	
}
