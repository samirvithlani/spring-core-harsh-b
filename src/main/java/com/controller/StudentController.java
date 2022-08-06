package com.controller;

import javax.swing.AbstractAction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.Config;
import com.bean.Student;

public class StudentController {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		Student s = (Student) ctx.getBean("student");
		s.setId(101);
		s.setName("raj");
		s.getDetail().setAddress("London");
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getDate().getDate());
		System.out.println(s.getDetail().getAddress());
		((AbstractApplicationContext)ctx).registerShutdownHook();

	}
}
