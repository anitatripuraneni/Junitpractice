package com.juint;

import java.util.HashMap;
import java.util.WeakHashMap;

public class TempDemo {

	public static void main(String[] args) throws InterruptedException {
		//HashMap<Temp, String> h = new HashMap<>();
		WeakHashMap<Temp, String> h = new WeakHashMap<>();
		Temp t = new Temp();
		h.put(t, "anita");
		System.out.println(h);
		t=null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(h);

	}

}
