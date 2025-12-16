package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Library;

public interface LibraryRepositary extends JpaRepository<Library, Integer>{

}
