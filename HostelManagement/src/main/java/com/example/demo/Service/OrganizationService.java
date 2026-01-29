package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Organization;

public interface OrganizationService {

	void saveOrganization(Organization organization); 
	
	List<Organization> getAllOrganization();
	
	Organization getOrganizationById(int id);
	
	void deleteOrganizationById(int id);
	
	void deleteAllOrganization();
}
