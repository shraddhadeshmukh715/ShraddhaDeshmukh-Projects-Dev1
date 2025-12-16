package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Staff;

public interface StaffService {

	void saveStaff(Staff staff);
	
	List<Staff> getAllStaff();
	
	Staff getStaffById(int id);
	
	void deleteStaff(int id);
}
