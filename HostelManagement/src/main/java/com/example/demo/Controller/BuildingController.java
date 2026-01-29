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
import com.example.demo.Entity.Building;
import com.example.demo.Service.BuildingService;

@RestController
@RequestMapping("building")
public class BuildingController {

	@Autowired
	BuildingService buildingService;
	
	@PostMapping("/add")
	public String addBuilding(@RequestBody Building building)
	{
		buildingService.saveBuilding(building);
		return MessageConstant.BUILDING_ADDED_IN_DB;
	}
	
	@GetMapping("/get/{id}")
	Building getById(@PathVariable int id)
	{
		return buildingService.getBuildingById(id);
	}
	
	@GetMapping("/get")
	List<Building> getAll()
	{
		return buildingService.getAllBuilding();
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(@PathVariable int id)
	{
		buildingService.deleteBuildingById(id);
		return MessageConstant.BUILDING_DELETED_FROM_DB;
	}
	
	@DeleteMapping("/delete")
	String deleteAll()
	{
		buildingService.deleteAllBuilding();
		return MessageConstant.ALL_BUILDINGS_DELETED_FROM_DB;
	}
}
