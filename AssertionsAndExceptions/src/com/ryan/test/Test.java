package com.ryan.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("Ryan");
		
		System.out.println(strings.contains("Rya2n") ? "It contains" : "It doesnt contain");
	}
}
