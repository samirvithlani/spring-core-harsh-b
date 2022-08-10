package com.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jdbc.bean.EmployeeBean;
import com.jdbc.dao.EmployeeDao;

@Component("emp")
public class EmployeeController {

	@Autowired
	EmployeeDao employeeDao;

	public void addEmployee() {

		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.seteName("raj");
		employeeBean.seteAge(25);
		employeeBean.seteSalary(45445.25);

		int res = employeeDao.addEmployee(employeeBean);
		if (res > 0) {
			System.out.println("record added..");
		} else {
			System.out.println("record not added...");
		}

	}

	
}
