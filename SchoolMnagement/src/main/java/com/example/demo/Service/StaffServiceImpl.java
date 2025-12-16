package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Staff;
import com.example.demo.Repositary.StaffRepositary;

@Service
public class StaffServiceImpl implements StaffService{

	@Autowired
	StaffRepositary staffRepositary;
	
	@Override
	public void saveStaff(Staff staff) {
		// TODO Auto-generated method stub
		staffRepositary.save(staff);
	}

	@Override
	public void deleteStaff(int id) {
		// TODO Auto-generated method stub
		staffRepositary.deleteById(id);
	}

	@Override
	public Staff getStaff(int id) {
		// TODO Auto-generated method stub
	Staff staff = staffRepositary.findById(id).get();
		return staff;
	}

}
