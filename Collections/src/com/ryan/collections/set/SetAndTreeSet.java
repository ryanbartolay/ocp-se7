package com.ryan.collections.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class SetAndTreeSet {
	public static void main(String[] args) {
		Set<String> xx = new TreeSet<>();
		xx.add("Ryan");
		xx.add("Alejandro");
		xx.add("Joenna");
		xx.addAll(new ArrayList<String>());
		
		
		printIt(((TreeSet)xx).descendingSet());
	}
	
	private static void printIt(Collection<String> strs) {
		System.out.println(strs);
	}
}
