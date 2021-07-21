package com.princetonwoods.model;

public class Simulation {

	public static void main(String[] args) {
		FlyingVehicle fv = new FlyingVehicle((short)4, new Engine());
		fv.setName("A New Flying Vehicle");
		System.out.println(fv.getName());
		
		AirPlane boeing = new AirPlane((short)4,(short)5);
		boeing.move(15);
	}

}
