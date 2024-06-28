package com.example.demo.text;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix="user")
public class Employee {
		private String username;
		private Integer age;
		private String address;
		
		
		public String getUsername() {
			return username;
		}




		public void setUsername(String username) {
			this.username = username;
		}




		public Integer getAge() {
			return age;
		}




		public void setAge(Integer age) {
			this.age = age;
		}




		public String getAddress() {
			return address;
		}




		public void setAddress(String address) {
			this.address = address;
		}




		public void show() {
			System.out.println("Name = "+username+ "\nAge = "+age + "\nAddress = "+address); 
		}

	
	
	

}
