package com.neosoft.map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static void main(String[] args) {
		 Map<Integer, String> map = new HashMap<>();
		    map.put(1, "Riddhi");
		    map.put(2, "Kajal");
		    map.put(3, "Anchal");
		    System.out.println(map);
		    System.out.println(map.get(2));
			System.out.println(map.containsKey(5));
			System.out.println(map.containsValue("Riddhi"));
			System.out.println(map.size());
			System.out.println(map.isEmpty());
			System.out.println(map.keySet());
			map.entrySet().forEach((item->item.getKey()));
			System.out.println(map.values());
	}
}
