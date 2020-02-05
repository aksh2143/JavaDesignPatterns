package com.creational.abstractfactory;

public class TruckFactory extends Truck implements AbstractVehicleFactory {

	public TruckFactory(String name, String engineType, String color) {
		super(name, engineType, color);
	}

	@Override
	public Vehicle deliverRequestedvehicle() {
		return new Truck(this.name, this.engineType, this.color);
	}

	
}
