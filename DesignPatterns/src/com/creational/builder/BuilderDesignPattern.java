package com.creational.builder;
/**
 * This design pattern is created to resolve the issue happening in Factory & Abstract Factory
 * pattern when the Object is complex and it has many attributes where not all attributes 
 * are mandatory.
 * 
 * The issue is, when there are many attributes, there are some wich are mandatory, some are not.
 * When the object is heavy & complex in creation, than this complexity will be part of Factory.
 * 
 * Builder pattern solves this issue. It provides a stap-to-step process to build an object
 * and a method, that will return the object at last.
 * 
 * @author aakash
 *
 */

/**
 * PSEUDO
 * 1. Create a Vehicle class with some mandatory and some optional fields. Set public getters only.
 * 2. Create a static builder class inside this Vehicle class and copy all above fields there private.
 * 3. Create a constructor in static class with only mandatory fields and set them.
 * 4. Not our job us to created setters of optional fields, set them and return static class object.
 * 5. Create private Constructor in Vehicle class, set static builder in parameter and set values from it.
 * 6. Create build method which returns Vehicle object in static class to build class, 
 * 	  call Vehicle constructor and pass current object.
 * 
 * This way, you can only create object with mandatory fields by calling static class constructor
 * than set optional fields if required in the same returned object and call build on the same,
 * which will internally call Vehicle constructor, set values and retuen Vehicle object.
 * 
 * @author aakash
 *
 */

public class BuilderDesignPattern {

	public static void main(String[] args) {
	Vehicle v1	=	new Vehicle.VehicleBuilder("Creta", "Black", "Petrol")
					.setIsRimsRequired(true)
					.setIsTVRequired(true)
					.buildVehicle();
	
	System.out.println(v1);
	
	/**
	 * This way, we can set guidelines to create object in a systematic way.s
	 */
	
	}
}
