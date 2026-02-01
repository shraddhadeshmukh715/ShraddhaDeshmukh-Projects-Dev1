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
import com.example.demo.Entities.Company;
import com.example.demo.Service.CompanyService;

@RestController
@RequestMapping("company")
public class CompanyController {

	@Autowired
	CompanyService companyService;
	
	@PostMapping("/add")
	String addCompany(@RequestBody Company company)
	{
		companyService.saveCompany(company);
		return MessageConstant.COMPANY_ADDED_IN_DATABASE;
	}
	
	@GetMapping("/get/{id}")
	Company getByID(@PathVariable int id)
	{
		return companyService.getCompanyById(id);
	}
	
	@GetMapping("/get")
	List<Company> getAll(@RequestBody Company company )
	{
		return companyService.getAllCompany(company);
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(@PathVariable int id)
	{
		companyService.deleteCompanyById(id);
		return MessageConstant.STUDENT_DELETED_FROM_DATABASE;
	}
	
	@DeleteMapping("/delete")
	String deleteAll(@RequestBody Company company)
	{
		companyService.deleteAllCompany(company);
		return MessageConstant.ALL_COMPANIES_DELETED_FROM_DATABASE;
	}
}
