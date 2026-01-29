package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Hostel;

public interface HostelRepositary extends JpaRepository<Hostel, Integer>{

}
