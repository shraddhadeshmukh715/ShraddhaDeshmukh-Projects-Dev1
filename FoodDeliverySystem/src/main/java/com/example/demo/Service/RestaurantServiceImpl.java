package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entity.Restaurant;
import com.example.demo.Repositary.RestaurantRepositary;

@Service
public class RestaurantServiceImpl implements RestaurantService{

	@Autowired
	RestaurantRepositary restaurantRepositary;
	
	@Override
	public String saveRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		restaurantRepositary.save(restaurant);
		return MessageConstant.RESTAURANT_ADDED_IN_DATABASE;
	}

	@Override
	public List<Restaurant> getAllRestaurant() {
		// TODO Auto-generated method stub
		return restaurantRepositary.findAll();
	}

	@Override
	public Restaurant getRestaurantById(int id) {
		// TODO Auto-generated method stub
		return restaurantRepositary.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		 restaurantRepositary.deleteById(id);
	}

	@Override
	public void deleteAllRestaurant() {
		// TODO Auto-generated method stub
		restaurantRepositary.deleteAll();
	}

}
