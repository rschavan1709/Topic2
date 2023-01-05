package com.neosoft.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<Student1> t1=new TreeSet(new NameComaparator());
		t1.add(new Student1(1211, "Riddhi", 20));
		t1.add(new Student1(1212, "Siddhi", 19));
		t1.add(new Student1(1213, "Kajal", 20));
		t1.add(new Student1(1214, "Anchal", 19));
		Iterator<Student1> itr=t1.iterator();
		while(itr.hasNext()) {
			Student1 s=itr.next();
			System.out.println("Student Id: "+s.getRollNo());
			System.out.println("Student Name: "+s.getName());
			System.out.println("Student Marks"+s.getMarks());
			//itr.remove();
		}
		//System.out.println(t1);
	}
}
