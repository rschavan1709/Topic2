package com.neosoft.list;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(121);
		s.push(100);
		s.push(80);
		s.push(150);
		s.push(125);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.empty());
		System.out.println(s.search(80));
	}
}
