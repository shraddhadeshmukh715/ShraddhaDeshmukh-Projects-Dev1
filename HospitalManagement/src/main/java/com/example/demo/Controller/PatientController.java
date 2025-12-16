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
import com.example.demo.Entity.Patient;
import com.example.demo.Service.DoctorService;
import com.example.demo.Service.PatientService;

@RestController
@RequestMapping("patient")
public class PatientController {

	@Autowired
	PatientService patientService;
	
	@PostMapping("/add")
	public String savePatient(@RequestBody Patient patient)
	{
		patientService.savePatient(patient);
		return "Patient save in Database";
	}
	
	@DeleteMapping("/delete/{name}")
	public String deletePatient(@PathVariable String name)
	{
		patientService.deletePatient(name);
		return "Patient Deleted";
	}
	
	@GetMapping("/get/{name}")
	public Patient getPatient(@PathVariable String name)
	{
		Patient patient = patientService.getPatient(name);
		return patient;
	}

}
