package com.juint;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo implements Comparator<Integer> {
	// Balanced Tree Data structure
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>(new TreeSetDemo());
		t.add(new Integer(1));
		t.add(new Integer(34));
		t.add(new Integer(23));
		t.add(new Integer(56));
		System.out.println(t);

	}

	@Override
	public int compare(Integer o1, Integer o2) {
		/*
		 * if(o1 < o2){ return 1; }else if(o1>o2){ return -1; }else return 0; }
		 */
		// return o1.compareTo(o2);
		// return -o1.compareTo(o2);
		// return o2.compareTo(o1);
		// return -o2.compareTo(o1);
		return +1;
		// return -1;
		// return 0;
	}

}
