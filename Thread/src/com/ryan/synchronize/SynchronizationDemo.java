package com.ryan.synchronize;

public class SynchronizationDemo {
	
	private SynchronizationDemo syncDemo = new SynchronizationDemo();
	private static StringBuffer bf = new StringBuffer();
	
	public synchronized void demoMethod() {
		boolean enabled = false;
		assert enabled = true;
	}
	
	public void demoMethod(String s) {
		synchronized(this) {
			
		}
	}
	
	public static synchronized void staticSynchronizedMethod() {
		
	}
	
	public static void staticSynchronizedMethod(String s) {
		synchronized(SynchronizationDemo.class) {
			
		}
	}
	
	public static void main(String[] args) {
		DemoThread demo = new DemoThread(bf);
		for(int i = 1; i <= 3; i++) {
			new Thread(demo, "thread-" + i).start();
		}
	}
}

class DemoThread implements Runnable {

	private StringBuffer local;
	private char defaultChar = 'a';
	
	public DemoThread(StringBuffer sb) {
		local = sb;
	}
	
	@Override
	public void run() {
		
		synchronized (this) {
			local.append(defaultChar);
			for(int i = 1; i <= 100; i++) {
				System.out.println(local);
			}
			defaultChar++;
		}
	}
}
