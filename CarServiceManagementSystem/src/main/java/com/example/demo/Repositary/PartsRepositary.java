package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Parts;

public interface PartsRepositary extends JpaRepository<Parts, Integer>{

}
