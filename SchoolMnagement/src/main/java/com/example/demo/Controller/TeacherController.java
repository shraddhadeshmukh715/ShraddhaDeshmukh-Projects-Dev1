package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entity.Teacher;
import com.example.demo.Service.TeacherService;

@RestController
@RequestMapping("teacher")
public class TeacherController {

    

	@Autowired 
	TeacherService teacherService;
	
	@PostMapping("/add")
	public String saveTeacher(@RequestBody Teacher teacher)
	{
		teacherService.saveTeacher(teacher);
		return MessageConstant.TEACHER_ADDED;
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteTeacher(@PathVariable int id)
	{
		teacherService.deleteTeacher(id);
		return MessageConstant.TEACHER_DELETED;
	}
	
	@GetMapping("get/{id}")
	Teacher getTeacher(@PathVariable int id)
	{
		Teacher teacher = teacherService.getTeacher(id);
		return teacher;
		
	}
	
}
