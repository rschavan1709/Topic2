package com.neosoft.list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList();
		ll.add("Riddhi");
		ll.add("Siddhi");
		ll.add("Kajal");
		ll.add("Anchal");
		ll.add("Karan");
		System.out.println(ll);
		ll.addFirst("Vaishnav");
		ll.addLast("Riddhi");
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		Collections.sort(ll);
		System.out.println(ll);
		Collections.sort(ll,Collections.reverseOrder());
		System.out.println(ll);
	}
}
