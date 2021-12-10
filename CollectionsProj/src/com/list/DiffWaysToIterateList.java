package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class DiffWaysToIterateList {

	public static void main(String[] args) {	
		List <String> course=Arrays.asList("c","java","python","php");
		
		//Basic for loop
		for(int i=0;i<course.size();i++)
		{
			System.out.println(course.get(i));
		}
		
		//Enhanced for each loop
		for(String s:course)
		{
			System.out.println(s);
		}
		
		// iterator with while loop
		
	Iterator<String> it=course.iterator();
		
	while(it.hasNext())
	{
		String c=(String)it.next();
			System.out.println(c);
	}
		
		
	}
}
	
