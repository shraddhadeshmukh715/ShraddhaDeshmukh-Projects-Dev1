package com.example.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Placement(Application)")
public class Application {

	@Id
	private long application_id;
	private int application_date;
	private String application_status;
	
	@Id
	public long getApplication_id() {
		return application_id;
	}
	public void setApplication_id(long application_id) {
		this.application_id = application_id;
	}
	public int getApplication_date() {
		return application_date;
	}
	public void setApplication_date(int application_date) {
		this.application_date = application_date;
	}
	public String getApplication_status() {
		return application_status;
	}
	public void setApplication_status(String application_status) {
		this.application_status = application_status;
	}
	
	
}
