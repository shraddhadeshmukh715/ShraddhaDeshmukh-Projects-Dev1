package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Teacher;
import com.example.demo.Repositary.TeacherRepositary;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	TeacherRepositary teacherRepositary;

	@Override
	public void saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherRepositary.save(teacher);
		
	}

	@Override
	public List<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return teacherRepositary.findAll();
	}

	@Override
	public Teacher getTeacherById(int id) {
		// TODO Auto-generated method stub
		return teacherRepositary.findById(id).get();
	}

	@Override
	public void deleteTeacher(int id) {
		// TODO Auto-generated method stub
		teacherRepositary.deleteById(id);
	}
	
}
