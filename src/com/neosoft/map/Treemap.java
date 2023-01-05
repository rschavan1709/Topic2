package com.neosoft.map;

import java.util.TreeMap;

public class Treemap {
	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<>();
		t.put(12,"Riddhi");
		t.put(11, "Kajal");
		t.put(14, "Anchal");
		t.put(10, "Siddhi");
		System.out.println(t);
		System.out.println(t.firstKey());
		System.out.println(t.lastKey());
		System.out.println(t.headMap(12));
		System.out.println(t.tailMap(12));
		System.out.println(t.subMap(11, 13));
		System.out.println(t.comparator());
		
		TreeMap<Integer, String> t1 = new TreeMap<>(new intComparator());
		t1.put(111,"Riddhi");
		t1.put(122, "Kajal");
		t1.put(103, "Anchal");
		System.out.println(t1);
	}
}
