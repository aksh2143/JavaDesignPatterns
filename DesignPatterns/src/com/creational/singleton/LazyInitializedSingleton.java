package com.creational.singleton;

/**
 * This lazy initialization creates object in a static method, so it gets created only when require.
 * This pattern works fine in a single threaded application.
 * But it will cause issue in multi threaded apps. 
 * If there are multiple thread in any if condition, than both threads will get different instances, and 
 * singleton pattern will break. To overcome this issue, please refer Thread Safe Singleton pattern.
 * 
 * @author aakash
 *
 */
public class LazyInitializedSingleton {

	private static LazyInitializedSingleton initializedSingleton;
	
	private LazyInitializedSingleton(){}
	
	
	/**
	* This pattern works fine in a single threaded application.
	* But it will cause issue in multi threaded apps. 
	* If there are multiple thread in any if condition, than both threads will get different instances, and 
	* singleton pattern will break. To overcome this issue, please refer Thread Safe Singleton pattern.
	* @return
	*/
	public static LazyInitializedSingleton getLazySingleton(){
		
		if( initializedSingleton == null ){
			initializedSingleton = new LazyInitializedSingleton();
		}
		return initializedSingleton;
	}
	
	
	/**
	 * This below code will work fine as such, but if you see, synchronizing entire method will limitize method 
	 * for one thread and it will create performance issue. To overcome this, we should use suynchronized block
	 * inside if method to avoid performance issue. See getInstanceUsingDoubleLocking()
	 * 
	 * @return
	 */
	public static synchronized LazyInitializedSingleton getThreadSafeLefelOneSingleton(){
		
		if( initializedSingleton == null ){
			initializedSingleton = new LazyInitializedSingleton();
		}
		return initializedSingleton;
	}
	
	
	/**
	 * Double-checked locking is the practice of checking a lazy-initialized object's state both before and after
	 *  a synchronized block is entered to determine whether or not to initialize the object.
	 *  
	 *  Using double checked locking for lazy initialization will risk in other object using an uninitialized or
	 *  partially initialized object and crashing program.
	 *  
	 *  If you prefer to avoid using synchronized altogether, you can use an inner static class to hold the reference
	 *  instead. Inner static classes are guaranteed to load lazily (Bill Pugh Singleton Implementation).
	 *  
	 *  Below approach failed in certain cases where there were many threads trying to get singleton object in parallel.
	 * 	Check Bill Pugh Singleton Implementation for solution...
	 * 
	 * @return
	 */
	public static LazyInitializedSingleton getInstanceUsingDoubleLocking(){
		
		if( initializedSingleton == null ){
			
			synchronized (LazyInitializedSingleton.class) {
				
				if(initializedSingleton == null){
					initializedSingleton = new LazyInitializedSingleton();
				}
			}
		}
		return initializedSingleton;
	}
	
	
	/**
	 * Bill Pugh Singleton Implementation
	 * 
	 * Notice that when main singleton class is loaded, the static helper class is not loaded.
	 * Static helper is only loaded when we call to get instance method. 
	 * So this is the most widely used singleton class approach.
	 * 
	 * @author aakash
	 *
	 */
	private static class SingletonHelper{
		private static LazyInitializedSingleton billPughInitializedSingleton = new LazyInitializedSingleton();
	}
	
	public static LazyInitializedSingleton getSingletonViaBillPugh(){
		return SingletonHelper.billPughInitializedSingleton;
	}
	
	
	
	/**
	 * Serializing and than deserializing will break singleton. If you serialize an singleton instance, than deserialize
	 * it and compare hashcode, you will find different hashCodes.
	 * 
	 * To overcome this issue, it is recommended to provide implementation of readResolve() method.
	 * 
	 */
	protected Object readResolve() {
	    return getSingletonViaBillPugh();
	}
	
	
	
}
