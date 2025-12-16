
package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Patient-Dec-9")
public class Patient {


		@Id
	    private String name;
	    private String gender;
	    private int age;
	    private String disease;
	    
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getDisease() {
			return disease;
		}
		public void setDisease(String disease) {
			this.disease = disease;
		}
	
	    
	    
}
