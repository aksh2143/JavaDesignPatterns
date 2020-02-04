package com.creational.factorypattern;

public class PortableSpeaker extends Speaker{

	public PortableSpeaker(String speakerType, int watts, String company, String price) {
		this.speakerType=speakerType;
		this.watts = watts;
		this.company = company;
		this.price = price;
	}
	
	@Override
	public String getSpeakerType() {
		return this.speakerType;
	}

	@Override
	public int getWatts() {
		return this.watts;
	}

	@Override
	public String getCompany() {
		return this.company;
	}

	@Override
	public String getPrice() {
		return this.price;
	}

}
