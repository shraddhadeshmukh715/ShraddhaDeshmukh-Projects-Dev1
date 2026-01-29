package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entity.Hostel;
import com.example.demo.Repositary.HostelRepositary;

@Service
public class HostelServiceImpl implements HostelService{

	@Autowired
	HostelRepositary hostelRepositary;
	
	@Override
	public String  saveHostel(Hostel hostel) {
		// TODO Auto-generated method stub
		hostelRepositary.save(hostel);
		return MessageConstant.HOSTEL_ADDED_IN_DB;
	}

	@Override
	public Hostel getHostelByID(int id) {
		// TODO Auto-generated method stub
		return hostelRepositary.findById(id).get();
	}

	@Override
	public List<Hostel> getAllHostel() {
		// TODO Auto-generated method stub
		return hostelRepositary.findAll();
	}

	@Override
	public void deleteHostelById(int id) {
		// TODO Auto-generated method stub
		hostelRepositary.deleteById(id);
	}

	@Override
	public void deleteAllHostel() {
		// TODO Auto-generated method stub
		hostelRepositary.deleteAll();
	}


}
