package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entities.Application;

public interface ApplicationService {
	
	String saveApplication(Application application);
	
	Application getApplicationById(int id);
	
	List<Application> getAllApplication(Application application);
	
	void deleteApplicationById(int id);
	
	void deleteAllApplication(Application application);
}
