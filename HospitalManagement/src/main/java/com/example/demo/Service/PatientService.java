package com.example.demo.Service;

import com.example.demo.Entity.Patient;

public interface PatientService {

	void savePatient(Patient patient);
	
	void  deletePatient(String name);
	
	Patient getPatient(String name);
	
}
