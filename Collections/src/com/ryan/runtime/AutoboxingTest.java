package com.ryan.runtime;

public class AutoboxingTest {
	public static void main(String[] args) {
		Integer i = new Integer(456);
		i++;
		System.out.println(i);
		
		
		Integer n = null;
		Integer m = 456;
		
		System.out.println(n == (int)123);
		System.out.println(n);
		
		
	}
}
