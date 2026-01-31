package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entities.Parts;
import com.example.demo.Repositary.PartsRepositary;
import com.example.demo.Service.PartsService;

@Service
public class PartsServiceImpl implements PartsService{

	@Autowired
	PartsRepositary partsRepositary;
	
	@Override
	public String saveParts(Parts parts) {
		// TODO Auto-generated method stub
		partsRepositary.save(parts);
		return MessageConstant.PART_ADDED_IN_DATABASE;
	}

	@Override
	public Parts getPartsById(int id) {
		// TODO Auto-generated method stub
		return partsRepositary.findById(id).get();
	}

	@Override
	public List<Parts> getAllParts() {
		// TODO Auto-generated method stub
		return partsRepositary.findAll();
	}

	@Override
	public void deletePartsById(int id) {
		// TODO Auto-generated method stub
		partsRepositary.deleteById(id);
	}

	@Override
	public void deleteAllParts() {
		// TODO Auto-generated method stub
		partsRepositary.deleteAll();
	}

}
