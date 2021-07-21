package com.princetonwoods.model;

public class FlyingVehicle extends Vehicle{
	private short wings;
	private Engine engine;
	
	//******************
	public short getWings() {return this.wings;}
	public Engine getEngine() {return this.engine;}

	public void SetWings(short wings) {this.wings = wings;}
	public void setEngine(Engine engine) {this.engine = engine;	}

	//******************
	public FlyingVehicle() {}
	public FlyingVehicle(short wings, Engine engine) {
		this.wings = wings;
		this.engine = engine;
	}
	
	public void fly() { System.out.println("FlyingVehicle is flying..");  }
	public void refuel() { System.out.println("FlyingVehicle is refueling.."); 	}
	
	public void liftOfff() { System.out.println("FlyingVehicle is lifting off..");   }
	public void land() { System.out.println("FlyingVehicle is landing..");   }
}
