package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Placement(job)")
public class Job {
	
	@Id
	private int job_id;
	private double job_eligible_cgpa;
	private String job_role;
	private String job_location;
	
	
	public int getJob_id() {
		return job_id;
	}
	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}
	public double getJob_eligible_cgpa() {
		return job_eligible_cgpa;
	}
	public void setJob_eligible_cgpa(double job_eligible_cgpa) {
		this.job_eligible_cgpa = job_eligible_cgpa;
	}
	public String getJob_role() {
		return job_role;
	}
	public void setJob_role(String job_role) {
		this.job_role = job_role;
	}
	public String getJob_location() {
		return job_location;
	}
	public void setJob_location(String job_location) {
		this.job_location = job_location;
	}
	
	

}
