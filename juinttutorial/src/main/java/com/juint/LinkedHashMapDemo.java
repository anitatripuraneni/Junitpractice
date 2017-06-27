package com.juint;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> h = new LinkedHashMap<>();
		h.put("demo", 1);
		h.put("refr", 2);
		h.put("ujnh", 3);
		h.put("asxd", 4);
		System.out.println(h);
		HashMap<Integer,String> hm = new HashMap<>();
		IdentityHashMap<Integer,String> hi = new IdentityHashMap<>();
		hm.put(new Integer(10), "Anita");
		hm.put(new Integer(10), "Sumanth");
		System.out.println(hm);
		hi.put(new Integer(10), "Anita");
		hi.put(new Integer(10), "Sumanth");
		System.out.println(hi);
	}

}
