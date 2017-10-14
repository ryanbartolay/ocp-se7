package com.ryan.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CastingGenerics {
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		Map <String, List<String>> m = new HashMap<>();
		Map <String, List<String>> n = new HashMap<String, List<String>>();
		n.put("hello", l);
		
		
		List<List<List<String>>> x = new ArrayList<List<List<String>>>();
	}
}
