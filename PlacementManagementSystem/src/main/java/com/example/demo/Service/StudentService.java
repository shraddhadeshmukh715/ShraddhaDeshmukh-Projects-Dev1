package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entities.Student;

public interface StudentService {

	String saveStudent(Student student);
	
	Student getStudentById(int id);
	
	List<Student> getAllStudent(Student student);
	
	void deleteStudentById(int id);
	
	void deleteAllStudent(Student student);
}
