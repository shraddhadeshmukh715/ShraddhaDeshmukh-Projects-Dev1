package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entities.Car;

public interface CarService {

	String saveCar(Car car);
	
	Car getCarById(int id);
	
	List<Car> getAllCar();
	
	void deleteCarById(int id);
	
	void deleteAllCar();
	
	Car updateCarById(int id);
}
