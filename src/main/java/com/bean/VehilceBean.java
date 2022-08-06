package com.bean;

import java.util.Date;

public class VehilceBean {

	private int id;
	private String name;
	
	private Date date;
	
	private VehicleDetail vehicle;
	
	

	public VehicleDetail getVehicle() {
		return vehicle;
	}


	public void setVehicle(VehicleDetail vehicle) {
		this.vehicle = vehicle;
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


	public void vehicleDemo() {

		System.out.println("vehicle method called....");
		System.out.println(date.getDate());
	}

}
