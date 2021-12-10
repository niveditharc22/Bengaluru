package com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Iterate {

	public static void main(String[] args) {
		Map <String,Integer> num= new HashMap<>();
		
		num.put("one", 10);
		num.put("two", 10);
		num.put("three", 30);
		num.put("four", 40);
		num.put(null, 70);
		
	//for each method
	for(Map.Entry<String, Integer> entry: num.entrySet())
	{
		System.out.println("key->"+entry.getKey()+"value->"+entry.getValue());
	}
		
		
		
		
		
		
		
		
		
		
	}

}
