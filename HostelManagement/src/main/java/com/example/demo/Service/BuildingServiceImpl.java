package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entity.Building;
import com.example.demo.Repositary.BuildingRepositary;

@Service
public class BuildingServiceImpl implements BuildingService{

	@Autowired
	BuildingRepositary buildingRepositary;
	
	@Override
	public String saveBuilding(Building building) {
		// TODO Auto-generated method stub
		buildingRepositary.save(building);
		return MessageConstant.BUILDING_ADDED_IN_DB;
	}

	@Override
	public Building getBuildingById(int id) {
		// TODO Auto-generated method stub
		return buildingRepositary.findById(id).get();
	}

	@Override
	public List<Building> getAllBuilding() {
		// TODO Auto-generated method stub
		return buildingRepositary.findAll();
	}

	@Override
	public void deleteBuildingById(int id) {
		// TODO Auto-generated method stub
		buildingRepositary.deleteById(id);
	}

	@Override
	public void deleteAllBuilding() {
		// TODO Auto-generated method stub
		buildingRepositary.deleteAll();
	}

	
	
}
