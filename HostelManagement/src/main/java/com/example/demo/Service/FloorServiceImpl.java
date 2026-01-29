package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entity.Floor;
import com.example.demo.Repositary.FloorRepositary;

@Service
public class FloorServiceImpl implements FloorService{

	@Autowired
	FloorRepositary floorRepositary;

	@Override
	public String saveFloor(Floor floor) {
		// TODO Auto-generated method stub
		floorRepositary.save(floor);
		return MessageConstant.FLOOR_ADDED_IN_DB;
	}

	@Override
	public Floor getFloorById(int id) {
		// TODO Auto-generated method stub
		return floorRepositary.findById(id).get();
	}

	@Override
	public List<Floor> getAllFloor() {
		// TODO Auto-generated method stub
		return floorRepositary.findAll();
	}

	@Override
	public void deleteFloorById(int id) {
		// TODO Auto-generated method stub
		floorRepositary.deleteById(id);
	}

	@Override
	public void deleteByAll() {
		// TODO Auto-generated method stub
		floorRepositary.deleteAll();
	}
	
	
}
