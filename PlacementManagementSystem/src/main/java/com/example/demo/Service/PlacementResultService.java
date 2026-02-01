package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entities.PlacementResult;

public interface PlacementResultService {

	String savePlacementResult(PlacementResult placementResult);
	
	PlacementResult getPlacementResultById(int id);
	
	List<PlacementResult> getAllPlacementResult(PlacementResult placementResult);
	
	void deletePlacementResultById(int id);
	
	void deleteAllPlacementResult(PlacementResult placementResult);
}
