package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Placement(Student")
public class Student {

	@Id
	private long student_id;
	private String student_name;
	private String student_email;
	private String student_branch;
	private double student_cgpa;
	
	
	public long getStudent_id() {
		return student_id;
	}
	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public String getStudent_branch() {
		return student_branch;
	}
	public void setStudent_branch(String student_branch) {
		this.student_branch = student_branch;
	}
	public double getStudent_cgpa() {
		return student_cgpa;
	}
	public void setStudent_cgpa(double student_cgpa) {
		this.student_cgpa = student_cgpa;
	}
	
	
}
