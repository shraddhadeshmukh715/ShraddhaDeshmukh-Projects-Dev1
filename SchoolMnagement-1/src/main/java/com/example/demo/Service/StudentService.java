package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Student;

public interface StudentService {

	void saveStudent(Student student);
	
	List<Student> getAllStudents();
	
	Student getStudentById(Integer id);
	
	// delete All method then implement impl and service
	
	void deleteStudent(Integer id);
	
}
