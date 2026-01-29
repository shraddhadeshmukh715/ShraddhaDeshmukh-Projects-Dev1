
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
import com.example.demo.Entity.Restaurant;
import com.example.demo.Service.RestaurantService;

@RestController
@RequestMapping("restaurant")
public class RestaurantController {

	@Autowired
	RestaurantService restaurantService;
	
	@PostMapping("/add")
	String saveOrder(@RequestBody Restaurant restaurant)
	{
		restaurantService.saveRestaurant(restaurant);
		return MessageConstant.RESTAURANT_ADDED_IN_DATABASE;
	}
	
	@GetMapping("/get/{id}")
	Restaurant getById(@PathVariable int id)
	{
		return restaurantService.getRestaurantById(id);
	}
	
	@GetMapping("/get")
	List<Restaurant> getAll()
	{
		return restaurantService.getAllRestaurant();
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(int id)
	{
		restaurantService.deleteById(id);
		return MessageConstant.RESTAURANT_DELETED_FROM_DATABASE;
	}
	
	@DeleteMapping("/delete")
	String deleteAll()
	{
		restaurantService.deleteAllRestaurant();
		return MessageConstant.ALL_RESTAURANTS_DELETED_FROM_DATABASE;
	}
	
}
