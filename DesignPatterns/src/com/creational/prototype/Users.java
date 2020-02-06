package com.creational.prototype;

import java.util.ArrayList;


public class Users implements Cloneable{

	ArrayList<String> userList;
	
	
	public Users() {
		userList = new ArrayList<>();
	}

	public Users(ArrayList<String> users){
		this.userList = users;
	}
	
	
	public ArrayList<String> getUserList() {
		return userList;
	}
	
	/**
	 * This method loads data from database.s
	 */
	public void loadUsers(){
		userList.add("Aakash");
		userList.add("Prakash");
		userList.add("Vikash");
		userList.add("Nikash");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		ArrayList<String> users = new ArrayList<String>();
		
		for (String user : this.userList) {
			users.add(user);
		}
		
		return new Users(users);
		
	}
}
