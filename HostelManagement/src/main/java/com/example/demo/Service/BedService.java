package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Bed;

public interface BedService {

	String saveBed(Bed bed);
	
	Bed getBedById(int id);
	
	List<Bed> getAllBed();
	
	void deleteBedById(int id);
	
	void deleteAllBed();
}
