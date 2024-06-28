package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.test.Employee;

@SpringBootApplication
public class ReadingfrompropotiesfileApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(ReadingfrompropotiesfileApplication.class, args);
		Employee employee=context.getBean("employee",Employee.class);
		employee.show();
	}

}
