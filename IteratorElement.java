package Hashset;

import java.util.ArrayList;
import java.util.List;

public class IteratorElement {

	public static void main(String[] args)
	{
		List<String> h_set=new ArrayList<String>();
		 h_set.add("Red");
         h_set.add("Green");
         h_set.add("Black");
         h_set.add("White");
         h_set.add("Pink");
         h_set.add("Yellow");

		for(String element:h_set) 
		{
			System.out.println(element);
			
		}

	}

}
