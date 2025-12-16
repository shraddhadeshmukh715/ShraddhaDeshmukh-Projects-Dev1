package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Doctor;
import com.example.demo.Entity.Patient;
import com.example.demo.Repositary.DoctorRepositary;
import com.example.demo.Repositary.PatientRepositary;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	PatientRepositary patientRepositary;
	
	@Override
	public void savePatient(Patient patient) {
		// TODO Auto-generated method stub
		patientRepositary.save(patient);
		
	}

	@Override
	public void deletePatient(String name) {
		// TODO Auto-generated method stub
		patientRepositary.deleteById(name);
	}

	@Override
	public Patient getPatient(String name) {
		// TODO Auto-generated method stub
		
		//Optional<Doctor> optional = doctorRepositary.findById(id);
		//Doctor doctor = optional.get();
		
		return patientRepositary.findById(name).get();
	}
	
}	


