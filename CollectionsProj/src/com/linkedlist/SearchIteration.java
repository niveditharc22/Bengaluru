package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

//duplicate and null is allowed
public class SearchIteration {

	public static void main(String[] args) {
		LinkedList<String> food=new LinkedList<String>();
	
		food.add("pizzaa");	
		food.add("noodles");
		food.add("salad");
		food.add("salad");
		food.add("salad");
		food.add("pasta");
		food.add("null");
		food.add("burger");
		food.add("taco");
		
		System.out.println(food);
		
	System.out.println(	food.contains("pizza"));
		
	System.out.println(food.indexOf("taco"));
	//there is no first index of ();
	System.out.println(food.lastIndexOf("salad"));
	
	//iterator
	Iterator<String>it=food.iterator();
	while(it.hasNext())
	{
		String f=(String) it.next();
		System.out.println(f);
	}
	//foreach
	food.forEach((element)->System.out.println(element));
	
	//for each advanced loop 
	for(String s:food)
	{
		System.out.println(s);
	}
	
	for(int i=0;i<food.size();i++)
	{
		System.out.println(food.get(i));
	}
	
	}

}
