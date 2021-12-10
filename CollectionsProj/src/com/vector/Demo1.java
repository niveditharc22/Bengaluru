package com.vector;

import java.util.Vector;

public class Demo1 {

	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add("ww");
		v.add("qs");
		v.add(3);
		v.add(6);
		v.add(null);
				
		System.out.println(v.capacity());
		System.out.println(v.size());
		
		//vector doubles the capacity.. 10,20,40.....
		
		for(Object o:v) {
			System.out.println(o);
		}
		
		v.remove("qs");
		
		System.out.println(v);
		
	}
}
//Vector: increase capacity by 100%;
//ArrayList:Increase capacity by 50%;