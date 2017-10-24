package com.ryan.quiz.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MyStringComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int s1 = ((String) o1).length();
		int s2 = ((String) o2).length();
		System.out.print(o1 + " " + o2 + " ");
		System.out.println(s1 - s2);
		return s1 - s2;
	}
	public static void main(String[] args) {
		String[] sa = {"bb", "ddd", "aaaa", "c"};
		
		Arrays.sort(sa, new MyStringComparator());

		for(String s : sa) {
			//System.out.println(s);
		}
		
		//System.out.println(Arrays.binarySearch(sa, "cc", new MyStringComparator()));
	}
}
