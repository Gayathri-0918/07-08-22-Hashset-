package Hashset;
import java.util.*;

public class Retaintwostrings {

	public static void main(String[] args) 
	{
		HashSet<String> h_set = new HashSet<String>();
	     
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        System.out.println("The first set"+h_set);
        
        HashSet<String> h_set2 = new HashSet<String>();
	    h_set2.add("yellow");
        h_set2.add("Green");
        h_set2.add("orange");
        h_set2.add("White");
        System.out.println("The second set"+h_set2);
        h_set.retainAll(h_set2);
        System.out.println("Retain set"+h_set);

	}

}
