package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.User;

public interface UserService {

	String saveUser(User user);
	
	User getUserById(int id);
	
	List<User> getAllUser();
	
	void deleteUSerById(int id);
	
	void deleteAllUser();
}
