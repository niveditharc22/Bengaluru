package compare;

import java.util.Comparator;

//extra class.. if we wanna write in diff class
public class CompareImp implements Comparator<Integer>

{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		if(o1%100>o2%100)
		
			return 1;
			
		return -1;
		
		
	}
	
	
	
}
