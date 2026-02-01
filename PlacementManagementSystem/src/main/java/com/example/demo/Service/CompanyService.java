package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entities.Company;

public interface CompanyService {

	String saveCompany(Company company);
	
	Company getCompanyById(int id);
	
	List<Company> getAllCompany(Company company);
	
	void deleteCompanyById(int id);
	
	void deleteAllCompany(Company company);
}
