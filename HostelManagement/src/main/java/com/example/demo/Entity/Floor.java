package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Floor-DEC")
public class Floor {

	@Id
	private int floor_id;
	private int floor_number;
	private String building_name;
	
	public int getFloor_id() {
		return floor_id;
	}
	
	public void setFloor_id(int floor_id) {
		this.floor_id = floor_id;
	}
	
	public int getFloor_number() {
		return floor_number;
	}
	
	public void setFloor_number(int floor_number) {
		this.floor_number = floor_number;
	}
	
	public String getBuilding_name() {
		return building_name;
	}
	
	public void setBuilding_name(String building_name) {
		this.building_name = building_name;
	}
	
}
