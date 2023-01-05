package com.neosoft.set;

import java.util.TreeSet;

public class SortedAndNavigable {
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<>();
		t.add(30);
		t.add(10);
		t.add(25);
		t.add(40);
		t.add(60);
		t.add(15);
//		t.add(null);
		System.out.println(t);
		System.out.println(t.add(30));
		System.out.println(t);
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println(t.headSet(25));
		System.out.println(t.tailSet(30));
		System.out.println(t.subSet(25, 60));
		System.out.println(t.comparator());
		System.out.println(t.ceiling(25));
		System.out.println(t.higher(25));
		System.out.println(t.floor(30));
		System.out.println(t.lower(30));
		System.out.println(t.pollFirst());
		System.out.println(t);
		System.out.println(t.pollLast());
		System.out.println(t);
		System.out.println(t.descendingSet());
	}
}
