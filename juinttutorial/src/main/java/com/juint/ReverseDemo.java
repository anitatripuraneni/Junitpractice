package com.juint;

import java.util.ArrayList;
import java.util.Collections;



public class ReverseDemo {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("Zebra");
		a.add("Abc");
		a.add("Uere");
		a.add("Sded");
		a.add("Hebd");
		a.add("Obdfd");
		
		Collections.sort(a, Collections.reverseOrder());
		System.out.println(a);
		

	}

}