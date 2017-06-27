package com.practice;

public class Test implements InterfaceOne {

	@Override
	public void methodOne() {
		System.out.println("method One");

	}

	@Override
	public void methodTwo() {
		System.out.println("method Two");
	}
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.methodOne();
		t1.methodTwo();
	}

}
