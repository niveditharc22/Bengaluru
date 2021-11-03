package com.list;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArray {
	public static void main(String[] args)
	{
		List <String> lang=new ArrayList<>();
		
		System.out.println("is it empty? " + lang.isEmpty());
		
		lang.add("java");
		lang.add("python");
		lang.add("php");
		
		System.out.println("top "+lang.size()+ " programming languages in India");
		
		//retrieve element at a given index
		String bestLanguage=lang.get(0);
		
		System.out.println("best language "+ bestLanguage);
		
		//System.out.println("Best lang "+lang.get(0));
		
		//modify element at a given index
		lang.set(2, ".Net");
		
		System.out.println(lang);
	
		
	}
}
