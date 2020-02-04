package com.creational.factorypattern;

public abstract class Speaker {

	public String speakerType;
	public int watts;
	public String company;
	public String price;
	
	public abstract String getSpeakerType();
	
	public abstract int getWatts();
	
	public abstract String getCompany();
	
	public abstract String getPrice();
	
	public String toString(){
		return "Getting speaket type: "+speakerType+" with watts: "+watts+" of company: "+company+" At price Rs. "+price;
	}
	
}
