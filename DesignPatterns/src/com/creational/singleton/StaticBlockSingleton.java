package com.creational.singleton;

/**
 * This is same as EagerStaticSingleton except, the object is created in Static block
 * @author aakash
 *
 */
public class StaticBlockSingleton {

	private static StaticBlockSingleton blockSingleton;
	
	static{
		blockSingleton = new StaticBlockSingleton();
	}
	
	private StaticBlockSingleton(){}
	
	public static StaticBlockSingleton getStaticBlockSingleton(){
		return blockSingleton;
	}
}
