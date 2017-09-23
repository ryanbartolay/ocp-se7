package com.ryan.runtime;

import java.io.Closeable;

interface RyanInterface {
	public void checker() throws AssertionError;
}

public class Number11 implements Closeable, RyanInterface {
     
	public static void main(String[] args)    { 
		System.err.println(args.length);
		assert args.length == 1;
		System.out.println(args[1]);           
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checker() throws RuntimeException {
		// TODO Auto-generated method stub
		
	} 
}