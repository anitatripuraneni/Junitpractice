package com.juint;

import java.util.HashSet;



public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> s = new HashSet<>();
		s.add("h");
		s.add("g");
		s.add("c");
		s.add("d");
		s.add("a");
		s.add("f");
		s.add("b");
		s.add("h");
		
		System.out.println(s);
	}
}
