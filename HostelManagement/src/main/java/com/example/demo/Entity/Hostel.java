package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Hostel-DEC")
public class Hostel {

	@Id
	
	private int hostel_id;
	private String hostel_name;
	private String hostel_city;
	private int total_buildings;
	
	
	public int getHostel_id() {
		return hostel_id;
	}
	
	public void setHostel_id(int hostel_id) {
		this.hostel_id = hostel_id;
	}
	
	public String getHostel_name() {
		return hostel_name;
	}
	
	public void setHostel_name(String hostel_name) {
		this.hostel_name = hostel_name;
	}
	
	public String getHostel_city() {
		return hostel_city;
	}
	
	public void setHostel_city(String hostel_city) {
		this.hostel_city = hostel_city;
	}
	
	public int getTotal_buildings() {
		return total_buildings;
	}
	
	public void setTotal_buildings(int total_buildings) {
		this.total_buildings = total_buildings;
	}
	
}
