package com.creational.abstractfactory;

public class Truck extends Vehicle {

	public Truck(String name, String engineType, String color) {
		this.name = name;
		this.engineType = engineType;
		this.color = color;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getEngineType() {
		return this.engineType;
	}

	@Override
	public String getColor() {
		return this.color;
	}

}
