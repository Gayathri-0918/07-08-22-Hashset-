package Hashset;
import java.util.*;

public class ClearElements {

	public static void main(String[] args) 
	{
		HashSet<String> h_set = new HashSet<String>();
	     
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        System.out.println("set"+h_set);
        h_set.clear();
        System.out.println("clear set"+h_set);

	}

}
