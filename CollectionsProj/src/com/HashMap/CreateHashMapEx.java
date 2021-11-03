package com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class CreateHashMapEx {

	public static void main(String[] args) {
		//example to map numbers to string
		Map<String, Integer> num=new HashMap<>();
		
		//add key-value pair
		num.put("one", 10);
		num.put("two", 10);
		num.put("three", 30);
		num.put("four", 40);
		num.put(null, 70);
		num.put(null, 20);
		num.put("four", 400);
		
		System.out.println(num);
		//check if hashmap is empty
		System.out.println(num.isEmpty());
		
		System.out.println(num.size());
		
		//check if key exists in HahMap
		if(num.containsKey("four"))  //this is key 
		{
			System.out.println("yess");
		}
		else {
			System.out.println("no");
		}
		
		if(num.containsValue(20))  //this is value
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		//get value by key
		Integer v1 =num.get("three");
		System.out.println(num.get("one")); //or
		System.out.println(num.get("four"));
		
		//how to remove keys
		
		num.remove("one");
		System.out.println(num);
		
		//get only keys/only values
		System.out.println(num.keySet());	
		System.out.println(num.values());
		
	}

}
