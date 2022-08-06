package com.controller;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bean.VehilceBean;

public class VehicleController {

	public static void main(String[] args) {

		VehilceBean v1 = new VehilceBean();
		VehilceBean v2 = new VehilceBean();
		VehilceBean v3 = new VehilceBean();
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
//v.vehicleDemo();
		// start a container...
		// XmlBeanFactory beanFactory = new FileSystemXmlApplicationContext();
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/ApplicationContext.xml");
		VehilceBean vehilceBean1 = (VehilceBean) ctx.getBean("vehicle");
		VehilceBean vehilceBean2 = (VehilceBean) ctx.getBean("vehicle");
		VehilceBean vehilceBean3 = (VehilceBean) ctx.getBean("vehicle");
		System.out.println(vehilceBean1);
		System.out.println(vehilceBean2);
		System.out.println(vehilceBean3);
		System.out.println(vehilceBean1.getId());
		// VehilceBean vehilceBean = ctx.getBean("vehicle",VehilceBean.class);
		 vehilceBean1.vehicleDemo();
		 System.out.println(vehilceBean1.getVehicle().getMakeyear());
	}
	
}
