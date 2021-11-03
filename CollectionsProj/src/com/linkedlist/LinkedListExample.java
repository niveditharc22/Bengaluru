package com.linkedlist;

import java.util.LinkedList;


public class LinkedListExample 
{
	//addFirst(),addLast() comes from deque interface (since LL implements Deque interface)
	public static void main(String args[])
	{
		LinkedList<String> food=new LinkedList<String>();
		food.add("pizza");
		food.add("burger");
		food.add("taco");
		food.add("noodles");
		
		
		System.out.println(food);
		
		//adding element at a specific position
		
		food.add(2, "pancake");
		System.out.println(food);
		 
		food.addFirst("lasagne");
		food.addLast("burrito");
		System.out.println(food);
		
	}
	
	
}
