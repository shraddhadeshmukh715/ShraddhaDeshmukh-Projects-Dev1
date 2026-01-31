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
import com.example.demo.Entities.Parts;
import com.example.demo.Service.PartsService;

@RestController
@RequestMapping("parts")
public class PartsController {

	@Autowired
	PartsService partsService;
	
	@PostMapping("/add")
	String addPart(@RequestBody Parts parts)
	{
		partsService.saveParts(parts);
		return MessageConstant.PART_ADDED_IN_DATABASE;
	}
	
	@GetMapping("/get/{id}")
	Parts getById(@PathVariable int id)
	{
		return partsService.getPartsById(id);
	}
	
	@GetMapping("/get")
	List<Parts> getAll()
	{
		return partsService.getAllParts();
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(@PathVariable int id)
	{
		partsService.deletePartsById(id);
		return MessageConstant.PART_DELETED_FROM_DATABASE;
	}
	
	@DeleteMapping("/delete")
	String deleteAll()
	{
		partsService.deleteAllParts();
		return MessageConstant.ALL_PARTS_DELETED_FROM_DATABASE;
	}
	
}	
	
