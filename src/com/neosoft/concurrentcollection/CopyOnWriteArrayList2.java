package com.neosoft.concurrentcollection;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList2 extends Thread {

	static CopyOnWriteArrayList<Integer> al=new CopyOnWriteArrayList<>();
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("child thread update");
		al.add(13);
	}
	public static void main(String[] args) throws InterruptedException {
		al.add(11);
		al.add(12);
		CopyOnWriteArrayList2 ch1=new CopyOnWriteArrayList2();
		ch1.start();
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			Integer key=(Integer)itr.next();
			System.out.println("Iterating:"+key);
			Thread.sleep(2000);
		}
		System.out.println(al);
	}
}


