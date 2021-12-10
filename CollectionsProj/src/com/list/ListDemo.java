package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo 
{
	public static void main(String[] args)
	{
		List<String> list=new ArrayList<>();
		list.add("hello");
		list.add("");
		list.add("hello");
		list.add("hello1");

		System.out.println(list);
		
		list.add("hello2");
		list.add(null);		
		System.out.println(list);
		
		//allows duplicate & null elements;
		//follows order(index based)--maintains insertion order
		
		System.out.println(list.get(2));
		System.out.println(list.get(4));
		
		
		
		
		
		
		
	}
}
