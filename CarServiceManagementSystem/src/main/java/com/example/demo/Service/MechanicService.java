package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entities.Mechanic;

public interface MechanicService {

	String saveMechanic(Mechanic mechanic);
	
	Mechanic getMechanicById(int id);
	
	List<Mechanic> getAllMechanic();
	
	void deleteMechanicById(int id);
	
	void deleteAllMechanic();
}

