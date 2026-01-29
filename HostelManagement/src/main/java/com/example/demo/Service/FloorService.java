package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Floor;

public interface FloorService {

	String saveFloor(Floor floor);
	
	Floor getFloorById(int id);
	
	List<Floor> getAllFloor();
	
	void deleteFloorById(int id);
	
	void deleteByAll();
}
