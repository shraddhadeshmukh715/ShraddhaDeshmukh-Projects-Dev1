package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entities.Job;
import com.example.demo.Service.JobService;

@RestController
@RequestMapping("job")
public class JobController {

	@Autowired
	JobService jobService;
	
	@PostMapping("/add")
	String addJob(@RequestBody Job job)
	{
		jobService.saveJob(job);
		return MessageConstant.JOB_ADDED_IN_DATABASE;
	}
	
	@GetMapping("/get/{id}")
	Job getByID(@PathVariable int id)
	{
		return jobService.getJobById(id);
	}
	
	@GetMapping("/get")
	List<Job> getAll(@RequestBody Job job)
	{
		return jobService.getAllJob(job);
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(@PathVariable int id)
	{
		jobService.deleteJobById(id);
		return MessageConstant.JOB_DELETED_FROM_DATABASE;
	}
	
	@DeleteMapping("/delete")
	String deleteAll(@RequestBody Job job)
	{
		jobService.deleteAllJob(job);
		return MessageConstant.ALL_JOBS_DELETED_FROM_DATABASE;
	}
}
