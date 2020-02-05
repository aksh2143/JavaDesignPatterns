package com.creational.abstractfactory;

public class VehicleFactory {

	public static final String VEHICLE_NAME_CRETA = "Hyundai Creta";
	public static final String VEHICLE_NAME_NEXON = "TATA Nexon";
	public static final String VEHICLE_NAME_EICHER = "Eicher";
	
	public static final String VEHICLE_ENGINE_TYPE_PETROL = "Petrol";
	public static final String VEHICLE_ENGINE_TYPE_DIESEL = "Diesel";
	
	public static final String VEHICLE_COLOR_WHITE = "White";
	public static final String VEHICLE_COLOR_BLACK = "Black";
	public static final String VEHICLE_COLOR_RED = "Red";
	
	public static Vehicle getVehicle(AbstractVehicleFactory requestedVechicle){
		
		return requestedVechicle.deliverRequestedvehicle();
		
	}
}
