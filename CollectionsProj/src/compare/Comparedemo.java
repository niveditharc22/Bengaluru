package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
//telusko YT 
public class Comparedemo 
{

	public static void main(String[] args) 
	{
		List<Integer> values=new ArrayList<Integer>();
		values.add(241);
		values.add(445);
		values.add(544);
		values.add(232);
		values.add(883);
		values.add(129);
		
		Comparator<Integer> comp= new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				
				if(o1%100>o2%100)
				{
					return 1;
				}
				else
				{
					return -1;
				}
				
			}
		};
		
		
		Collections.sort(values, comp );
	
		
		for(int x:values)
		{
			System.out.println(x);
		}
		
		
		
	}

}
