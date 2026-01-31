package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CarService(Parts)")
public class Parts {

	@Id
	private long parts_id;
	private String parts_name;
	private double parts_price;
	
	public long getParts_id() {
		return parts_id;
	}
	public void setParts_id(long parts_id) {
		this.parts_id = parts_id;
	}
	public String getParts_name() {
		return parts_name;
	}
	public void setParts_name(String parts_name) {
		this.parts_name = parts_name;
	}
	public double getParts_price() {
		return parts_price;
	}
	public void setParts_price(double parts_price) {
		this.parts_price = parts_price;
	}
	
	
}
