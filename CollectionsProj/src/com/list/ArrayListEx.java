package com.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {

	List<String> fruit=new ArrayList<>();	
		fruit.add("guava");
		fruit.add("banana");
		fruit.add("watermelon");
		fruit.add("orange");
		
		System.out.println(fruit);
		
	}

}

//Vector: increase capacity by 100%; (wastes memory), thread safe (theoritically, not practically so slow)
//ArrayList:Increase capacity by 50%;