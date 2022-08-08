package Hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetTotreeset {

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
   Set<String> tree_set = new TreeSet<String>(h_set);
   System.out.println("TreeSet elements: ");
   for(String element : tree_set)
   {
      System.out.println(element);

	}

}
}
