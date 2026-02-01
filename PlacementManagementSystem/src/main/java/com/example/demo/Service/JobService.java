package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entities.Job;

public interface JobService {

	String saveJob(Job job);
	
	Job getJobById(int id);
	
	List<Job> getAllJob(Job job);
	
	void deleteJobById(int id);
	
	void deleteAllJob(Job job);
}
