package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User-DEC")
public class User {

	@Id
	private int user_id;
	private String user_name;
	private String user_role;
	private String user_email;
	private int user_phone;
	private int room_number;
	private int bed_number;
	
	
	public int getUser_id() {
		return user_id;
	}
	
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	
	public String getUser_role() {
		return user_role;
	}
	
	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	
	public String getUser_email() {
		return user_email;
	}
	
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	
	public int getUser_phone() {
		return user_phone;
	}
	
	public void setUser_phone(int user_phone) {
		this.user_phone = user_phone;
	}
	
	public int getRoom_number() {
		return room_number;
	}
	
	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}
	
	public int getBed_number() {
		return bed_number;
	}
	
	public void setBed_number(int bed_number) {
		this.bed_number = bed_number;
	}
	
	
}
