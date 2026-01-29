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
import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired 
	UserService userService;
	
	@PostMapping("/add")
	String addUser(@RequestBody User user)
	{
		userService.saveUser(user);
		return MessageConstant.USER_ADDED_IN_DB;
	}
	
	@GetMapping("/get/{id}")
	User getByID(@PathVariable int id)
	{
		return userService.getUserById(id);
	}
	
	@GetMapping("/get")
	List<User> getByAll()
	{
		return userService.getAllUser();
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(@PathVariable int id)
	{
		userService.deleteUSerById(id);
		return MessageConstant.USER_DELETED_FROM_DB;
	}
	
	@DeleteMapping("/delete")
	String deleteAll()
	{
		userService.deleteAllUser();
		return MessageConstant.ALL_USERS_DELETED_FROM_DB;
	}
}
