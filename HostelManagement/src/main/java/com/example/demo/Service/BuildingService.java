package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Building;

public interface BuildingService {

	String saveBuilding(Building building);
	
	Building getBuildingById(int id);
	
	List<Building> getAllBuilding();
	
	void deleteBuildingById(int id);
	
	void deleteAllBuilding();
	
}
