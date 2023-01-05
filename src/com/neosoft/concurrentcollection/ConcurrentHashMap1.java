package com.neosoft.concurrentcollection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap1 {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> ch=new ConcurrentHashMap<>();
		// putIfAbsent 
		ch.put(101, "Riddhi");
		System.out.println(ch);
		ch.putIfAbsent(102, "Siddhi");
		System.out.println(ch);
		// remove
		ch.remove(102, "Kajal");
		System.out.println(ch);
		ch.remove(102,"Siddhi");
		System.out.println(ch);
		// replace
		ch.replace(101,"Siddhi","Karan");
		System.out.println(ch);
		ch.replace(101, "Riddhi", "Karan");
		System.out.println(ch);
	}
}
