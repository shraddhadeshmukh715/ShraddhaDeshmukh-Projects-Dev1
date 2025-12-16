package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Patient;

public interface PatientRepositary extends JpaRepository<Patient, String>{

	
}
