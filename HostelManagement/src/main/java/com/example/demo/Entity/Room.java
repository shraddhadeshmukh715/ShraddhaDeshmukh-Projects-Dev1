package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Room-DEC")
public class Room {

	@Id
	private int room_id;
	private int room_number;
	private String room_type;
	private int capacity;
	
	public int getRoom_id() {
		return room_id;
	}
	
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	
	public int getRoom_number() {
		return room_number;
	}
	
	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}
	
	public String getRoom_type() {
		return room_type;
	}
	
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
