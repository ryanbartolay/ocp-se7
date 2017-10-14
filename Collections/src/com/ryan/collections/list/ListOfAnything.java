package com.ryan.collections.list;

import java.util.Arrays;
import java.util.List;

class ListOfAnything {
	public static void main(String[] args) {
		String[] strs = {"ryan", "joenna", "mimi", "alejandro"};
		List<?> anything = Arrays.asList(strs);
		
		//System.out.println(anything);
	}
}
