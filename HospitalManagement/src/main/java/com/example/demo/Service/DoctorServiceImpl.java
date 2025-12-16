package com.example.demo.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Doctor;
import com.example.demo.Repositary.DoctorRepositary;

@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	DoctorRepositary doctorRepositary;
	
	@Override
	public void saveDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorRepositary.save(doctor);
		
	}

	@Override
	public void deleteDoctor(int id) {
		// TODO Auto-generated method stub
		doctorRepositary.deleteById(id);
	}

	@Override
	public Doctor getDoctor(int id) {
		// TODO Auto-generated method stub
		
		//Optional<Doctor> optional = doctorRepositary.findById(id);
		//Doctor doctor = optional.get();
		
		return doctorRepositary.findById(id).get();
		
	}

}
