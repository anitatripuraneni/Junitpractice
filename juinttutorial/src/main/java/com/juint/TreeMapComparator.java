package com.juint;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapComparator implements Comparator<String> {

	public static void main(String[] args) {
		TreeMap<String,Integer> t = new TreeMap<>(new TreeMapComparator());
		t.put("demo", 1);
		t.put("refr", 2);
		t.put("ujnh", 3);
		t.put("asxd", 4);
		System.out.println(t);
		System.out.println(t.values());
	}

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}

}
