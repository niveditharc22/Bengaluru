package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		//HasMap is synchronized, not thread safe, fast, allows one null key
		//single thread, go for map
		Map<String,String> m=new HashMap<>();
		m.put("fruit", "mango");
		m.put("flower", "rose");
		m.put("drink", "water");
		m.put("food", "pizza");
		m.put("drink", "applejuice");
		
		System.out.println(m);
		
		Set<String> keys=m.keySet();
		
		for(String key:keys) 
		{
			System.out.println(key+" "+m.get(key));
		}
		
		
	}

}
