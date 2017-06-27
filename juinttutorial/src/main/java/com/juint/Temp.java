package com.juint;

public class Temp {

	@Override
	public String toString() {
		return "Temp []";
	}
public void finalize(){
	System.out.println("finalized method");
}
}
