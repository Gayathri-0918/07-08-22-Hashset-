package Hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class CloneElements {

	public static void main(String[] args) 
	{
		HashSet<String> h_set = new HashSet<String>();
		  
		          h_set.add("Red");
		          h_set.add("Green");
		          h_set.add("Black");
		          h_set.add("White");
		          h_set.add("Pink");
		          h_set.add("Yellow");
		    System.out.println("Original Hash Set: " + h_set);
		    HashSet<String> new_h_set = (HashSet<String>) h_set.clone();
		    System.out.println("New hash set"+new_h_set);

	}

}
