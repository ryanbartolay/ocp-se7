package com.ryan.compare.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserInstances {
	
	private static final List<User> userList = new ArrayList<>();
	private static User[] userArray = null;
	
	static {
		userList.add(new User(2, "ryan", "bartolay.ryan@gmail.com"));
		userList.add(new User(4, "renee", "bartolay.renee@gmail.com"));
		//user.add(null);
		userList.add(new User(1, "joenna", "bartolay.joenna@gmail.com"));
		userList.add(new User(3, "alejandro", "bartolay.alejandro@gmail.com"));
		
		Object[] tempArray = userList.toArray();
		System.out.println(tempArray);
		
		userArray = new User[userList.size()];
		userList.toArray(userArray);
		
	}

	public static List<User> getUserlist() {
		return userList;
	}

	public static User[] getUserArray() {
		return userArray;
	}

	public static void setUserArray(User[] userArray) {
		UserInstances.userArray = userArray;
	}

}
