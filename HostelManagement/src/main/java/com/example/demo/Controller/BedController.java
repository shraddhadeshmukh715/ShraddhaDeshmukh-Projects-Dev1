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
import com.example.demo.Entity.Bed;
import com.example.demo.Service.BedService;

@RestController
@RequestMapping("bed")
public class BedController {

	@Autowired 
	BedService bedService;
	
	@PostMapping("/add")
	String addBed(@RequestBody Bed bed)
	{
		bedService.saveBed(bed);
		return MessageConstant.BED_ADDED_IN_DB;
	}
	
	@GetMapping("/get/{id}")
	Bed getById(@PathVariable int id)
	{
		return bedService.getBedById(id);
	}
	
	@GetMapping("/get")
	List<Bed> getAll()
	{
		return bedService.getAllBed();
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(@PathVariable int id)
	{
		bedService.deleteBedById(id);
		return MessageConstant.BED_DELETED_FROM_DB;
	}
	
	@DeleteMapping("/delete")
	String deleteAll()
	{
		bedService.deleteAllBed();
		return MessageConstant.ALL_BEDS_DELETED_FROM_DB;
	}
}
