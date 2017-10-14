package com.ryan.generics;

import java.util.ArrayList;
import java.util.List;

class Animal {}
class Pet extends Animal {}
class Dog extends Pet {}
class Cat extends Pet {}
class Mouse extends Pet {}
class PitBull extends Dog {}
class Chihuahua extends Dog {}

public class MultiGenerics {
	public static void main(String[] args) {
		List<Dog> doggs = new ArrayList<>();
		doggs.add(new Dog());
	}
	
	public void testPoly(List<? extends Dog> doggs) {
		
		for(Pet dog : doggs) {
			System.out.println(dog);
		}
	}
}
