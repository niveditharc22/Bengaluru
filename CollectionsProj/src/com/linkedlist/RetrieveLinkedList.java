package com.linkedlist;

import java.util.LinkedList;


public class RetrieveLinkedList {

	public static void main(String[] args)
	{
		LinkedList<String> food=new LinkedList<String>();
		food.add("pizza");
		food.add("burger");
		food.add("taco");
		food.add("noodles");
		
		System.out.println(food.get(1));
		
		System.out.println("First food: "+food.getFirst());
//		System.out.println(food.getLast());
		
		String foodlist=food.getLast();
		System.out.println("last food: "+foodlist);
		System.out.println("--------");
		
		for(String s:food)
		{
			System.out.println(s);
		}
		System.out.println("--------");
		
		for(int i=0;i<food.size();i++)
		{
			System.out.println(food.get(i));
		}
		
		
	}

}
