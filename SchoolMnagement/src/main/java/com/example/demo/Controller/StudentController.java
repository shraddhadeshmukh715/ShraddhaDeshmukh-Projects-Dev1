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
import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/add")
	public String saveStudent(@RequestBody Student student)
	{
		studentService.saveStudent(student);
		return MessageConstant.STUDENT_ADDED;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		studentService.deleteStudent(id);
		return MessageConstant.STUDENT_DELETED;
	}
	
	@GetMapping("/get/{id}")
	Student getStudent(@PathVariable int id)
	{
		Student student = studentService.getStudent(id);
		return student;
	}
}
