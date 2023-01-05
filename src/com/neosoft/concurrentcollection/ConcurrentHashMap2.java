package com.neosoft.concurrentcollection;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;



public class ConcurrentHashMap2 extends Thread{
	static ConcurrentHashMap<Integer, String> ch=new ConcurrentHashMap();
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("child thread update");
		ch.put(13, "Anchal");
	}
	public static void main(String[] args) throws InterruptedException {
		ch.put(11, "Riddhi");
		ch.put(12, "Kajal");
		ConcurrentHashMap2 ch1=new ConcurrentHashMap2();
		ch1.start();
		Set<Integer> s=ch.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Integer key=(Integer)itr.next();
			System.out.println("Iterating:"+key);
			Thread.sleep(2000);
		}
		System.out.println(ch);
	}
}
