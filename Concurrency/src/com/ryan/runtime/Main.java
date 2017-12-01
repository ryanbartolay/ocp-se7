package com.ryan.runtime;

import java.util.concurrent.Callable;

public class Main {
	public static void main(String[] args) {
		int counter = -4;
		
		assert counter < 100 : "Greater than 100";
	      for(int i=counter; i<0; i--){ 
	    	  //System.out.println(i);
	      }
		//System.out.println("what is wrong???");
		//ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		//Future<AtomicBoolean> response = service.submit(new CallableDemo());
		//System.out.println(response);
		
	}
}

class Test implements Callable<String> {

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
