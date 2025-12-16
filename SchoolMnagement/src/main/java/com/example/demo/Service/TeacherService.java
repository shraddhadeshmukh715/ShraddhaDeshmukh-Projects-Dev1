package com.example.demo.Service;

import com.example.demo.Entity.Teacher;

public interface TeacherService {

	public void saveTeacher(Teacher teacher);
	
	public void deleteTeacher(int id);
	
	public Teacher getTeacher(int id);
}
