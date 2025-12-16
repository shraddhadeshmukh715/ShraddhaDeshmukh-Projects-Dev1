package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Doctor;

public interface DoctorRepositary extends JpaRepository<Doctor, Integer>{
	
}

/***
 * JpaRepositary is am interface which provides the some abstract method like save, delete, add, get
**/