package com.ryan.runtime;

public class DemoYield {
	public static void main(String[] args) {
		Thread ty = new Thread(new YieldClass());
		Thread ts = new Thread(new SequenceClass());
		
		ty.start();
		ts.start();
	}
}

class SequenceClass implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}
}

class YieldClass implements Runnable {

	@Override
	public void run() {
		System.out.println("a");
		Thread.yield();
		System.out.println("b");
	}
	
}
