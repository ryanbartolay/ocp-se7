package com.ryan.collections;

import java.util.HashMap;
import java.util.Map;

class Animal {
	public Animal() {}
}
class Dog extends Animal {}
class Cat extends Animal {}
class Chihuahua extends Dog {}

public class GenericsSuper {
	public static void main(String[] args) {
		Map<String, ? super Dog> m = new HashMap<String, Dog>();
		m.put("Ryan", new Chihuahua());
		
		System.out.println(m);
	}

}
