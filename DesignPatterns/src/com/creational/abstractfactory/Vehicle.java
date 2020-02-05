package com.creational.abstractfactory;

public abstract class Vehicle {
	
	public String name;
	public String engineType;
	public String color;
	
	public abstract String getName();
	public abstract String getEngineType();
	public abstract String getColor();
	
	public String toString(){
		return "A "+getColor() +" "+getName()+" with "+getEngineType()+" Engine is delivered.";
	}
}
