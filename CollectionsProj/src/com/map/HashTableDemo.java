package com.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo
{
//HasTable is synchronized, thread safe, slow, doesn't allow null key
	
	//multiple thread, go for table
	
	public static void main(String[] args) 
	{
	//	Map <String, String> m=new Hashtable<>();
		
		Hashtable <String, String> m=new Hashtable<>();
		m.put("fruit", "mango");
		m.put("flower", "rose");
		m.put("drink", "water");
		m.put("food", "pizza");
		m.put("drink", "applejuice");
		
		System.out.println(m);
		
		
	}

}
