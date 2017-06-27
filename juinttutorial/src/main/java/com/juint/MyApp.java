package com.juint;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyApp {
	public void setValues(List<String> values){
		
		values.add("cat");
		values.add("loin");
		values.add("tiger");
		values.add("fox");
		values.add("elephant");
		values.add("bear");
		values.add("cat");
		System.out.println(values);
		
	}

	public static void main(String[] args) {
		
		List<String> arraylist=new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		List<String> arraylist1 = new ArrayList<>(arraylist);
		MyApp app = new MyApp();
		app.setValues(arraylist);
		app.setValues(linkedList);
		
		

	}

}
