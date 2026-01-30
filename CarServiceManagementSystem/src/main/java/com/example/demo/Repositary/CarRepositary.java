package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Car;

public interface CarRepositary extends JpaRepository<Car, Integer>{

	Car updateById(int id);

}
