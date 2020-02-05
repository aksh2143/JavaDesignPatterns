package com.creational.abstractfactory;

/**
 * Abstract factory design pattern is used to provide a factory which creates multiple factories. This is advance level
 * of Factory Pattern.
 * 
 * In FACTOY PATTERN, we had a single factory, which returned different subclasses from if-else/switch-case.
 * 
 * In ABSTRACT FACTORY PATTERN, we will remove this if/else and have a FACTORY CLASS FOR EACH SUB CLASS.
 * Than we will have an ABSTRACT FACTORY CLASS(Abstract class/Interface), that will have a general named method to create object.
 * This above abstract class will be implemented by all child factories, and method will be implemented to return corresponding object. 
 * Now, all abstract factory, and child factories are set, so We will create VehicleFactory.java and call our abstract factory
 * method which will accept child factory objects, and return corresponding Car/Truck objects.
 * 
 * @author aakash
 *
 */
public class AbstractFactoryPattern {
	//0. Vehicle class the base class for all types of vehicles.
	Vehicle v;
	
	//1. Car Object
	Car c;
	
	//2. Truck Object
	Truck t;
	
	//3. Abstract Vehicle Factory Object.
	/**
	 *  This has a deliverVehicle method
	 */
	AbstractVehicleFactory a;
	
	
	//4. CarFactory object, this will implement No.3 and provide implementation accordingly.
	CarFactory cf;
	
	//5. TruckFactory, this will implement No.3 and provide implementation accordingly.
	TruckFactory tf;
	
	//6. VehicleFactory, this will take No.4/5 as input, and call No.3's method.
	//	 Due to inheritance, Delivervehicle() will be called from No.4/5 which ever is received
	//	 And object of No 1/2 will be returned.
	VehicleFactory vf;
	
	
	public static void main(String[] args) {
		
		Vehicle vehicleCreta1 = VehicleFactory.getVehicle(new CarFactory(VehicleFactory.VEHICLE_NAME_CRETA, VehicleFactory.VEHICLE_ENGINE_TYPE_PETROL, VehicleFactory.VEHICLE_COLOR_BLACK));
		Vehicle vehicleTruck1 = VehicleFactory.getVehicle(new TruckFactory(VehicleFactory.VEHICLE_NAME_EICHER, VehicleFactory.VEHICLE_ENGINE_TYPE_DIESEL, VehicleFactory.VEHICLE_COLOR_RED));
		Vehicle vehicleVechile2 = VehicleFactory.getVehicle(new TruckFactory(VehicleFactory.VEHICLE_NAME_NEXON, VehicleFactory.VEHICLE_ENGINE_TYPE_DIESEL, VehicleFactory.VEHICLE_COLOR_WHITE));
		
		System.out.println(vehicleCreta1);
		System.out.println(vehicleTruck1);
		System.out.println(vehicleVechile2);
		
		
	}
	
	/**
	 * BENEFITS OF ABSTRACT FACTORY.
	 */
	/*
	1. Abstract factory allows us to code for Interfaces instead of implementatinos (Factories).
	2. This factory is FACTORY OF FACTORIES, and that is why this can be easily extended for more factories
		like HeavyDutyTruckFactory, BikeFactory, etc.
	3. This factory patterns is robust and avoids conditional logic of factory pattern(We just pass parent factory object).
	*/
}
