package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterate {
	public static void main(String[] args) 
		{
			Set <String> city=new HashSet<>();	
			city.add("Mandya");
			city.add("hassan");
			city.add("udupi");
			city.add("tumkur");
			city.add("hubli");
			city.add("kolar");
			
		//enhanced for loop
		for(String s:city)	
		{
			System.out.println(s);
		}
		//basic loop with iterator
		for(Iterator<String> iterator=city.iterator(); iterator.hasNext();)
		{
			String city1=(String) iterator.next();
			System.out.println(city);
		}
		
		//while loop with iterator

	}

}
