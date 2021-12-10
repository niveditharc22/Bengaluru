package com.set;

import java.util.HashSet;
import java.util.Set;

public class RemoveElements {

	public static void main(String[] args) {
		Set <Integer> num=new HashSet<>();
		
		num.add(2);
		num.add(3);
		num.add(1);
		num.add(77);
		num.add(4535);
		num.add(343444);
		num.add(33);
		num.add(22);
		num.add(4);
		num.add(0);
		
		//remove method
		
		boolean result=num.remove(1);		
		System.out.println(result);		
		System.out.println(num);
		
		//using Remove all
		
		Set <Integer> numEven=new HashSet<>();
		
		numEven.add(2);
		numEven.add(4);	
		numEven.add(22);
		
		num.removeAll(numEven);
		
		System.out.println(num);
		
		//clear
		
		num.clear();
		System.out.println(num);
		
	}

}
