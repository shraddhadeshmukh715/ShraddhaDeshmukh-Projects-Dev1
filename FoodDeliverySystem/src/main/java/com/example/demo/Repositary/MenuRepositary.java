package com.example.demo.Repositary;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Menus;

public interface MenuRepositary extends JpaRepository<Menus, Integer>{

}
