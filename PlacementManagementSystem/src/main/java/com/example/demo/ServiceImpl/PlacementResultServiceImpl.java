package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entities.PlacementResult;
import com.example.demo.Repositary.PlacementResultRepositary;
import com.example.demo.Service.PlacementResultService;

@Service
public class PlacementResultServiceImpl implements PlacementResultService{

	@Autowired
	PlacementResultRepositary placementResultRepositary;
	
	@Override
	public String savePlacementResult(PlacementResult placementResult) {
		// TODO Auto-generated method stub
		placementResultRepositary.save(placementResult);
		return MessageConstant.PLACEMENTRESULT_ADDED_IN_DATABASE;
	}

	@Override
	public PlacementResult getPlacementResultById(int id) {
		// TODO Auto-generated method stub
		return placementResultRepositary.findById(id).get();
	}

	@Override
	public List<PlacementResult> getAllPlacementResult(PlacementResult placementResult) {
		// TODO Auto-generated method stub
		return placementResultRepositary.findAll();
	}

	@Override
	public void deletePlacementResultById(int id) {
		// TODO Auto-generated method stub
		placementResultRepositary.deleteById(id);
	}

	@Override
	public void deleteAllPlacementResult(PlacementResult placementResult) {
		// TODO Auto-generated method stub
		placementResultRepositary.deleteAll();
	}

}
