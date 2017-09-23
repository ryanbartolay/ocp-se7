package com.ryan.runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("ryan");
		names.add("joaquin");
		names.add("alejandro");
		names.add("joenna");
		
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
	}
}
