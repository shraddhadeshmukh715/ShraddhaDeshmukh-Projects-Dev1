package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Organization;
import com.example.demo.Repositary.OrganizationRepositary;

@Service
public class OrganizationServiceImpl implements OrganizationService{

	@Autowired
	OrganizationRepositary organizationRepositary;

	@Override
	public void saveOrganization(Organization organization) {
		// TODO Auto-generated method stub
		organizationRepositary.save(organization);
		
	}

	@Override
	public List<Organization> getAllOrganization() {
		// TODO Auto-generated method stub
		return organizationRepositary.findAll();
	}

	@Override
	public Organization getOrganizationById(int id) {
		// TODO Auto-generated method stub
		return organizationRepositary.findById(null).get();
	}

	@Override
	public void deleteOrganizationById(int id) {
		// TODO Auto-generated method stub
		organizationRepositary.deleteById(id);
	}

	@Override
	public void deleteAllOrganization() {
		// TODO Auto-generated method stub
		 organizationRepositary.deleteAll();
	}
	
	
}
