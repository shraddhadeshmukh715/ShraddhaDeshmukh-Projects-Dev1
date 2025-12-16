package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Teacher;

public interface TeacherService {

	void saveTeacher(Teacher teacher);
	
	List<Teacher> getAllTeachers();
	
	Teacher getTeacherById(int id);
	
	void deleteTeacher(int id);
}
