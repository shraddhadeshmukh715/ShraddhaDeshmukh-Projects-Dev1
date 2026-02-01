package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Job;

public interface JobRepositary extends JpaRepository<Job, Integer>{

}
