package com.ryan.waitnotify;

public class WaitNotifyDemo {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		System.out.println(b);
		b.start();
		
		synchronized(b) {
			try {
				System.out.println("waiting to notify");
				b.wait();
				
				System.out.println("hey");
			} catch (InterruptedException e) {
				System.out.println(b.total);
				e.printStackTrace();
			}
		}
		
		
	}
}

class ThreadB extends Thread {
	int total;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i<100; i++) {
				System.out.println("hello world");
				total += i;
			}
			notify();
		}
	}
}