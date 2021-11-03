package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortReverse {

	public static void main(String[] args) 
	{
		List<Integer> values=new ArrayList<Integer>();
		values.add(2);
		values.add(44);
		values.add(0);
		values.add(-5);
		values.add(7);
		values.add(65);
		
		Collections.sort(values);
		Collections.reverse(values);
		
		for(int x:values)
		{
			System.out.println(x);
		}
		
	}
	
}
