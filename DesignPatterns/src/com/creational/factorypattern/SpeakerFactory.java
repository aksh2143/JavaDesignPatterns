package com.creational.factorypattern;

public class SpeakerFactory {

	public static final String SPEAKER_TYPE_HOMETHEATER = "HomeTheater";
	public static final String SPEAKER_TYPE_PORTABLE = "Portable";
	
	public static Speaker getSpeaker(String speakerType ){
		
		switch (speakerType) {
		case SPEAKER_TYPE_HOMETHEATER:
				return new HomeTheater(SPEAKER_TYPE_HOMETHEATER, 5000, "JBL", "20000");
				
		case SPEAKER_TYPE_PORTABLE:
				return new HomeTheater(SPEAKER_TYPE_PORTABLE, 2000, "iBall", "2000");
			 
		default:
			break;
		}
		
		return null;
	}
}
