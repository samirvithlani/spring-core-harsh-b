package com.bean;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component("student")
//@Scope("prototype")
public class Student {

	@PostConstruct
	public void init() {
		System.out.println("inint callllllll");
	}

	public void display() {
		System.out.println("display...");

	}

	@PreDestroy
	public void destroy() {

		System.out.println("destroy....");
	}

	private int id;
	private String name;
	@Autowired
	private Date date;

	@Autowired
	private StudentDetail detail;

	public StudentDetail getDetail() {
		return detail;
	}

	public void setDetail(StudentDetail detail) {
		this.detail = detail;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
