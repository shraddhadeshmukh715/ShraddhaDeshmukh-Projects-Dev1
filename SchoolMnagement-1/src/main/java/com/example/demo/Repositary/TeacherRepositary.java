package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Teacher;

public interface TeacherRepositary extends JpaRepository<Teacher, Integer>{

}
