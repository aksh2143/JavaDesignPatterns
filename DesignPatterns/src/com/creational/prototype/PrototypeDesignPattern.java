package com.creational.prototype;

import java.util.ArrayList;

/**
 * This design pattern is used when creating of an object is costly, time consuming, 
 * effort taking and we already have a similar object available.
 * 
 * In such scenario, prototype design pattern provides a mechanism to copy and create a new object
 * from original object and modify it according to requirement.
 * 
 * This patterns makes it mandatory for object to have cloning available.
 * 
 * @author aakash
 *
 */
public class PrototypeDesignPattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Users userList1 = new Users();
		userList1.loadUsers();
		
		Users userList2 = (Users) userList1.clone();
		
		
		for (String string : userList1.userList) {
			System.out.println(string);
		}
		
		for (String string : userList2.userList) {
			System.err.println(string);
		}
		System.err.println("=========================================");
		
		
		ArrayList<String> userList = userList2.getUserList();
		userList.remove(3);
		
		for (String string : userList2.userList) {
			System.err.println(string);
		}
		
	}
}
