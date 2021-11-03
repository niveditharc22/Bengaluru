package com.list;

import java.util.*;

//removeAll, clear (addFirst isn't possible in ArrayList
public class RemoveElements {

	public static void main(String[] args)
	{
		List <String> flower=new ArrayList<>();
		flower.add("rose");
		flower.add("sunflower");
		flower.add("lilly");
		flower.add("parijata");
	
		
		System.out.println(flower);
		
		flower.remove(2);
		//flower.remove("lilly");  //overloaded remove methods
		
		System.out.println(flower);
		
		List <String> Subflower=new ArrayList<>();
		Subflower.add("rose");
		Subflower.add("parijata");
		
		flower.removeAll(Subflower);
		System.out.println(flower);
		
		flower.clear();
		System.out.println(flower);
		
		
		
		
		
		
	}

}
