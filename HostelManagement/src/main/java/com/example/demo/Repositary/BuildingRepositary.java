package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Building;

public interface BuildingRepositary extends JpaRepository<Building, Integer>{

}
