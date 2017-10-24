package com.ryan.test;


public class MyThread implements Runnable
{
	String msg = "default";
	public MyThread(String s)
	{
		msg = s;
	}
	public void run()
	{
		System.out.println(msg);
	}
	public static void main(String args[]) 
	{
		Thread t = new Thread(new MyThread("String1"));
		Thread.yield();
		new Thread(new MyThread("String2")).run();
		System.out.println("end");
		
	}
}
