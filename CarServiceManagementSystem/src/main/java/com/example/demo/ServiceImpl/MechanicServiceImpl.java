package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entities.Mechanic;
import com.example.demo.Repositary.MechaniRepositary;
import com.example.demo.Service.MechanicService;

@Service
public class MechanicServiceImpl implements MechanicService{

	@Autowired
	MechaniRepositary mechaniRepositary;
	
	@Override
	public String saveMechanic(Mechanic mechanic) {
		// TODO Auto-generated method stub
		 mechaniRepositary.save(mechanic);
		return MessageConstant.MECHANIC_ADDED_IN_DATABASE; 
	}

	@Override
	public Mechanic getMechanicById(int id) {
		// TODO Auto-generated method stub
		return mechaniRepositary.findById(id).get();
	}

	@Override
	public List<Mechanic> getAllMechanic() {
		// TODO Auto-generated method stub
		return mechaniRepositary.findAll();
	}

	@Override
	public void deleteMechanicById(int id) {
		// TODO Auto-generated method stub
		mechaniRepositary.deleteById(id);
	}

	@Override
	public void deleteAllMechanic() {
		// TODO Auto-generated method stub
		mechaniRepositary.deleteAll();
	}

}
