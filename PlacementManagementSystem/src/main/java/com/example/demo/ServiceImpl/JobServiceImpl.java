package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entities.Job;
import com.example.demo.Repositary.JobRepositary;
import com.example.demo.Service.JobService;

@Service
public class JobServiceImpl implements JobService{

	@Autowired
	JobRepositary jobRepositary;
	
	@Override
	public String saveJob(Job job) {
		// TODO Auto-generated method stub
		jobRepositary.save(job);
		return MessageConstant.JOB_ADDED_IN_DATABASE;
	}

	@Override
	public Job getJobById(int id) {
		// TODO Auto-generated method stub
		return jobRepositary.findById(id).get();
	}

	@Override
	public List<Job> getAllJob(Job job) {
		// TODO Auto-generated method stub
		return jobRepositary.findAll();
	}

	@Override
	public void deleteJobById(int id) {
		// TODO Auto-generated method stub
		jobRepositary.deleteById(id);
	}

	@Override
	public void deleteAllJob(Job job) {
		// TODO Auto-generated method stub
		jobRepositary.deleteAll();
	}

}
