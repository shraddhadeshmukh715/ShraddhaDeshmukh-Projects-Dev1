package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entities.Company;
import com.example.demo.Repositary.CompanyRepositary;
import com.example.demo.Service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired 
	CompanyRepositary companyRepositary;
	
	@Override
	public String saveCompany(Company company) {
		// TODO Auto-generated method stub
		companyRepositary.save(company);
		return MessageConstant.COMPANY_ADDED_IN_DATABASE;
	}

	@Override
	public Company getCompanyById(int id) {
		// TODO Auto-generated method stub
		return companyRepositary.findById(id).get();
	}

	@Override
	public List<Company> getAllCompany(Company company) {
		// TODO Auto-generated method stub
		return companyRepositary.findAll();
	}

	@Override
	public void deleteCompanyById(int id) {
		// TODO Auto-generated method stub
		companyRepositary.deleteById(id);
	}

	@Override
	public void deleteAllCompany(Company company) {
		// TODO Auto-generated method stub
		companyRepositary.deleteAll();
	}

}
