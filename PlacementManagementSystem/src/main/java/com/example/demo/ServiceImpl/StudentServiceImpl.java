package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entities.Student;
import com.example.demo.Repositary.StudentRepositary;
import com.example.demo.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepositary studentRepositary;
	
	@Override
	public String saveStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepositary.save(student);
		return MessageConstant.STUDENT_ADDED_IN_DATABASE;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepositary.findById(id).get();
	}

	@Override
	public List<Student> getAllStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepositary.findAll();
	}

	@Override
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		studentRepositary.deleteById(id);
	}

	@Override
	public void deleteAllStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepositary.deleteAll();
	}
}
