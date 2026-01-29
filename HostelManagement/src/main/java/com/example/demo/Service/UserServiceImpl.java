package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entity.User;
import com.example.demo.Repositary.UserRepositary;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepositary userRepositary;
	
	@Override
	public String saveUser(User user) {
		// TODO Auto-generated method stub
		userRepositary.save(user);
		return MessageConstant.USER_ADDED_IN_DB;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepositary.findById(id).get();
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepositary.findAll();
	}

	@Override
	public void deleteUSerById(int id) {
		// TODO Auto-generated method stub
		userRepositary.deleteById(id);
	}

	@Override
	public void deleteAllUser() {
		// TODO Auto-generated method stub
		userRepositary.deleteAll();
	}

	
}
