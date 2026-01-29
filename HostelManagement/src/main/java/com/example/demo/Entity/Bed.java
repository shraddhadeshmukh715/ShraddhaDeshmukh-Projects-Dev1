package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bed-DEC")
public class Bed {

	@Id
	private int bed_id;
	private int bed_number;
	private int room_number;
	private String bed_status;
	
	public int getBed_id() {
		return bed_id;
	}
	
	public void setBed_id(int bed_id) {
		this.bed_id = bed_id;
	}
	
	public int getBed_number() {
		return bed_number;
	}
	
	public void setBed_number(int bed_number) {
		this.bed_number = bed_number;
	
	}
	
	public int getRoom_number() {
		return room_number;
	}
	
	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}
	
	public String getBed_status() {
		return bed_status;
	}
	
	public void setBed_status(String bed_status) {
		this.bed_status = bed_status;
	}
	
	
}
