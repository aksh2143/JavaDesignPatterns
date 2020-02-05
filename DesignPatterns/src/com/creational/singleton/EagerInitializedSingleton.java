package com.creational.singleton;

/**
 * This design pattern restrict from creating multiple object of a class,
 * so that only one object is used wherever required.
 * 
 * Such patterns are used in Logging, accessing driver objects, caching, etc.
 * Also this pattern is used in other design patterns like: Abstract factory, Builder, etc.
 * Some core java use of this pattern: java.lang.Runtime
 * 
 * There are 3 ways to implement this patterns.
 */

//1. Private constructor to restrict object creation from outside the class. 
//	 It has also some further implementation types.
/**
* Eager initialization
* Static block initialization
* Lazy Initialization
*/


/**
 * 1. Eager Initialization.
 * In this,object of the class is created in static way(At class loading) and even if it is not used in application.
 * When to use: If this class is not using a many resources, but as singletons are used for resources like file system, db conn.
 * this singleton is not recommended as such.
 * 
 * @author aakash
 *
 */

public class EagerInitializedSingleton  {

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton(){}
	
	public static EagerInitializedSingleton getEagerInitializedSingleton(){
		return instance;
	}
}
