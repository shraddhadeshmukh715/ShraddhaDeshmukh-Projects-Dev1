package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Application;

public interface ApplicationRepositary extends JpaRepository<Application, Integer>{

}
