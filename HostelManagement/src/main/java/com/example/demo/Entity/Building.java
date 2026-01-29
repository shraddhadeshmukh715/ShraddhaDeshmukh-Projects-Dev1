package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name =" Building-DEC")
public class Building {

	@Id
	private int building_id;
	private String building_name;
	private String hostel_name;
	private int total_floors;
	
	
	public int getBuilding_id() {
		return building_id;
	}
	
	public void setBuilding_id(int building_id) {
		this.building_id = building_id;
	}
	
	public String getBuilding_name() {
		return building_name;
	}
	
	public void setBuilding_name(String building_name) {
		this.building_name = building_name;
	}
	
	public String getHostel_name() {
		return hostel_name;
	}
	
	public void setHostel_name(String hostel_name) {
		this.hostel_name = hostel_name;
	}
	
	public int getTotal_floors() {
		return total_floors;
	}
	
	public void setTotal_floors(int total_floors) {
		this.total_floors = total_floors;
	}
	
	
}
