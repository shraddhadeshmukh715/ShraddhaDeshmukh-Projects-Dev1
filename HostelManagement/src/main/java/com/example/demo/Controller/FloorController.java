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
import com.example.demo.Entity.Floor;
import com.example.demo.Service.FloorService;

@RestController
@RequestMapping("floor")
public class FloorController {

	@Autowired
	FloorService floorService;
	
	@PostMapping("/add")
	public String addFloor(@RequestBody Floor floor)
	{
		floorService.saveFloor(floor);
		return MessageConstant.FLOOR_ADDED_IN_DB;
	}
	
	@GetMapping("/get/{id}")
	Floor getById(@PathVariable int id)
	{
		return floorService.getFloorById(id);
	}
	
	@GetMapping("/get")
	List<Floor> getAll()
	{
		return floorService.getAllFloor();
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(@PathVariable int id)
	{
		floorService.deleteFloorById(id);
		return MessageConstant.FLOOR_DELETED_FROM_DB;
	}
	 
	@DeleteMapping("/delete")
	String  delteAll()
	{
		floorService.deleteByAll();
		return MessageConstant.ALL_FLOORS_DELETED_FROM_DB;
	}
	
}
