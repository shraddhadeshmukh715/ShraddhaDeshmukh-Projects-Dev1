package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Organization;

public interface OrganizationRepositary extends JpaRepository<Organization, Integer>{

}
