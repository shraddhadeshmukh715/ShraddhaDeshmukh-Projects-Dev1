package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entities.Car;
import com.example.demo.Entities.Mechanic;
import com.example.demo.Service.CarService;
import com.example.demo.Service.MechanicService;

@RestController
@RequestMapping("mechanic")
public class MechanicController {

	@Autowired
	MechanicService mechanicService;
	
	@PostMapping("/add")
	String addMecanic(@RequestBody Mechanic mechanic)
	{
		mechanicService.saveMechanic(mechanic);
		return MessageConstant.MECHANIC_ADDED_IN_DATABASE;
	}
	
	@GetMapping("/get/{id}")
	Mechanic getById(@PathVariable int id)
	{
		return mechanicService.getMechanicById(id);
	}
	
	@GetMapping("/get")
	List<Mechanic> getAll()
	{
		return mechanicService.getAllMechanic();
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(@PathVariable int id)
	{
		mechanicService.deleteMechanicById(id);
		return MessageConstant.MECHANIC_DELETED_FROM_DATABASE;
	}
	
	@DeleteMapping("/delete")
	String deleteAll()
	{
		mechanicService.deleteAllMechanic();
		return MessageConstant.ALL_MECHANICS_DELETED_FROM_DATABASE;
	}
	
}