package com.ryan.test;

class Dudes {
	static long flag = 0;
	
	synchronized void chat(long id) {
		if(flag == 0) flag = id;
		
		for(int x = 1; x < 3; x++) {
			if(flag == id) System.out.println("yo ");
			else System.out.println("dude ");
		}
	}
}

public class DudesChat implements Runnable {

	static Dudes d;
	
	public static synchronized void main(String[] args) throws InterruptedException {
		new DudesChat().go();
	}
	
	void go()  {
		
		//Thread.currentThread().sleep(1000);
		d = new Dudes();
		new Thread(new DudesChat()).start();
		Thread t = new Thread(new DudesChat());
		try {
			t.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.notify();
		t.notifyAll();
	}
	
	@Override
	public void run() {
		d.chat(Thread.currentThread().getId());
	}

}
