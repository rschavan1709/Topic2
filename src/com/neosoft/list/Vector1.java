package com.neosoft.list;

import java.util.Collections;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector();
		v.addElement(121);
		v.addElement(342);
		v.addElement(222);
		v.addElement(125);
		v.addElement(100);
		for(Integer i:v) {
			System.out.println(i);
		}
		Collections.sort(v);
		System.out.println(v);
		v.removeElement(342);
		System.out.println(v);
		v.removeElementAt(2);
		System.out.println(v);
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.elementAt(1));
	}
}
