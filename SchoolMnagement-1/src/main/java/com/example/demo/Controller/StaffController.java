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
import com.example.demo.Entity.Staff;
import com.example.demo.Service.StaffService;

@RestController
@RequestMapping("staff")
public class StaffController {

	@Autowired
	StaffService staffService;
	
	@PostMapping("/add")
	public String addStaff(@RequestBody Staff staff)
	{
		staffService.saveStaff(staff);
		return MessageConstant.STAFF_ADDED_IN_DB;
	}
	
	@GetMapping
	public List<Staff> getAllStaff()
	{
		return staffService.getAllStaff();
	}
	
	@GetMapping("/get/{id}")
	Staff getStaffById(@PathVariable int id)
	{
		return staffService.getStaffById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	void deleteStaffById(@PathVariable int id)
	{
		staffService.deleteStaff(id);
	}
}
