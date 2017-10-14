package com.ryan.test;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Number5Navigable {
	public static void main(String[] args) {
		NavigableSet<String> aa = new TreeSet<>();
		aa.add("a");aa.add("b");aa.add("c");
		aa.add("aa");aa.add("bb");aa.add("cc");
		
		System.out.println(aa.floor("a")); // If given is existing, then give given.. Returns the greatest element in this set less than or equal to the given element, or null if there is no such element. 
		System.out.println(aa.ceiling("aa")); // Returns the least element in this set greater than or equal to the given element, or null if there is no such element. 
		System.out.println(aa.lower("a")); // Returns the greatest element in this set strictly less than the given element, or null if there is no such element. 
		System.out.println(aa.higher("bb")); // Returns the least element in this set strictly greater than the given element, or null if there is no such element.
		
		System.out.println(aa.floor("aa"));
		
//		for(String a : aa) {
//			System.out.println(a);
//		}
	}
}
