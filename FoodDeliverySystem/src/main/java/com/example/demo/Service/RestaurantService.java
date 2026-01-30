package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Restaurant;


public interface RestaurantService {
	
	String saveRestaurant(Restaurant restaurant);
	
	List<Restaurant> getAllRestaurant();
	
	Restaurant getRestaurantById(int id);
	
	void deleteById(int id);
	
	void deleteAllRestaurant();
}
