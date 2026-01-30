package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entities.Car;
import com.example.demo.Service.CarService;

@RestController
@RequestMapping("car")
public class CarController {

	@Autowired
	CarService carService;
	
	@PostMapping("/add")
	String addCar(@RequestBody Car car)
	{
		carService.saveCar(car);
		return MessageConstant.CAR_ADDED_IN_DATABASE;
	}
	
	@GetMapping("/get/{id}")
	Car getById(@PathVariable int id)
	{
		return carService.getCarById(id);
	}
	
	@GetMapping("/get")
	List<Car> getAll()
	{
		return carService.getAllCar();
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(@PathVariable int id)
	{
		carService.deleteCarById(id);
		return MessageConstant.CAR_DELETED_FROM_DATABASE;
	}
	
	@DeleteMapping("/delete")
	String deleteAll()
	{
		carService.deleteAllCar();
		return MessageConstant.ALL_CARS_DELETED_FROM_DATABASE;
	}
	
	@PutMapping("/update/{id}")
	Car updateByID(@PathVariable int id)
	{
		return carService.updateCarById(id);
		
	}
	
}
