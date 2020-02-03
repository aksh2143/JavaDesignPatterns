package com.creational;

/**
 * This design pattern restrict from creating multiple object of a class,
 * so that only one object is used wherever required.
 * 
 * Such patterns are used in Logging, accessing driver objects, caching, etc.
 * Also this pattern is used in other design patterns like: Abstract factory, Builder, etc.
 * Some core java use of this pattern: java.lang.Runtime
 * 
 * There are 3 ways to implement this patterns.
 * 
 * @author aakash
 *
 */

public class Singleton{}
//1. Private constructor to restrict object creation from outside the class. It has also some further implementation types.
/**
 * Eager initialization
 * Static block initialization
 * Lazy Initialization
 */

