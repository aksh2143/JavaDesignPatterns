package com.creational.abstractfactory;

public class CarFactory extends Car implements AbstractVehicleFactory{

	public CarFactory(String name, String engineType, String color) {
		super(name, engineType, color);
	}

	@Override
	public Vehicle deliverRequestedvehicle() {
		return new Car(this.name, this.engineType, this.color);
	}

}
