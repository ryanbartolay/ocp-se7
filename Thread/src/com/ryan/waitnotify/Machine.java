package com.ryan.waitnotify;

public class Machine extends Thread {
	
	private Operator operator;
	public static void main(String[] args) {
		
	}
	@Override
	public void run() {
		while(true) {
			synchronized (operator) {
				try {
					operator.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// send machine steps to hardware
			}
		}
	}
}

class Operator extends Thread {

	@Override
	public void run() {
		while(true) {
			// Get shape from user
			synchronized (this) {
				// calculate new machine steps from shape
				notify();
			}
		}
	}
}
