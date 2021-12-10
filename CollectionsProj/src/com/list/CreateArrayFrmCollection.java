package com.list;

import java.util.ArrayList;
import java.util.List;

//create arraylist from collection example

public class CreateArrayFrmCollection {

	public static void main(String[] args) {

		List <Integer>num=new ArrayList<>();
		num.add(2);
		num.add(3);
		num.add(5);
		num.add(7);
		num.add(11);
		
		//passing list to the arraylist constructor
		List<Integer> num1=new ArrayList<>(num);
		
		List<Integer> num2=new ArrayList<>();
		num2.add(13);
		num2.add(17);
		num2.add(19);
		num2.add(23);
		num2.add(29);
		
		num1.addAll(num2);
		
		System.out.println(num1);
	}

}
