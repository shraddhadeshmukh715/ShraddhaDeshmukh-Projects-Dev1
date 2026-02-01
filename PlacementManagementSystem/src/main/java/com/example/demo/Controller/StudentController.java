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
import com.example.demo.Entities.Student;
import com.example.demo.Service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/add")
	String addStudent(@RequestBody Student student)
	{
		studentService.saveStudent(student);
		return MessageConstant.STUDENT_ADDED_IN_DATABASE;
	}
	
	@GetMapping("/get/{id}")
	Student getByID(@PathVariable int id)
	{
		return studentService.getStudentById(id);
	}
	
	@GetMapping("/get")
	List<Student> getAll(@RequestBody Student student)
	{
		return studentService.getAllStudent(student);
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(@PathVariable int id)
	{
		studentService.deleteStudentById(id);
		return MessageConstant.STUDENT_DELETED_FROM_DATABASE;
	}
	
	@DeleteMapping("/delete")
	String deleteAll(@RequestBody Student student)
	{
		studentService.deleteAllStudent(student);
		return MessageConstant.ALL_STUDENTs_DELETED_FROM_DATABASE;
	}
}
