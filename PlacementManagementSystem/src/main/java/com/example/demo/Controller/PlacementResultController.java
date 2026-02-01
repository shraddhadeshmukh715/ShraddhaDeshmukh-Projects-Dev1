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
import com.example.demo.Entities.PlacementResult;
import com.example.demo.Service.PlacementResultService;

@RestController
@RequestMapping("placementResult")
public class PlacementResultController {

	@Autowired
	PlacementResultService placementResultService;
	
	@PostMapping("/add")
	String addPlacementResult(@RequestBody PlacementResult placementResult)
	{
		placementResultService.savePlacementResult(placementResult);
		return MessageConstant.PLACEMENTRESULT_ADDED_IN_DATABASE;
	}
	
	@GetMapping("/get/{id}")
	PlacementResult getById(@PathVariable int  id)
	{
		return placementResultService.getPlacementResultById(id);
	}
	
	@GetMapping("/get")
	List<PlacementResult> getAll(@RequestBody PlacementResult placementResult)
	{
		return placementResultService.getAllPlacementResult(placementResult);
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(@PathVariable int id)
	{
		placementResultService.deletePlacementResultById(id);
		return MessageConstant.PLACEMENTRESULT_DELETED_FROM_DATABASE;
	}
	
	@DeleteMapping("/delete")
	String deleteAll(@RequestBody PlacementResult placementResult)
	{
		placementResultService.deleteAllPlacementResult(placementResult);
		return MessageConstant.All_PLACEMENTRESULTS_DELETED_FROM_DATABASE;
	}
}
