package com.ryan.runtime;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		Future<AtomicBoolean> response = service.submit(new CallableDemo());
		
	}
}

class Test implements Callable<String> {

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
