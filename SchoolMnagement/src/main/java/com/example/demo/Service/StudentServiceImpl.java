package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repositary.StudentRepositary;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepositary studentRepositary;
	
	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepositary.save(student);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepositary.deleteById(id);
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
	Student student = studentRepositary.findById(id).get();
		return student;
	}

}
