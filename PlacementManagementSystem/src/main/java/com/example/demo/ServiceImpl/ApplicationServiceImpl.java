package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entities.Application;
import com.example.demo.Repositary.ApplicationRepositary;
import com.example.demo.Service.ApplicationService;

@Service
public class ApplicationServiceImpl implements ApplicationService
{
	@Autowired
	ApplicationRepositary applicationRepositary;
	
	@Override
	public String saveApplication(Application application) {
		// TODO Auto-generated method stub
		applicationRepositary.save(application);
		return MessageConstant.APPLICATION_ADDED_IN_DATABASE;
	}

	@Override
	public Application getApplicationById(int id) {
		// TODO Auto-generated method stub
		return applicationRepositary.findById(id).get();
	}

	@Override
	public List<Application> getAllApplication(Application application) {
		// TODO Auto-generated method stub
		return applicationRepositary.findAll();
	}

	@Override
	public void deleteApplicationById(int id) {
		// TODO Auto-generated method stub
		applicationRepositary.deleteById(id);
	}

	@Override
	public void deleteAllApplication(Application application) {
		// TODO Auto-generated method stub
		applicationRepositary.deleteAll();
	}

}
