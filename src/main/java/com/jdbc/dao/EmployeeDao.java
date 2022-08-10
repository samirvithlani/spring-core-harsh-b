package com.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbc.bean.EmployeeBean;

@Repository
public class EmployeeDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public int addEmployee(EmployeeBean employeeBean) {
		
		
		return jdbcTemplate.update("insert into employee(ename,eage,esalary)values(?,?,?)",employeeBean.geteName(),employeeBean.geteAge(),employeeBean.geteSalary());
	}
}
