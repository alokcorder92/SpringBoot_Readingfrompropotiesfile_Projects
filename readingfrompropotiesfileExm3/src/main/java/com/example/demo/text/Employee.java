package com.example.demo.text;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix="user")
public class Employee {
	
	private String user1;
	private Integer age;
	private String address;

	
	public void show() {
		System.out.println("Name = "+user1+"\nAge = "+age+"\nAddress = "+address); 
	}


}
