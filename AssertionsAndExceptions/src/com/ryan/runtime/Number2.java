package com.ryan.runtime;

public class Number2 {

	public static void main(String[] args) {
		int i = 7;
		int j = 8;
		do {
			i--;
			if(i < 5) break;
		} while(doMinus(j--));
		System.out.println(i);
	}

	private static boolean doMinus(int i) {
		assert i > 5;
		return true;
	}
}
