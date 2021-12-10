package com.linkedlist;

import java.util.LinkedList;

public class RemoveElements {

	public static void main(String[] args) {
		LinkedList<String> food=new LinkedList<String>();
		
		food.add("pizza");
		food.add("burger");
		food.add("taco");
		food.add("noodles");
		food.add("salad");
		food.add("pasta");
		
		System.out.println(food);
		
	//	String foodlist=food.removeFirst();
		
	//	System.out.println(food);
	
	//OR	
		
		System.out.println(food.removeLast());
		System.out.println(food);
		
		food.remove(3);
		food.remove("salad");
		System.out.println(food);
		
		food.clear();
		System.out.println(food);
		
	}

}
