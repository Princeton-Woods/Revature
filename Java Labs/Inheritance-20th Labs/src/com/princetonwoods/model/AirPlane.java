package com.princetonwoods.model;

public class AirPlane extends FlyingVehicle{
    private short wheels;
    private short propellers;

    //*******************
    public short getWheels(){ return this.wheels; }
    public short getPropellors() { return this.propellers; }

    public void setWheels(short wheels){ this.wheels = wheels; }
    public void setPropellers(short propellers) {this.propellers = propellers; }
    //********************
    public AirPlane(short wheels, short propellers) {
    	this.wheels = wheels;
    	this.propellers = propellers;
    }
    public void turn(){  System.out.println("Turning..."); }
}
