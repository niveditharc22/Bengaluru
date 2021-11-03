package com.set;

import java.util.*;  


//Duplicate not allowed, Null is allowed, In the ORDER of alphabets/increasing numbers

class TreSet{  
	
 public static void main(String args[])
 {  
	 
 // Set<String> al=new TreeSet<String>(); 
   Set<Integer> al=new TreeSet<Integer>(); 
  
 // al.add("rachel");  
//  al.add("joey");  
 // al.add("will");  
 // al.add("samanta");  
//  al.add("will");  
 // al.add("");  
  
  al.add(1);  
  al.add(33);  
  al.add(0);  
  al.add(4);  
  al.add(33);  
  al.add(-3); 
  
  
  System.out.println(al);   
  
 }

 
 
}  