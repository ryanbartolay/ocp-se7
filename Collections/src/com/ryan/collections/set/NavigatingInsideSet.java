package com.ryan.collections.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigatingInsideSet {
	public static void main(String[] args) {
		NavigableSet<String> ns = new TreeSet<>();
		ns.add("Ryan");
		ns.add("Joenna");
		ns.add("Mimi");
		ns.add("Alejandro");
		
		System.out.println(ns); // [Alejandro, Joenna, Mimi, Ryan]
		
		System.out.println(ns.ceiling("Joaquin")); // Joenna
		
		System.out.println(ns.floor("Wax")); // Ryan
		
		System.out.println(ns.ceiling("Mimi")); // Mimi
		
		System.out.println(ns.floor("Mimi")); // Mimi
		
		System.out.println(ns.headSet("Miguel")); // [Alejandro, Joenna]
		
		System.out.println(ns.tailSet("Mimi")); // [Mimi, Ryan]
		
	}
}
