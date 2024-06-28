package com.example.demo.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("${user.user1}")
	private String user1;
	@Value("${user.age}")
	private Integer age;
	@Value("${user.address}")
	private String address;
	
	
	
   public void show() {
		System.out.println("Name= "+user1+"\nAge= "+age+"\nAddress= "+address);
	}

}
