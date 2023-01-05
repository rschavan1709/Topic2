package com.neosoft.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.neosoft.map.intComparator;


public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(1211, "Riddhi", 20));
		al.add(new Student(1212, "Siddhi", 19));
		al.add(new Student(1213, "Kajal", 20));
		al.add(new Student(1213, "Kajal", 20));
		al.add(new Student(1214, "Anchal", 19));
		al.forEach(System.out::println);
		System.out.println("--get--");
		System.out.println(al.get(2));
		System.out.println("--remove--");
		System.out.println(al.remove(3));
		al.forEach(System.out::println);
		//Collections.sort(al,new NameComaparator());
		Collections.sort(al);
		System.out.println("sort by name");
		al.forEach(System.out::println);
		
		List<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(8);
		list.add(2);
		list.add(9);
		list.add(6);
		list.add(7);
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size();j++) {
				if(list.get(i)>list.get(j)){
					int temp=list.get(i);
					int temp1=list.get(j);
					list.set(i, temp1);
					list.set(j, temp);
				}
			}
		}
		System.out.println(list);
	}
}
 