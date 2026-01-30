package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CarService(Mechanic)")
public class Mechanic {

	@Id
	private long mechanic_id;
	private String mechani_name;
	private String mechanic_specialization;
	
	
	public long getMechanic_id() {
		return mechanic_id;
	}
	public void setMechanic_id(long mechanic_id) {
		this.mechanic_id = mechanic_id;
	}
	public String getMechani_name() {
		return mechani_name;
	}
	public void setMechani_name(String mechani_name) {
		this.mechani_name = mechani_name;
	}
	public String getMechanic_specialization() {
		return mechanic_specialization;
	}
	public void setMechanic_specialization(String mechanic_specialization) {
		this.mechanic_specialization = mechanic_specialization;
	}
	
	
}
