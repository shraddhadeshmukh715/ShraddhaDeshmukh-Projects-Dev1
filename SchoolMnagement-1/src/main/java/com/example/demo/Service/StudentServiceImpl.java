package com.example.demo.Service;

import java.util.List;

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
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepositary.findAll();
	}

	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return studentRepositary.findById(id).get();
	}

	@Override
	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		studentRepositary.deleteById(id);
	}

}
