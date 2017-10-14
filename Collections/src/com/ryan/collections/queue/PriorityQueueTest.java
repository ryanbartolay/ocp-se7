package com.ryan.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue();
		q.add("Ryan");
		q.add("Joenna");
		
		System.out.println(q);
		
		System.out.println(q.poll()); // returns first and remove first
		
		System.out.println(q);
	}
}
