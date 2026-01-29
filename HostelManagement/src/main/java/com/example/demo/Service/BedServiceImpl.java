package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entity.Bed;
import com.example.demo.Repositary.BedRepositary;

@Service
public class BedServiceImpl implements BedService{

	@Autowired 
	BedRepositary bedRepositary;

	@Override
	public String saveBed(Bed bed) {
		// TODO Auto-generated method stub
		bedRepositary.save(bed);
		return MessageConstant.BED_ADDED_IN_DB;
	}

	@Override
	public Bed getBedById(int id) {
		// TODO Auto-generated method stub
		return bedRepositary.findById(id).get();
	}

	@Override
	public List<Bed> getAllBed() {
		// TODO Auto-generated method stub
		return bedRepositary.findAll();
	}

	@Override 
	public void deleteBedById(int id) {
		// TODO Auto-generated method stub
		bedRepositary.deleteById(id);
	}

	@Override
	public void deleteAllBed() {
		// TODO Auto-generated method stub
		bedRepositary.deleteAll();
	}
	
	
}
