package com.juint;

import java.util.Comparator;
import java.util.TreeSet;

public class StudentTreeSet implements Comparator<Student>{

	public static void main(String[] args) {
		TreeSet<Student> t = new TreeSet<>(new StudentTreeSet());
		t.add(new Student(8,"Anita"));
		t.add(new Student(3,"Nani"));
		t.add(new Student(3,"Nani"));
		t.add(new Student(6,"Bnita"));
		t.add(new Student(2,"Zani"));
		System.out.println(t);

	}

	@Override
	public int compare(Student o1, Student o2) {
		//return o1.getName().compareTo(o2.getName());
		//return -o1.getName().compareTo(o2.getName());
		//return +1;
		return -1;
	}

}
