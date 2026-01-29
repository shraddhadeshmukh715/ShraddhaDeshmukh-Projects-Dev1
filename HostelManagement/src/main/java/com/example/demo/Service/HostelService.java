package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Hostel;

public interface HostelService {

	String saveHostel(Hostel hostel);
	
	Hostel getHostelByID(int id);
	
	List<Hostel> getAllHostel();
	
	void deleteHostelById(int id);
	
	void deleteAllHostel();
}
