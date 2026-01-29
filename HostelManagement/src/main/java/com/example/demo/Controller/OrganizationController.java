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
import com.example.demo.Entity.Organization;
import com.example.demo.Service.OrganizationService;

@RestController
@RequestMapping("organization")
public class OrganizationController {

	@Autowired
	OrganizationService organizationService;
	
	@PostMapping("/add")
	public String addOrganization(@RequestBody Organization organization)
	{
		organizationService.saveOrganization(organization);
		return MessageConstant.ORGANIZATION_ADDED_IN_DB;
	}
	
	@GetMapping("/get")
	public List<Organization> getAllOrganization()
	{
		return organizationService.getAllOrganization();
	}
	
	@GetMapping("/get/{id}")
	Organization getOrganizationById(@PathVariable int id)
	{
		return organizationService.getOrganizationById(id);
	}
	
	@DeleteMapping()
	public String deleteAllOrganization()
	{
		 organizationService.deleteAllOrganization();
		 return MessageConstant.ALL_ORGANIZATIONS_DELETED_FROM_DB;
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteOrganizationById(@PathVariable int id)
	{
		organizationService.deleteOrganizationById(id);
		return MessageConstant.ORGANIZATION_DELETED_FROM_DB;
	}
	
	
}
