package com.creational.builder;

public class Vehicle {
	
	//Mandatory
	private String name;
	private String color;
	private String engineType;
	
	
	//Optional
	private boolean tvRequired;
	private boolean rimsRequired;
	
	/**
	 * Study the static VehicleBuilder class inside this Vehicle Class first.
	 * This private constructor accepts VehicleBuilder as a parameter.
	 * That means, all we have to do is, create a Vehiclebuilder class with data and call
	 * this cunstructor, so we will get a Vehicle Object. 
	 * 
	 * For the second part mentioned above is done from vehicleBuilder class method 'buildVehicle'
	 *  
	 * @param builderVch
	 */
	private Vehicle(VehicleBuilder builderVch) {
		this.name = builderVch.name;
		this.color = builderVch.color;
		this.engineType = builderVch.engineType;
		this.tvRequired = builderVch.tvRequired;
		this.rimsRequired = builderVch.rimsRequired;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public String getEngineType() {
		return engineType;
	}

	public boolean isTvRequired() {
		return tvRequired;
	}

	public boolean isRimsRequired() {
		return rimsRequired;
	}
	
	public static class VehicleBuilder{
		
		//Mandatory
		private String name;
		private String color;
		private String engineType;
		
		//Optional
		private boolean tvRequired;
		private boolean rimsRequired;
		
		public VehicleBuilder(String name, String color, String engineType){
			this.name = name;
			this.color = color;
			this.engineType = engineType;
		}
		
		public VehicleBuilder setIsTVRequired(boolean b){
			this.tvRequired = b;
			return this;
		}
		
		public VehicleBuilder setIsRimsRequired(boolean b){
			this.rimsRequired = b;
			return this;
		}
		
		public Vehicle buildVehicle(){
			return new Vehicle(this);
		}
	}
	
	public String toString(){
		return "You ordered a "+this.color+" "+this.name+" with "+this.engineType +" engine";
	}
}
