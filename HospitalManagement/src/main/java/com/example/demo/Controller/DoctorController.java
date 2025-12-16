package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Doctor;
import com.example.demo.Service.DoctorService;

@RestController
@RequestMapping("doctor")
public class DoctorController {

	@Autowired
	DoctorService doctorService;
	
	@PostMapping("/add")
	public String saveDoctor(@RequestBody Doctor doctor)
	{
		doctorService.saveDoctor(doctor);
		return "Doctor save in Database";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDoctor(@PathVariable int id)
	{
		doctorService.deleteDoctor(id);
		return "Doctor Deleted";
	}
	
	@GetMapping("/get/{id}")
	public Doctor getDoctor(@PathVariable int id)
	{
		Doctor doctor = doctorService.getDoctor(id);
		return doctor;
	}
}
