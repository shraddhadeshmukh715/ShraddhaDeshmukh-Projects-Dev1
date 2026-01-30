package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name  = "CarService(Car)")
public class Car {
	@Id
	private int car_id;
	private String car_name;
	private String car_model;
	private long car_number;
	
	
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public String getCar_model() {
		return car_model;
	}
	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}
	public long getCar_number() {
		return car_number;
	}
	public void setCar_number(long car_number) {
		this.car_number = car_number;
	}
	
	

}
