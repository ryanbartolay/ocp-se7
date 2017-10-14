package com.ryan.collections.set;

import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class SubMap {
	public static void main(String[] args) {
		SortedMap<String, String> map = new TreeMap<>();
		map.put("d", "dog");
		map.put("h", "horse");
		map.put("a", "ant");
		
		Entry<String, String> xx = ((TreeMap) map).pollFirstEntry();
		
		SortedMap<String, String> submap;
		submap = map.subMap("b", "g");
		
		System.out.println(map + " | " + submap);
		
		map.put("b", "bat");
		
		System.out.println(map + " | " + submap);
		
		submap.put("f", "fish");
		
		System.out.println(map + " | " + submap);
		
		map.put("g", "goat");
		
		System.out.println(map + " | " + submap);
		
		//submap.put("p", "pig");
		
		//System.out.println(map + " | " + submap);
	}
}
