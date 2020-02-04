package com.creational.factorypattern;


/**
 * Factory Design Pattern is used when there is one suprer class with multiple child classes, and we have to return
 * child instance based in input received.
 * 
 * This is all related to object creation. In factory pattern, objects are created without exposing the creation 
 * logic to client. And client uses the same interface every time to create new object type. 
 *
 * This pattern uses factory class, which has a static method, which returns object instance according to
 * the input received.
 * 
 * As a parent class, we can use interface or abstract class to define a parent class. In our case, 
 * we have a SPEAKER abstract class.
 * 
 * For bifurcating and creating object according to requirement, we have created SPEAKERFACTORY.
 * 
 * NOTE: In this example, we have defined properties of speaker in abstract class itself. But they can be transferred
 * to child classes as well and only abstract methods in parent class can be kept as it is.
 * 
 * In below factory, we have kept static data for Speaker, but we can make them dynamic from parameters as well
 * Ex:  SpeakerFactory.getSpeaker(Type, Watts)
 * 
 * @author aakash
 *
 */
public class FactoryDesignPattern {

	public static void main(String[] args) {
		
		Speaker speaker1 = SpeakerFactory.getSpeaker(SpeakerFactory.SPEAKER_TYPE_HOMETHEATER);
		
		System.out.println(speaker1);
		
		Speaker speaker2 = SpeakerFactory.getSpeaker(SpeakerFactory.SPEAKER_TYPE_PORTABLE);
		
		System.out.println(speaker2);
	}
}

/**
 * ADVANTAGES
 * 
 * This patterns hides implementation details form client. This pattern makes our code robust, less coupled
 * and makes extending easy. As an example, We can easily make changes in Portable Speaker logic/data and client 
 * will not be aware of this.
 * 
 * LIVE EXAMPLES IN JDK:
 * 1. java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
 * 2. valueOf() method in wrapper classes like Boolean, Integer etc.
 * 
 */

