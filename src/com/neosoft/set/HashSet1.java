package com.neosoft.set;

import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet<Student1> h=new HashSet();
		h.add(new Student1(1211, "Riddhi", 20));
		h.add(new Student1(1212, "Siddhi", 19));
		h.add(new Student1(1213, "Kajal", 20));
		h.add(new Student1(1214, "Anchal", 19));
		h.add(new Student1(1212, "Riddhi", 20));
		for(Student1 s:h) {
			System.out.println(s);
		}
	}
}
