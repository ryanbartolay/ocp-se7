package com.ryan.compare.models;

import java.util.Collections;
import java.util.List;

public class ComparableUser {
	public static void main(String[] args) {
		List<User> user = UserInstances.getUserlist();
		
		System.out.println(user);
		Collections.sort(user);
		System.out.println(user);
	}
}
