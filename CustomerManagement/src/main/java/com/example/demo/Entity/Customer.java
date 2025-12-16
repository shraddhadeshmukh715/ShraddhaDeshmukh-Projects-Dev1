package com.example.demo.Entity;
 
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cus-8-dec")
public class Customer {
	
	@Id
	private int id;
	
	private String name;
	private String address;
	private String email;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getEmail() {
		return email;
	}
	
	
}
