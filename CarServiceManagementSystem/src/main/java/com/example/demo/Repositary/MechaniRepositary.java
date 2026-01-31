package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Mechanic;

public interface MechaniRepositary extends JpaRepository<Mechanic, Integer>{

}
