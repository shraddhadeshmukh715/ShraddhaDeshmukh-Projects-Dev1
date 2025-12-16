package com.example.demo.Service;

import com.example.demo.Entity.Student;

public interface StudentService {

	public void saveStudent(Student student);
	
	public void deleteStudent(int id);
	
	public Student getStudent(int id);
}
