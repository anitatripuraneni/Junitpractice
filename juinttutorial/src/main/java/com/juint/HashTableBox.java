package com.juint;

import java.util.Hashtable;

public class HashTableBox {

	public static void main(String[] args) {
		/*
		 * Hashtable<Box,String> h = new Hashtable<>(); h.put(new Box(5),
		 * "A");-->5 h.put(new Box(2), "B");-->2 h.put(new Box(6), "F");-->6
		 * h.put(new Box(15), "Z");-->4 h.put(new Box(23), "E");-->1 h.put(new
		 * Box(16), "U");-->5 h.put(new Box(11), "C");-->0 h.put(new Box(19),
		 * "Q");-->8 //new Box(19), "Q";new Box(6), "F";new Box(16), "U";new
		 * Box(5), "A";new Box(15), "Z";new Box(2), "B";new Box(23), "E";new
		 * Box(11), "C"
		 */
		Hashtable<Box, String> h = new Hashtable<>();
		h.put(new Box(5), "A");
		h.put(new Box(2), "B");
		h.put(new Box(6), "F");
		h.put(new Box(15), "Z");
		h.put(new Box(23), "E");
		h.put(new Box(16), "U");
		h.put(new Box(11), "C");
		h.put(new Box(19), "Q");
		System.out.println(h);

		Hashtable<Box, String> h1 = new Hashtable<>(25);
		h1.put(new Box(5), "A");
		h1.put(new Box(2), "B");
		h1.put(new Box(6), "F");
		h1.put(new Box(15), "Z");
		h1.put(new Box(23), "E");
		h1.put(new Box(16), "U");
		h1.put(new Box(11), "C");
		h1.put(new Box(19), "Q");
		System.out.println(h1);

	}

}
