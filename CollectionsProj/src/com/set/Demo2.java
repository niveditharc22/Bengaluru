package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//HashSet internally uses HashMap to store the elements
public class Demo2 {

	public static void main(String[] args) {
	//	Set <String> food=new HashSet<>();
		List <String> food=new ArrayList<>();
		
		food.add("pizza");
		food.add("burger");
		food.add("taco");
		food.add("noodles");
		food.add("salad");
		food.add("pasta");
		
		Set <String> foodFinal=new HashSet<>(food);
	
	//	System.out.println(foodFinal);
		
	//	Set <String> food2=new HashSet<>();
		List <String> food2=new ArrayList<>();
		
		food2.add("maggi");
		food2.add("roti");
		food2.add("idly");
		food2.add("upma");
		
		foodFinal.addAll(food2);
		
		System.out.println(foodFinal);

	}

}
