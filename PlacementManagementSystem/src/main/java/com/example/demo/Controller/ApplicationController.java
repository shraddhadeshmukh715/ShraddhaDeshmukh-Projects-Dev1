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
import com.example.demo.Entities.Application;
import com.example.demo.Service.ApplicationService;

@RestController
@RequestMapping("application")
public class ApplicationController {

	@Autowired
	ApplicationService applicationService;
	
	@PostMapping("/add")
	String addApplication(@RequestBody Application application)
	{
		applicationService.saveApplication(application);
		return MessageConstant.APPLICATION_ADDED_IN_DATABASE;
	}
	
	@GetMapping("/get/{id}")
	Application getById(@PathVariable int  id)
	{
		return applicationService.getApplicationById(id);
	}
	
	@GetMapping("/get")
	List<Application> getAll(@RequestBody Application application)
	{
		return applicationService.getAllApplication(application);
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(@PathVariable int id)
	{
		applicationService.deleteApplicationById(id);
		return MessageConstant.APPLICATION_DELETED_FROM_DATABASE;
	}
	
	@DeleteMapping("/delete")
	String deleteAll(@RequestBody Application application)
	{
		applicationService.deleteAllApplication(application);
		return MessageConstant.ALL_APPLICATIONS_DELETED_FROM_DATABASE;
	}
}
