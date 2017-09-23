package com.ryan.search;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearching {
	public static void main(String[] args) {
		Integer[] ints = {33, 44, 55, 77, 88};
		Arrays.sort(ints);

		System.out.println(printInts(ints));

		System.out.println(Arrays.binarySearch(ints, 11)); // -1
		System.out.println(Arrays.binarySearch(ints, 57)); // -4

		Arrays.sort(ints, new BinarySearching().new ReverseIntegerComparator());
		System.out.println(printInts(ints));
		int reverseSearch = Arrays.binarySearch(ints, 57, new BinarySearching().new ReverseIntegerComparator());
		System.out.println(reverseSearch);
	}

	private static String printInts(Integer[] ints) {
		StringBuilder sb = new StringBuilder();

		for(Integer i : ints) {
			sb.append(i + ",");
		}
		sb.deleteCharAt(sb.length()-1);

		return sb.toString();
	}

	class ReverseIntegerComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer i1, Integer i2) {
			if(i1 > i2 ) {
				return -1;
			} else if (i1 < i2) {
				return 1;
			}
			return 0;
		}
	}
}
