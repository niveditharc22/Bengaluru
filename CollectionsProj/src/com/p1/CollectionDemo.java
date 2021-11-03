package com.p1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {

		Collection<String> fruitcollection=new ArrayList<String>(); 
		fruitcollection.add("mango");
		fruitcollection.add("apple");
		fruitcollection.add("kiwi2");
		System.out.println(fruitcollection);
		
		fruitcollection.remove("mango");
		System.out.println(fruitcollection);
		
		System.out.println(fruitcollection.contains("apple"));
		
		fruitcollection.forEach((somename)->
		{
			System.out.println(somename);
		});
		//element is usually used.
		
		fruitcollection.clear();
		System.out.println(fruitcollection);
	}

}
