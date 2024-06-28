package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.text.Employee;

@SpringBootApplication
public class ReadingfrompropotiesfileExm3Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(ReadingfrompropotiesfileExm3Application.class, args);
		Employee employee=context.getBean("employee",Employee.class);
		employee.show();
	}

}
