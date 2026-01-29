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
import com.example.demo.Entity.Hostel;
import com.example.demo.Service.HostelService;

@RestController
@RequestMapping("hostel")
public class HostelController {

	@Autowired
	HostelService hostelService;
	
	@PostMapping("add")
	public String addHostel(@RequestBody Hostel hostel)
	{
		hostelService.saveHostel(hostel);
		return MessageConstant.HOSTEL_ADDED_IN_DB;
	}
	
	@GetMapping("/get/{id}")
	Hostel getById(@PathVariable int id)
	{
		return hostelService.getHostelByID(id);
	}
	
	@GetMapping("/get")
	public List<Hostel> getAll()
	{
		return hostelService.getAllHostel();
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(@PathVariable int id)
	{
		hostelService.deleteHostelById(id);
		return MessageConstant.HOSTEL_DELETED_FROM_DB;
	}
	
	@DeleteMapping("/delete")
	String deleteAll()
	{
		hostelService.deleteAllHostel();
		return MessageConstant.ALL_HOSTELS_DELETED_FROM_DB;
	}
	
}
