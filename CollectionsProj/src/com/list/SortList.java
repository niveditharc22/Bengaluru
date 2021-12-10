package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
	public static void main(String[] args) {
/*	List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(40);
		list.add(30);
		list.add(20); */
		
//		Collections.sort(list);
//		System.out.println(list); //ascending
		
//		Collections.reverse(list);
//		System.out.println(list);  //descending
		
		List<Employee> employee=new ArrayList<Employee>();
		employee.add(new Employee(10,"latha",26,35000));
		employee.add(new Employee(15,"rutha",37,95000));
		employee.add(new Employee(21,"lava",29,67000));
		employee.add(new Employee(13,"suma",33,88000));
	
		
		Collections.sort(employee, new Mysort()); //descending
		System.out.println(employee);
	}
}

class Mysort implements Comparator<Employee>
{
	
/*	public int compare(Employee o1, Employee o2) //ascending
	{
		return(int) (o1.getAge()-o2.getAge());
	} */
	
	public int compare(Employee o1, Employee o2) //descending
	{
		return(int) (o2.getAge()-o1.getAge());
	}
	
}






