package com.set;


import java.util.LinkedHashSet;
import java.util.Set;

//Duplicate not allowed, Null is allowed, In the ORDER of insertion

public class LinkdHashSet  {

	public static void main(String[] args) 
	{
		/*Set <String> set=new HashSet<String>();
	
		set.add("orange");
		set.add("orange");
		set.add("kiwi7");
		set.add("kiwi2");
		set.add("tree");
		set.add("pine");
		
		System.out.println(set);
		
		set.add(null);
		
		System.out.println(set); */
		
		
		Set <Integer> set=new LinkedHashSet<Integer>();
		
		set.add(-23);
		set.add(66);
		set.add(5);
		set.add(null);
		set.add(-8);
		set.add(0);
		set.add(0);
		set.add(66);
		set.add(66);
		set.add(6);	
		set.add(null);
		
		//set.add(5);
		System.out.println(set);
	}

}

