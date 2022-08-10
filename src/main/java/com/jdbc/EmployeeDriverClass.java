package com.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Config;
import com.jdbc.controller.EmployeeController;

public class EmployeeDriverClass {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		EmployeeController employeeController = (EmployeeController) ctx.getBean("emp");
		employeeController.addEmployee();
	}
	
}
