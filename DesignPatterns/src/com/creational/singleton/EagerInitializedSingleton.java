package com.creational.singleton;

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
