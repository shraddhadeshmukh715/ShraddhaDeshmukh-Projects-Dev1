package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entities.Car;
import com.example.demo.Repositary.CarRepositary;
import com.example.demo.Service.CarService;

@Service
public class CarServiceImpl implements CarService{

	@Autowired
	CarRepositary carRepositary;

	@Override
	public String saveCar(Car car) {
		// TODO Auto-generated method stub
		carRepositary.save(car);
		return MessageConstant.CAR_ADDED_IN_DATABASE;
	}

	@Override
	public Car getCarById(int id) {
		// TODO Auto-generated method stub
		return carRepositary.findById(id).get();
	}

	@Override
	public List<Car> getAllCar() {
		// TODO Auto-generated method stub
		return carRepositary.findAll();	
	}

	@Override
	public void deleteCarById(int id) {
		// TODO Auto-generated method stub
		carRepositary.deleteById(id);
	}

	@Override
	public void deleteAllCar() {
		// TODO Auto-generated method stub
		carRepositary.deleteAll();
	}
	
}