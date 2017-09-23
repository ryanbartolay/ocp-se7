package com.ryan.compare.models;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorUser {
	public static void main(String[] args) {
		List<User> list = UserInstances.getUserlist();

		System.out.println(list);
		
		Collections.sort(list, new Comparator<User>() {
			@Override
			public int compare(User u1, User u2) {
				return u1.getEmail().compareTo(u2.getEmail());
			}
		});
		
		System.out.println(list);
		
		Collections.sort(list, new UserIDComparator());
		
		System.out.println(list);
		
	
	}
}
