
package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entities.Parts;

public interface PartsService {

	String saveParts(Parts parts);
	
	Parts getPartsById(int id);
	
	List<Parts> getAllParts();
	
	void deletePartsById(int id);
	
	void deleteAllParts();
}
