package com.neosoft.concurrentcollection;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(121);
		al.add(100);
		al.add(130);
		System.out.println(al);
		CopyOnWriteArrayList<Integer> cl=new CopyOnWriteArrayList<>();
		cl.add(120);
		cl.add(121);
		cl.addIfAbsent(121);
		cl.addIfAbsent(122);
		System.out.println(cl);
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(100);
		al1.add(101);
		cl.addAllAbsent(al);
		System.out.println(cl);
	}
}
