package com.juint;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCompartor implements Comparator<String> {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>(15, new PriorityQueueCompartor());
		pq.offer("A");
		pq.offer("O");
		pq.offer("C");
		pq.offer("Y");
		pq.offer("Z");
		pq.offer("R");
		System.out.println(pq);
	}

	@Override
	public int compare(String o1, String o2) {
		// return -o1.compareTo(o2);
		return o2.compareTo(o1);
	}

}
