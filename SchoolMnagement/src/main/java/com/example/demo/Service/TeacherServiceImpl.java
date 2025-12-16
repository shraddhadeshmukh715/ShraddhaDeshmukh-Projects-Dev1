package com.example.demo.Service;

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
	public void deleteTeacher(int id) {
		// TODO Auto-generated method stub
		teacherRepositary.deleteById(id);
	}

	@Override
	public Teacher getTeacher(int id) {
		// TODO Auto-generated method stub
	  return teacherRepositary.findById(id).get();
	}

	
}
