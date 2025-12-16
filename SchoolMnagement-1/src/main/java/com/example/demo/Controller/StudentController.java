package com.example.demo.Controller;

import java.util.List;

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
	public String addStudent(@RequestBody Student student)
	{
		studentService.saveStudent(student);
		return MessageConstant.STUDENT_ADDED_IN_DB;
	}
	
	@GetMapping
	public List<Student> getAllStudents()
	{
		return studentService.getAllStudents();	
	}
	
	@GetMapping("/get/{id}")
	Student getStudentByID(@PathVariable Integer id)
	{
		return studentService.getStudentById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	void deleteStudentById(@PathVariable Integer id)
	{
		studentService.deleteStudent(id);
	}
}
