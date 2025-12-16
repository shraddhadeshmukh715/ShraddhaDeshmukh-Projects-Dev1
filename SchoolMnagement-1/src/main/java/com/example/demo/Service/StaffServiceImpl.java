package com.example.demo.Service;

import java.util.List;

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
	public List<Staff> getAllStaff() {
		// TODO Auto-generated method stub
		return staffRepositary.findAll();
	}

	@Override
	public Staff getStaffById(int id) {
		// TODO Auto-generated method stub
		return staffRepositary.findById(id).get();
	}

	@Override
	public void deleteStaff(int id) {
		// TODO Auto-generated method stub
		staffRepositary.deleteById(id);
	}

}
