package com.example.demo.Service;

import com.example.demo.Entity.Staff;

public interface StaffService {

	public void saveStaff(Staff staff);
	
	public void deleteStaff(int id);
	
	public Staff getStaff(int id);
}
