package com.ryan.compare.models;

import java.util.Comparator;

public class UserIDComparator implements Comparator<User> {

	@Override
	public int compare(User u1, User u2) {
		if(u1.getId() > u2.getId()) {
			return 1;
		} else if(u1.getId() < u2.getId()) {
			return -1;
		}
		return 0;
	}

}
