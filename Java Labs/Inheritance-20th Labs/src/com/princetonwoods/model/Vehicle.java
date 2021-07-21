package com.princetonwoods.model;

public class Vehicle {
	private String name;
	private long serialNumer;
	
	//Gets and Sets
	public String getName() { return this.name;}
	public long getSerialNumer() {return this.serialNumer;}
	
	public void setName(String name) {this.name = name;}
	public void setSerialNumber(long serialNumber) {this.serialNumer = serialNumber;}
	
	public void move() {
		System.out.println("vehicle is moving..");
	}
	public void move(int spaces) {
		System.out.println("Vehicles moved " + spaces + " spaces");
	}
}
