package com.juint;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		/*System.out.println(pq.peek());
		System.out.println(pq.element());
		System.out.println(pq.poll());
		System.out.println(pq.remove());*/
		for(int i=0;i<=10;i++){
			pq.offer(i);
		}
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.element());
		System.out.println(pq.poll());
		System.out.println(pq.remove());
		System.out.println(pq.peek());
	}

}
