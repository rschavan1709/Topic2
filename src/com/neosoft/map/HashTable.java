package com.neosoft.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

class Student{
	int rollno;
	String name,city;
	
	public Student(int rollno, String name, String city) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}	
}

public class HashTable {
	public static void main(String[] args) {
	Hashtable<Integer, Student> h = new Hashtable<>();
	Student s1 = new Student(11, "Riddhi", "Kalwa");
	Student s2 = new Student(2, "Kajal", "Taloja");
	h.put(1022, s1);
	h.put(1002, s2);
	for (Map.Entry<Integer, Student> entry:h.entrySet()) {
		int key = entry.getKey();
		Student s = entry.getValue();
		System.out.println("Key:"+key+"   Student's Roll No:"+s.rollno+"  Student's Name:"+s.name+"  Student's City:"+s.city);
	}
	}
	
	
}
