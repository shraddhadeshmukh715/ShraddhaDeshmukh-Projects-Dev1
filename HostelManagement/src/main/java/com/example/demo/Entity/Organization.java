package com.example.demo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Hopital-DEC")
public class Organization {

	@Id
	private int organzation_id;
	private String organization_name;
	private String organization_address;
	private String organization_email;
	private int contact_phone;
	
	
	public int getOrganzation_id() {
		return organzation_id;
	}
	
	public void setOrganzation_id(int organzation_id) {
		this.organzation_id = organzation_id;
	}
	
	public String getOrganization_name() {
		return organization_name;
	}
	
	public void setOrganization_name(String organization_name) {
		this.organization_name = organization_name;
	}
	
	public String getOrganization_address() {
		return organization_address;
	}
	
	public void setOrganization_address(String organization_address) {
		this.organization_address = organization_address;
	}
	
	public String getOrganization_email() {
		return organization_email;
	}
	
	public void setOrganization_email(String organization_email) {
		this.organization_email = organization_email;
	}
	
	public int getContact_phone() {
		return contact_phone;
	}
	
	public void setContact_phone(int contact_phone) {
		this.contact_phone = contact_phone;
	}
	
	 
	
}
