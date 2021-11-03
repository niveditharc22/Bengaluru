package com.set;

import java.util.HashSet;
import java.util.Set;

//Duplicate not allowed, Null is allowed, NOT in order of insertion

public class Hashsett {

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
		
		
		Set <Integer> set=new HashSet<Integer>();
		
		set.add(-23);
		set.add(66);
		set.add(5);
		set.add(5);
		set.add(null);
		set.add(-8);
		set.add(0);
		set.add(1);
		//set.add(5);
		System.out.println(set);
	}

}
